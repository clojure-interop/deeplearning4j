(ns org.deeplearning4j.earlystopping.termination.MaxTimeIterationTerminationCondition
  "Terminate training based on max time."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination MaxTimeIterationTerminationCondition]))

(defn ->max-time-iteration-termination-condition
  "Constructor.

  max-time-amount - `long`
  max-time-unit - `java.util.concurrent.TimeUnit`"
  (^MaxTimeIterationTerminationCondition [^Long max-time-amount ^java.util.concurrent.TimeUnit max-time-unit]
    (new MaxTimeIterationTerminationCondition max-time-amount max-time-unit)))

(defn initialize
  "Description copied from interface: IterationTerminationCondition"
  ([^MaxTimeIterationTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Description copied from interface: IterationTerminationCondition

  last-mini-batch-score - Score of the last minibatch - `double`

  returns: whether to terminate or not - `boolean`"
  (^Boolean [^MaxTimeIterationTerminationCondition this ^Double last-mini-batch-score]
    (-> this (.terminate last-mini-batch-score))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MaxTimeIterationTerminationCondition this]
    (-> this (.toString))))

