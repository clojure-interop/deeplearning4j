(ns org.nd4j.linalg.lossfunctions.serde.RowVectorDeserializer
  "Simple JSON deserializer for use in ILossFunction loss function weight serialization.
 Used in conjunction with RowVectorSerializer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.serde RowVectorDeserializer]))

(defn ->row-vector-deserializer
  "Constructor."
  (^RowVectorDeserializer []
    (new RowVectorDeserializer )))

(defn deserialize
  "json-parser - `org.nd4j.shade.jackson.core.JsonParser`
  deserialization-context - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`

  throws: java.io.IOException"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RowVectorDeserializer this ^org.nd4j.shade.jackson.core.JsonParser json-parser ^org.nd4j.shade.jackson.databind.DeserializationContext deserialization-context]
    (-> this (.deserialize json-parser deserialization-context))))

