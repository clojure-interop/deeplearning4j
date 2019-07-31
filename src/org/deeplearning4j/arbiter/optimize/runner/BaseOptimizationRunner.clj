(ns org.deeplearning4j.arbiter.optimize.runner.BaseOptimizationRunner
  "BaseOptimization runner: responsible for scheduling tasks, saving results using the result saver, etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.runner BaseOptimizationRunner]))

(defn add-listeners
  "listeners - `org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener`"
  ([^BaseOptimizationRunner this ^org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener listeners]
    (-> this (.addListeners listeners))))

(defn remove-listeners
  "listeners - `org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener`"
  ([^BaseOptimizationRunner this ^org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener listeners]
    (-> this (.removeListeners listeners))))

(defn num-candidates-completed
  "returns: `int`"
  (^Integer [^BaseOptimizationRunner this]
    (-> this (.numCandidatesCompleted))))

(defn num-candidates-total
  "Description copied from interface: IOptimizationRunner

  returns: `int`"
  (^Integer [^BaseOptimizationRunner this]
    (-> this (.numCandidatesTotal))))

(defn remove-all-listeners
  ""
  ([^BaseOptimizationRunner this]
    (-> this (.removeAllListeners))))

(defn best-score-candidate-index
  "Description copied from interface: IOptimizationRunner

  returns: `int`"
  (^Integer [^BaseOptimizationRunner this]
    (-> this (.bestScoreCandidateIndex))))

(defn num-candidates-failed
  "returns: `int`"
  (^Integer [^BaseOptimizationRunner this]
    (-> this (.numCandidatesFailed))))

(defn get-configuration
  "returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration [^BaseOptimizationRunner this]
    (-> this (.getConfiguration))))

(defn get-candidate-status
  "returns: `java.util.List<org.deeplearning4j.arbiter.optimize.runner.CandidateInfo>`"
  (^java.util.List [^BaseOptimizationRunner this]
    (-> this (.getCandidateStatus))))

(defn best-score-time
  "Description copied from interface: IOptimizationRunner

  returns: `java.lang.Long`"
  (^java.lang.Long [^BaseOptimizationRunner this]
    (-> this (.bestScoreTime))))

(defn execute
  ""
  ([^BaseOptimizationRunner this]
    (-> this (.execute))))

(defn best-score
  "Description copied from interface: IOptimizationRunner

  returns: `java.lang.Double`"
  (^java.lang.Double [^BaseOptimizationRunner this]
    (-> this (.bestScore))))

(defn num-candidates-queued
  "Description copied from interface: IOptimizationRunner

  returns: `int`"
  (^Integer [^BaseOptimizationRunner this]
    (-> this (.numCandidatesQueued))))

(defn get-results
  "returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.saving.ResultReference>`"
  (^java.util.List [^BaseOptimizationRunner this]
    (-> this (.getResults))))

