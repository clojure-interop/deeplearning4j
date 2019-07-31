(ns org.deeplearning4j.nn.conf.serde.BaseNetConfigDeserializer
  "A custom (abstract) deserializer that handles backward compatibility (currently only for updater refactoring that
 happened after 0.8.0). This is used for both MultiLayerConfiguration and ComputationGraphConfiguration.
 We deserialize the config using the default deserializer, then handle the new IUpdater (which will be null for
 0.8.0 and earlier configs) if necessary
 Overall design: http://stackoverflow.com/questions/18313323/how-do-i-call-the-default-deserializer-from-a-custom-deserializer-in-jackson"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.serde BaseNetConfigDeserializer]))

(defn ->base-net-config-deserializer
  "Constructor.

  default-deserializer - `org.nd4j.shade.jackson.databind.JsonDeserializer`
  deserialized-type - `java.lang.Class`"
  (^BaseNetConfigDeserializer [^org.nd4j.shade.jackson.databind.JsonDeserializer default-deserializer ^java.lang.Class deserialized-type]
    (new BaseNetConfigDeserializer default-deserializer deserialized-type)))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `T`

  throws: java.io.IOException"
  ([^BaseNetConfigDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.deserialize jp ctxt))))

(defn resolve
  "ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  throws: org.nd4j.shade.jackson.databind.JsonMappingException"
  ([^BaseNetConfigDeserializer this ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.resolve ctxt))))

