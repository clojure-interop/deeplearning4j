(ns org.deeplearning4j.earlystopping.termination.MaxEpochsTerminationCondition
  "Terminate training if the number of epochs exceeds the maximum number of epochs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination MaxEpochsTerminationCondition]))

(defn ->max-epochs-termination-condition
  "Constructor.

  max-epochs - `int`"
  (^MaxEpochsTerminationCondition [^Integer max-epochs]
    (new MaxEpochsTerminationCondition max-epochs)))

(defn initialize
  "Description copied from interface: EpochTerminationCondition"
  ([^MaxEpochsTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Description copied from interface: EpochTerminationCondition

  epoch-num - Number of the last completed epoch (starting at 0) - `int`
  score - Score calculate for this epoch - `double`

  returns: Whether training should be terminated at this epoch - `boolean`"
  (^Boolean [^MaxEpochsTerminationCondition this ^Integer epoch-num ^Double score]
    (-> this (.terminate epoch-num score))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MaxEpochsTerminationCondition this]
    (-> this (.toString))))

