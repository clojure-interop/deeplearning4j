(ns org.deeplearning4j.earlystopping.termination.IterationTerminationCondition
  "Interface for termination conditions to be evaluated once per iteration (i.e., once per minibatch).
 Used for example to more quickly terminate training, instead of waiting for an epoch to complete before
 checking termination conditions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination IterationTerminationCondition]))

(defn initialize
  "Initialize the iteration termination condition (sometimes a no-op)"
  ([^IterationTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Should early stopping training terminate at this iteration, based on the score for the last iteration?
  return true if training should be terminated immediately, or false otherwise

  last-mini-batch-score - Score of the last minibatch - `double`

  returns: whether to terminate or not - `boolean`"
  (^Boolean [^IterationTerminationCondition this ^Double last-mini-batch-score]
    (-> this (.terminate last-mini-batch-score))))

