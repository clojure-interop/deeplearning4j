(ns org.deeplearning4j.arbiter.optimize.api.termination.MaxTimeCondition
  "Terminate hyperparameter optimization after
 a fixed amount of time has passed"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.termination MaxTimeCondition]))

(defn ->max-time-condition
  "Constructor.

  duration - Duration of time - `long`
  time-unit - Unit that the duration is specified in - `java.util.concurrent.TimeUnit`"
  (^MaxTimeCondition [^Long duration ^java.util.concurrent.TimeUnit time-unit]
    (new MaxTimeCondition duration time-unit)))

(defn initialize
  "Description copied from interface: TerminationCondition

  optimization-runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^MaxTimeCondition this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner optimization-runner]
    (-> this (.initialize optimization-runner))))

(defn terminate
  "Description copied from interface: TerminationCondition

  optimization-runner - Optimization runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`

  returns: true if learning should be terminated, false otherwise - `boolean`"
  (^Boolean [^MaxTimeCondition this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner optimization-runner]
    (-> this (.terminate optimization-runner))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MaxTimeCondition this]
    (-> this (.toString))))

