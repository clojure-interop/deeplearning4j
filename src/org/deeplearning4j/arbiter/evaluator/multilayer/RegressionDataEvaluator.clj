(ns org.deeplearning4j.arbiter.evaluator.multilayer.RegressionDataEvaluator
  "Created by agibsonccc on 3/12/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.evaluator.multilayer RegressionDataEvaluator]))

(defn ->regression-data-evaluator
  "Constructor."
  (^RegressionDataEvaluator []
    (new RegressionDataEvaluator )))

(defn evaluate-model
  "model - `java.lang.Object`
  data-provider - `org.deeplearning4j.arbiter.optimize.api.data.DataProvider`

  returns: `java.lang.Double`"
  (^java.lang.Double [^RegressionDataEvaluator this ^java.lang.Object model ^org.deeplearning4j.arbiter.optimize.api.data.DataProvider data-provider]
    (-> this (.evaluateModel model data-provider))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^RegressionDataEvaluator this]
    (-> this (.getSupportedModelTypes))))

(defn get-supported-data-types
  "returns: The datatypes supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^RegressionDataEvaluator this]
    (-> this (.getSupportedDataTypes))))

