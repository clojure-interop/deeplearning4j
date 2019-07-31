(ns org.nd4j.serde.json.BaseLegacyDeserializer
  "A base deserialization class used to handle deserializing of a specific class given changes from subtype wrapper
 format to class field format.
 That is: from...
 {@code @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.WRAPPER_OBJECT)}
 {@code @JsonSubTypes(value = {@JsonSubTypes.Type(value = LossBinaryXENT.class, name = \"BinaryXENT\"),}...}

 to

 {@code @JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = \"@class\")}"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.serde.json BaseLegacyDeserializer]))

(defn ->base-legacy-deserializer
  "Constructor."
  (^BaseLegacyDeserializer []
    (new BaseLegacyDeserializer )))

(defn get-legacy-names-map
  "returns: `java.util.Map<java.lang.String,java.lang.String>`"
  (^java.util.Map [^BaseLegacyDeserializer this]
    (-> this (.getLegacyNamesMap))))

(defn get-legacy-json-mapper
  "returns: `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper [^BaseLegacyDeserializer this]
    (-> this (.getLegacyJsonMapper))))

(defn get-deserialized-type
  "returns: `java.lang.Class<?>`"
  (^java.lang.Class [^BaseLegacyDeserializer this]
    (-> this (.getDeserializedType))))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `T`

  throws: java.io.IOException"
  ([^BaseLegacyDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize jp deserialization-context))))

