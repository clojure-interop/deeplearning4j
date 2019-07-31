(ns org.deeplearning4j.arbiter.optimize.api.evaluation.ModelEvaluator
  "ModelEvaluator: Used to conduct additional evaluation.
 For example, this may be classification performance on a test set or similar"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.evaluation ModelEvaluator]))

(defn evaluate-model
  "model - `java.lang.Object`
  data-provider - `org.deeplearning4j.arbiter.optimize.api.data.DataProvider`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ModelEvaluator this ^java.lang.Object model ^org.deeplearning4j.arbiter.optimize.api.data.DataProvider data-provider]
    (-> this (.evaluateModel model data-provider))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ModelEvaluator this]
    (-> this (.getSupportedModelTypes))))

(defn get-supported-data-types
  "returns: The datatypes supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ModelEvaluator this]
    (-> this (.getSupportedDataTypes))))

