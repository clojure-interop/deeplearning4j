(ns org.deeplearning4j.nn.conf.serde.ComputationGraphConfigurationDeserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.serde ComputationGraphConfigurationDeserializer]))

(defn ->computation-graph-configuration-deserializer
  "Constructor.

  default-deserializer - `org.nd4j.shade.jackson.databind.JsonDeserializer`"
  (^ComputationGraphConfigurationDeserializer [^org.nd4j.shade.jackson.databind.JsonDeserializer default-deserializer]
    (new ComputationGraphConfigurationDeserializer default-deserializer)))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^ComputationGraphConfigurationDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.deserialize jp ctxt))))

