(ns org.deeplearning4j.arbiter.optimize.runner.listener.impl.LoggingStatusListener
  "Created by Alex on 20/07/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.runner.listener.impl LoggingStatusListener]))

(defn ->logging-status-listener
  "Constructor."
  (^LoggingStatusListener []
    (new LoggingStatusListener )))

(defn on-initialization
  "Description copied from interface: StatusListener

  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^LoggingStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.onInitialization runner))))

(defn on-shutdown
  "Description copied from interface: StatusListener

  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^LoggingStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.onShutdown runner))))

(defn on-runner-status-change
  "Description copied from interface: StatusListener

  runner - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`"
  ([^LoggingStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner]
    (-> this (.onRunnerStatusChange runner))))

(defn on-candidate-status-change
  "Description copied from interface: StatusListener

  candidate-info - Candidate information - `org.deeplearning4j.arbiter.optimize.runner.CandidateInfo`
  runner - Optimisation runner calling this method - `org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner`
  result - Optimisation result. Maybe null. - `org.deeplearning4j.arbiter.optimize.api.OptimizationResult`"
  ([^LoggingStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.CandidateInfo candidate-info ^org.deeplearning4j.arbiter.optimize.runner.IOptimizationRunner runner ^org.deeplearning4j.arbiter.optimize.api.OptimizationResult result]
    (-> this (.onCandidateStatusChange candidate-info runner result))))

(defn on-candidate-iteration
  "Description copied from interface: StatusListener

  candidate-info - Candidate information - `org.deeplearning4j.arbiter.optimize.runner.CandidateInfo`
  candidate - Current candidate value/configuration - `java.lang.Object`
  iteration - Current iteration number - `int`"
  ([^LoggingStatusListener this ^org.deeplearning4j.arbiter.optimize.runner.CandidateInfo candidate-info ^java.lang.Object candidate ^Integer iteration]
    (-> this (.onCandidateIteration candidate-info candidate iteration))))

