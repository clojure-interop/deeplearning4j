(ns org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.runner IOptimizationRunner]))

(defn add-listeners
  "listeners - `org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener`"
  ([^IOptimizationRunner this ^org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener listeners]
    (-> this (.addListeners listeners))))

(defn remove-listeners
  "listeners - `org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener`"
  ([^IOptimizationRunner this ^org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener listeners]
    (-> this (.removeListeners listeners))))

(defn num-candidates-completed
  "returns: `int`"
  (^Integer [^IOptimizationRunner this]
    (-> this (.numCandidatesCompleted))))

(defn num-candidates-total
  "Total number of candidates: created (scheduled), completed and failed

  returns: `int`"
  (^Integer [^IOptimizationRunner this]
    (-> this (.numCandidatesTotal))))

(defn remove-all-listeners
  ""
  ([^IOptimizationRunner this]
    (-> this (.removeAllListeners))))

(defn best-score-candidate-index
  "Index of the best scoring candidate, or -1 if no candidate has scored yet

  returns: `int`"
  (^Integer [^IOptimizationRunner this]
    (-> this (.bestScoreCandidateIndex))))

(defn shutdown
  "await-completion - If true: await completion of currently scheduled tasks. If false: shutdown immediately,cancelling any currently executing tasks - `boolean`"
  ([^IOptimizationRunner this ^Boolean await-completion]
    (-> this (.shutdown await-completion))))

(defn num-candidates-failed
  "returns: `int`"
  (^Integer [^IOptimizationRunner this]
    (-> this (.numCandidatesFailed))))

(defn get-configuration
  "returns: `org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration`"
  (^org.deeplearning4j.arbiter.optimize.config.OptimizationConfiguration [^IOptimizationRunner this]
    (-> this (.getConfiguration))))

(defn get-candidate-status
  "returns: `java.util.List<org.deeplearning4j.arbiter.optimize.runner.CandidateInfo>`"
  (^java.util.List [^IOptimizationRunner this]
    (-> this (.getCandidateStatus))))

(defn best-score-time
  "Time that the best score was found at, or 0 if no jobs have completed successfully

  returns: `java.lang.Long`"
  (^java.lang.Long [^IOptimizationRunner this]
    (-> this (.bestScoreTime))))

(defn execute
  ""
  ([^IOptimizationRunner this]
    (-> this (.execute))))

(defn best-score
  "Best score found so far

  returns: `java.lang.Double`"
  (^java.lang.Double [^IOptimizationRunner this]
    (-> this (.bestScore))))

(defn num-candidates-queued
  "Number of candidates running or queued

  returns: `int`"
  (^Integer [^IOptimizationRunner this]
    (-> this (.numCandidatesQueued))))

(defn get-results
  "returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.saving.ResultReference>`"
  (^java.util.List [^IOptimizationRunner this]
    (-> this (.getResults))))

