(ns org.deeplearning4j.arbiter.ui.listener.ArbiterStatusListener
  "A StatusListener for reporting Arbiter/DL4J optimization results to a StatsStorageRouter"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.ui.listener ArbiterStatusListener]))

(defn ->arbiter-status-listener
  "Constructor.

  session-id - `java.lang.String`
  stats-storage - `org.deeplearning4j.api.storage.StatsStorageRouter`"
  (^ArbiterStatusListener [^java.lang.String session-id ^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage]
    (new ArbiterStatusListener session-id stats-storage))
  (^ArbiterStatusListener [^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage]
    (new ArbiterStatusListener stats-storage)))

(def *-max-score-vs-iter-pts
  "Static Constant.

  type: int"
  ArbiterStatusListener/MAX_SCORE_VS_ITER_PTS)

(defn on-initialization
  "Description copied from interface: StatusListener

  r - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^ArbiterStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner r]
    (-> this (.onInitialization r))))

(defn on-shutdown
  "Description copied from interface: StatusListener

  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^ArbiterStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.onShutdown runner))))

(defn on-runner-status-change
  "Description copied from interface: StatusListener

  r - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^ArbiterStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner r]
    (-> this (.onRunnerStatusChange r))))

(defn on-candidate-status-change
  "Description copied from interface: StatusListener

  candidate-info - Candidate information - `org.deeplearning4j.arbiter.optimize.runner.CandidateInfo`
  runner - Optimisation runner calling this method - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`
  result - Optimisation result. Maybe null. - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`"
  ([^ArbiterStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.CandidateInfo candidate-info ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result]
    (-> this (.onCandidateStatusChange candidate-info runner result))))

(defn on-candidate-iteration
  "Description copied from interface: StatusListener

  candidate-info - Candidate information - `org.deeplearning4j.arbiter.optimize.runner.CandidateInfo`
  candidate - Current candidate value/configuration - `java.lang.Object`
  iteration - Current iteration number - `int`"
  ([^ArbiterStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.CandidateInfo candidate-info ^java.lang.Object candidate ^Integer iteration]
    (-> this (.onCandidateIteration candidate-info candidate iteration))))

