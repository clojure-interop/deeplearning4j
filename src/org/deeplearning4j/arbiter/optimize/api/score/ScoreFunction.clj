(ns org.deeplearning4j.arbiter.optimize.api.score.ScoreFunction
  "ScoreFunction defines the objective of hyperparameter optimization.
 Specifically, it is used to calculate a score for a given model, relative to the data set provided
 in the configuration."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.score ScoreFunction]))

(defn score
  "Calculate and return the score, for the given model and data provider

  model - Model to score - `java.lang.Object`
  data-provider - Data provider - data to use - `org.deeplearning4j.arbiter.optimize.api.data.DataProvider`
  data-parameters - Parameters for data - `java.util.Map`

  returns: Calculated score - `double`"
  (^Double [^ScoreFunction this ^java.lang.Object model ^org.deeplearning4j.arbiter.optimize.api.data.DataProvider data-provider ^java.util.Map data-parameters]
    (-> this (.score model data-provider data-parameters))))

(defn minimize
  "Should this score function be minimized or maximized?

  returns: true if score should be minimized, false if score should be maximized - `boolean`"
  (^Boolean [^ScoreFunction this]
    (-> this (.minimize))))

(defn get-supported-model-types
  "returns: The model types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ScoreFunction this]
    (-> this (.getSupportedModelTypes))))

(defn get-supported-data-types
  "returns: The data types supported by this class - `java.util.List<java.lang.Class<?>>`"
  (^java.util.List [^ScoreFunction this]
    (-> this (.getSupportedDataTypes))))

