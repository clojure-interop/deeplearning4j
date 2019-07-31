(ns org.nd4j.shade.serde.jackson.ndarray.NDArrayDeSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.shade.serde.jackson.ndarray NDArrayDeSerializer]))

(defn ->nd-array-de-serializer
  "Constructor."
  (^NDArrayDeSerializer []
    (new NDArrayDeSerializer )))

(defn deserialize
  "jp - `com.fasterxml.jackson.core.JsonParser`
  deserialization-context - `com.fasterxml.jackson.databind.DeserializationContext`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayDeSerializer this ^com.fasterxml.jackson.core.JsonParser jp ^com.fasterxml.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize jp deserialization-context))))

