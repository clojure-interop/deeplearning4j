(ns org.deeplearning4j.arbiter.evaluator.multilayer.ClassificationEvaluator
  "A model evaluator for doing additional
 evaluation (classification evaluation)
 for a MultiLayerNetwork given a DataSetIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.evaluator.multilayer ClassificationEvaluator]))

(defn ->classification-evaluator
  "Constructor."
  (^ClassificationEvaluator []
    (new ClassificationEvaluator )))

(defn evaluate-model
  "model - `java.lang.Object`
  data-provider - `org.deeplearning4j.arbiter.optimize.api.data.DataProvider`

  returns: `org.deeplearning4j.eval.Evaluation`"
  (^org.deeplearning4j.eval.Evaluation [^ClassificationEvaluator this ^java.lang.Object model ^org.deeplearning4j.arbiter.optimize.api.data.DataProvider data-provider]
    (-> this (.evaluateModel model data-provider))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ClassificationEvaluator this]
    (-> this (.getSupportedModelTypes))))

(defn get-supported-data-types
  "returns: The datatypes supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ClassificationEvaluator this]
    (-> this (.getSupportedDataTypes))))

