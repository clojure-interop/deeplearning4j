(ns org.deeplearning4j.nn.conf.serde.JsonMappers
  "JSON mappers for deserializing neural net configurations, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.serde JsonMappers]))

(defn ->json-mappers
  "Constructor."
  (^JsonMappers []
    (new JsonMappers )))

(defn *-custom-registration-property
  "Static Field.

  Deprecated. Use DL4JSystemProperties.CUSTOM_REGISTRATION_PROPERTY

  type: java.lang.String"
  []
  JsonMappers/CUSTOM_REGISTRATION_PROPERTY)

(defn *get-mapper
  "returns: The default/primary ObjectMapper for deserializing JSON network configurations in DL4J - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (JsonMappers/getMapper )))

(defn *get-mapper-yaml
  "returns: The default/primary ObjectMapper for deserializing network configurations in DL4J (YAML format) - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^org.nd4j.shade.jackson.databind.ObjectMapper []
    (JsonMappers/getMapperYaml )))

