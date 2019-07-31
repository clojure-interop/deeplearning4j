(ns org.deeplearning4j.arbiter.optimize.runner.listener.StatusListener
  "The status Listener interface is used to inspect/track the status of execution, both for individual candidates,
 and for the optimisation runner overall."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.runner.listener StatusListener]))

(defn on-initialization
  "Called when optimization runner starts execution

  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^StatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.onInitialization runner))))

(defn on-shutdown
  "Called when optimization runner terminates

  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^StatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.onShutdown runner))))

(defn on-runner-status-change
  "Called when any of the summary stats change, for the optimization runner:
  number scheduled, number completed, number failed, best score, etc.

  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^StatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.onRunnerStatusChange runner))))

(defn on-candidate-status-change
  "Called when the status of the candidate is change. For example created, completed, failed.

  candidate-info - Candidate information - `org.deeplearning4j.arbiter.optimize.runner.CandidateInfo`
  runner - Optimisation runner calling this method - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`
  result - Optimisation result. Maybe null. - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`"
  ([^StatusListener this ^org.deeplearning4j.arbiter.optimize.runner.CandidateInfo candidate-info ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result]
    (-> this (.onCandidateStatusChange candidate-info runner result))))

(defn on-candidate-iteration
  "This method may be called by tasks as they are executing. The intent of this method is to report partial results,
  such as different stages of learning, or scores/evaluations so far

  candidate-info - Candidate information - `org.deeplearning4j.arbiter.optimize.runner.CandidateInfo`
  candidate - Current candidate value/configuration - `java.lang.Object`
  iteration - Current iteration number - `int`"
  ([^StatusListener this ^org.deeplearning4j.arbiter.optimize.runner.CandidateInfo candidate-info ^java.lang.Object candidate ^Integer iteration]
    (-> this (.onCandidateIteration candidate-info candidate iteration))))

