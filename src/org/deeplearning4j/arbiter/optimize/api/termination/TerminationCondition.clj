(ns org.deeplearning4j.arbiter.optimize.api.termination.TerminationCondition
  "Global termination condition for conducting hyperparameter optimization.
 Termination conditions are used to determine if/when the optimization should stop."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.termination TerminationCondition]))

(defn initialize
  "Initialize the termination condition (such as starting timers, etc).

  optimization-runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^TerminationCondition this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner optimization-runner]
    (-> this (.initialize optimization-runner))))

(defn terminate
  "Determine whether optimization should be terminated

  optimization-runner - Optimization runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`

  returns: true if learning should be terminated, false otherwise - `boolean`"
  (^Boolean [^TerminationCondition this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner optimization-runner]
    (-> this (.terminate optimization-runner))))

