(ns org.deeplearning4j.arbiter.optimize.serde.jackson.GenericSerializer
  "Created by Alex on 15/02/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.serde.jackson GenericSerializer]))

(defn ->generic-serializer
  "Constructor."
  (^GenericSerializer []
    (new GenericSerializer )))

(defn serialize
  "o - `java.lang.Object`
  j - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^GenericSerializer this ^java.lang.Object o ^org.nd4j.shade.jackson.core.JsonGenerator j ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize o j serializer-provider))))

