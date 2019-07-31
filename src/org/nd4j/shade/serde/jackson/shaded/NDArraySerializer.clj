(ns org.nd4j.shade.serde.jackson.shaded.NDArraySerializer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.shade.serde.jackson.shaded NDArraySerializer]))

(defn ->nd-array-serializer
  "Constructor."
  (^NDArraySerializer []
    (new NDArraySerializer )))

(defn serialize
  "ind-array - `org.nd4j.linalg.api.ndarray.INDArray`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^NDArraySerializer this ^org.nd4j.linalg.api.ndarray.INDArray ind-array ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize ind-array json-generator serializer-provider))))

