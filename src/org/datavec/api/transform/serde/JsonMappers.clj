(ns org.datavec.api.transform.serde.JsonMappers
  "JSON mappers for deserializing neural net configurations, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.serde JsonMappers]))

(defn ->json-mappers
  "Constructor."
  (^JsonMappers []
    (new JsonMappers )))

(defn *-custom-registration-property
  "Static Field.

  This system property is provided as an alternative to registerLegacyCustomClassesForJSON(Class[])
  Classes can be specified in comma-separated format

  type: java.lang.String"
  []
  JsonMappers/CUSTOM_REGISTRATION_PROPERTY)

(defn *register-legacy-custom-classes-for-json
  "Register a set of classes (Transform, Filter, etc) for JSON deserialization.

  This is required ONLY when BOTH of the following conditions are met:
  1. You want to load a serialized TransformProcess, saved in 1.0.0-alpha or before, AND
  2. The serialized TransformProcess has a custom Transform, Filter, etc (i.e., one not defined in DL4J)

  By passing the classes of these custom classes here, DataVec should be able to deserialize them, in spite of the JSON
  format change between versions.

  classes - Classes to register - `java.lang.Class`"
  ([^java.lang.Class classes]
    (JsonMappers/registerLegacyCustomClassesForJSON classes)))

(defn *register-legacy-custom-classes-for-json-list
  "classes - `java.util.List`"
  ([^java.util.List classes]
    (JsonMappers/registerLegacyCustomClassesForJSONList classes)))

(defn *get-legacy-mapper-for
  "Get the legacy JSON mapper for the specified class.
  NOTE: This is intended for internal backward-compatibility use.
  Note to developers: The following JSON mappers are for handling legacy format JSON.
  Note that after 1.0.0-alpha, the JSON subtype format for Transforms, Filters, Conditions etc were changed from
  a wrapper object, to an \"@class\" field. However, to not break all saved transforms networks, these mappers are
  part of the solution.

  How legacy loading works (same pattern for all types - Transform, Filter, Condition etc)
  1. Transforms etc JSON that has a \"@class\" field are deserialized as normal
  2. Transforms JSON that don't have such a field are mapped (via Layer @JsonTypeInfo) to LegacyMappingHelper.TransformHelper
  3. LegacyMappingHelper.TransformHelper has a @JsonDeserialize annotation - we use LegacyMappingHelper.LegacyTransformDeserializer to handle it
  4. LegacyTransformDeserializer has a list of old names (present in the legacy format JSON) and the corresponding class names
  5. BaseLegacyDeserializer (that LegacyTransformDeserializer extends) does a lookup and handles the deserialization
  Now, as to why we have one ObjectMapper for each type: We can't use the default JSON mapper for the legacy format,
  as it'll fail due to not having the expected \"@class\" annotation.
  Consequently, we need to tell Jackson to ignore that specific annotation and deserialize to the specified
  class anyway. The ignoring is done via an annotation introspector, defined below in this class.
  However, we can't just use a single annotation introspector (and hence ObjectMapper) for loading legacy values of
  all types - if we did, then any nested types would fail (i.e., an Condition in a Transform - the Transform couldn't
  be deserialized correctly, as the annotation would be ignored).

  clazz - `java.lang.Class`

  returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^java.lang.Class clazz]
    (JsonMappers/getLegacyMapperFor clazz)))

(defn *get-mapper
  "returns: The default/primary ObjectMapper for deserializing JSON network configurations in DL4J - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (JsonMappers/getMapper )))

(defn *get-mapper-yaml
  "returns: The default/primary ObjectMapper for deserializing network configurations in DL4J (YAML format) - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (JsonMappers/getMapperYaml )))

