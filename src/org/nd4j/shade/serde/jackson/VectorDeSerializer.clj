(ns org.nd4j.shade.serde.jackson.VectorDeSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.shade.serde.jackson VectorDeSerializer]))

(defn ->vector-de-serializer
  "Constructor."
  (^VectorDeSerializer []
    (new VectorDeSerializer )))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^VectorDeSerializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize jp deserialization-context))))

