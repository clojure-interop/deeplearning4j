(ns org.deeplearning4j.eval.serde.ConfusionMatrixSerializer
  "A JSON serializer for ConfusionMatrix<Integer> instances, used in Evaluation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval.serde ConfusionMatrixSerializer]))

(defn ->confusion-matrix-serializer
  "Constructor."
  (^ConfusionMatrixSerializer []
    (new ConfusionMatrixSerializer )))

(defn serialize
  "cm - `org.deeplearning4j.eval.ConfusionMatrix`
  gen - `org.nd4j.shade.jackson.core.JsonGenerator`
  provider - `org.nd4j.shade.jackson.databind.SerializerProvider`

  throws: java.io.IOException"
  ([^ConfusionMatrixSerializer this ^org.deeplearning4j.eval.ConfusionMatrix cm ^org.nd4j.shade.jackson.core.JsonGenerator gen ^org.nd4j.shade.jackson.databind.SerializerProvider provider]
    (-> this (.serialize cm gen provider))))

