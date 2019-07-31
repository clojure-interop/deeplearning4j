(ns org.nd4j.shade.serde.jackson.ndarray.NDArraySerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.shade.serde.jackson.ndarray NDArraySerializer]))

(defn ->nd-array-serializer
  "Constructor."
  (^NDArraySerializer []
    (new NDArraySerializer )))

(defn serialize
  "ind-array - `org.nd4j.linalg.api.ndarray.INDArray`
  json-generator - `com.fasterxml.jackson.core.JsonGenerator`
  serializer-provider - `com.fasterxml.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^NDArraySerializer this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^com.fasterxml.jackson.core.JsonGenerator json-generator ^com.fasterxml.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize ind-array json-generator serializer-provider))))

