(ns org.nd4j.shade.serde.jackson.shaded.NDArrayDeSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.shade.serde.jackson.shaded NDArrayDeSerializer]))

(defn ->nd-array-de-serializer
  "Constructor."
  (^NDArrayDeSerializer []
    (new NDArrayDeSerializer )))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^NDArrayDeSerializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize jp deserialization-context))))

