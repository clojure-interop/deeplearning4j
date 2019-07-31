(ns org.deeplearning4j.earlystopping.termination.MaxScoreIterationTerminationCondition
  "Iteration termination condition for terminating training if the minibatch score exceeds a certain value.
 This can occur for example with a poorly tuned (too high) learning rate"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination MaxScoreIterationTerminationCondition]))

(defn ->max-score-iteration-termination-condition
  "Constructor.

  max-score - `double`"
  (^MaxScoreIterationTerminationCondition [^Double max-score]
    (new MaxScoreIterationTerminationCondition max-score)))

(defn initialize
  "Description copied from interface: IterationTerminationCondition"
  ([^MaxScoreIterationTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Description copied from interface: IterationTerminationCondition

  last-mini-batch-score - Score of the last minibatch - `double`

  returns: whether to terminate or not - `boolean`"
  (^Boolean [^MaxScoreIterationTerminationCondition this ^Double last-mini-batch-score]
    (-> this (.terminate last-mini-batch-score))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MaxScoreIterationTerminationCondition this]
    (-> this (.toString))))

