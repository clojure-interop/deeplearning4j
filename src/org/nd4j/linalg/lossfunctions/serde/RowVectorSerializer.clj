(ns org.nd4j.linalg.lossfunctions.serde.RowVectorSerializer
  "Simple JSON serializer for use in ILossFunction weight serialization.
 Serializes an INDArray as a double[]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.lossfunctions.serde RowVectorSerializer]))

(defn ->row-vector-serializer
  "Constructor."
  (^RowVectorSerializer []
    (new RowVectorSerializer )))

(defn serialize
  "array - `org.nd4j.linalg.api.ndarray.INDArray`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^RowVectorSerializer this ^org.nd4j.linalg.api.ndarray.INDArray array ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize array json-generator serializer-provider))))

