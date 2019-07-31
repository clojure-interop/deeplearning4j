(ns org.deeplearning4j.arbiter.optimize.serde.jackson.GenericDeserializer
  "Created by Alex on 15/02/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson GenericDeserializer]))

(defn ->generic-deserializer
  "Constructor."
  (^GenericDeserializer []
    (new GenericDeserializer )))

(defn deserialize
  "p - `org.nd4j.shade.jackson.core.JsonParser`
  ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `java.lang.Object`

  throws: java.io.IOException"
  (^java.lang.Object [^GenericDeserializer this ^org.nd4j.shade.jackson.core.JsonParser p ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.deserialize p ctxt))))

