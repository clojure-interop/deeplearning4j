(ns org.deeplearning4j.eval.serde.ConfusionMatrixDeserializer
  "A JSON deserializer for ConfusionMatrix<Integer> instances, used in Evaluation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.serde ConfusionMatrixDeserializer]))

(defn ->confusion-matrix-deserializer
  "Constructor."
  (^ConfusionMatrixDeserializer []
    (new ConfusionMatrixDeserializer )))

(defn deserialize
  "jp - `org.nd4j.shade.jackson.core.JsonParser`
  ctxt - `org.nd4j.shade.jackson.databind.DeserializationContext`

  returns: `org.deeplearning4j.eval.ConfusionMatrix<java.lang.Integer>`

  throws: java.io.IOException"
  (^org.deeplearning4j.eval.ConfusionMatrix [^ConfusionMatrixDeserializer this ^org.nd4j.shade.jackson.core.JsonParser jp ^org.nd4j.shade.jackson.databind.DeserializationContext ctxt]
    (-> this (.deserialize jp ctxt))))

