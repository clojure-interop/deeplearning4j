(ns org.deeplearning4j.earlystopping.termination.EpochTerminationCondition
  "Interface for termination conditions to be evaluated once per epoch (i.e., once per pass of the full data set),
 based on a score and epoch number"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination EpochTerminationCondition]))

(defn initialize
  "Initialize the epoch termination condition (often a no-op)"
  ([^EpochTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Should the early stopping training terminate at this epoch, based on the calculated score and the epoch number?
  Returns true if training should terminated, or false otherwise

  epoch-num - Number of the last completed epoch (starting at 0) - `int`
  score - Score calculate for this epoch - `double`

  returns: Whether training should be terminated at this epoch - `boolean`"
  (^Boolean [^EpochTerminationCondition this ^Integer epoch-num ^Double score]
    (-> this (.terminate epoch-num score))))

