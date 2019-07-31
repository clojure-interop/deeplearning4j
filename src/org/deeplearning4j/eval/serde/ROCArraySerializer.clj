(ns org.deeplearning4j.eval.serde.ROCArraySerializer
  "Custom Jackson serializer for ROC[]. Simply delegates to ROCSerializer internally."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.serde ROCArraySerializer]))

(defn ->roc-array-serializer
  "Constructor."
  (^ROCArraySerializer []
    (new ROCArraySerializer )))

(defn serialize
  "rocs - `org.deeplearning4j.eval.ROC[]`
  json-generator - `org.nd4j.shade.jackson.core.JsonGenerator`
  serializer-provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^ROCArraySerializer this rocs ^org.nd4j.shade.jackson.core.JsonGenerator json-generator ^org.nd4j.shade.jackson.databind.SerializerProvider serializer-provider]
    (-> this (.serialize rocs json-generator serializer-provider))))

