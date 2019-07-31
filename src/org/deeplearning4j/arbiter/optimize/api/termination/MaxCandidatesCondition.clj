(ns org.deeplearning4j.arbiter.optimize.api.termination.MaxCandidatesCondition
  "Terminate hyperparameter search when the total number
 of candidates exceeds a specified value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.termination MaxCandidatesCondition]))

(defn ->max-candidates-condition
  "Constructor."
  (^MaxCandidatesCondition []
    (new MaxCandidatesCondition )))

(defn initialize
  "Description copied from interface: TerminationCondition

  optimization-runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^MaxCandidatesCondition this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner optimization-runner]
    (-> this (.initialize optimization-runner))))

(defn terminate
  "Description copied from interface: TerminationCondition

  optimization-runner - Optimization runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`

  returns: true if learning should be terminated, false otherwise - `boolean`"
  (^Boolean [^MaxCandidatesCondition this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner optimization-runner]
    (-> this (.terminate optimization-runner))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MaxCandidatesCondition this]
    (-> this (.toString))))

