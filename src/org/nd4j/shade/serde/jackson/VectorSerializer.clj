(ns org.nd4j.shade.serde.jackson.VectorSerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.shade.serde.jackson VectorSerializer]))

(defn ->vector-serializer
  "Constructor."
  (^VectorSerializer []
    (new VectorSerializer )))

(defn serialize
  "ind-array - `org.nd4j.linalg.api.ndarray.INDArray`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^VectorSerializer this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize ind-array json-generator serializer-provider))))

