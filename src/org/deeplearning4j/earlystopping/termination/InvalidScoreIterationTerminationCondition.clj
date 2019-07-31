(ns org.deeplearning4j.earlystopping.termination.InvalidScoreIterationTerminationCondition
  "Terminate training at this iteration if score is NaN or Infinite for the last minibatch"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination InvalidScoreIterationTerminationCondition]))

(defn ->invalid-score-iteration-termination-condition
  "Constructor."
  (^InvalidScoreIterationTerminationCondition []
    (new InvalidScoreIterationTerminationCondition )))

(defn initialize
  "Description copied from interface: IterationTerminationCondition"
  ([^InvalidScoreIterationTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Description copied from interface: IterationTerminationCondition

  last-mini-batch-score - Score of the last minibatch - `double`

  returns: whether to terminate or not - `boolean`"
  (^Boolean [^InvalidScoreIterationTerminationCondition this ^Double last-mini-batch-score]
    (-> this (.terminate last-mini-batch-score))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InvalidScoreIterationTerminationCondition this]
    (-> this (.toString))))

