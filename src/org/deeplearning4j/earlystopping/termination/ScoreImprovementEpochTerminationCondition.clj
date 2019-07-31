(ns org.deeplearning4j.earlystopping.termination.ScoreImprovementEpochTerminationCondition
  "Terminate training if best model score does not improve for N epochs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination ScoreImprovementEpochTerminationCondition]))

(defn ->score-improvement-epoch-termination-condition
  "Constructor.

  max-epochs-with-no-improvement - `int`
  min-improvement - `double`"
  (^ScoreImprovementEpochTerminationCondition [^Integer max-epochs-with-no-improvement ^Double min-improvement]
    (new ScoreImprovementEpochTerminationCondition max-epochs-with-no-improvement min-improvement))
  (^ScoreImprovementEpochTerminationCondition [^Integer max-epochs-with-no-improvement]
    (new ScoreImprovementEpochTerminationCondition max-epochs-with-no-improvement)))

(defn initialize
  "Description copied from interface: EpochTerminationCondition"
  ([^ScoreImprovementEpochTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Description copied from interface: EpochTerminationCondition

  epoch-num - Number of the last completed epoch (starting at 0) - `int`
  score - Score calculate for this epoch - `double`

  returns: Whether training should be terminated at this epoch - `boolean`"
  (^Boolean [^ScoreImprovementEpochTerminationCondition this ^Integer epoch-num ^Double score]
    (-> this (.terminate epoch-num score))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ScoreImprovementEpochTerminationCondition this]
    (-> this (.toString))))

