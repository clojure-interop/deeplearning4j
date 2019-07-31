(ns org.deeplearning4j.nn.conf.serde.MultiLayerConfigurationDeserializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.serde MultiLayerConfigurationDeserializer]))

(defn ->multi-layer-configuration-deserializer
  "Constructor.

  default-deserializer - `org.nd4j.shade.jackson.databind.JsonDeserializer`"
  (^MultiLayerConfigurationDeserializer [^org.nd4j.shade.jackson.databind.JsonDeserializer default-deserializer]
    (new MultiLayerConfigurationDeserializer default-deserializer)))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`

  throws: java.io.IOException"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^MultiLayerConfigurationDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.deserialize jp ctxt))))

