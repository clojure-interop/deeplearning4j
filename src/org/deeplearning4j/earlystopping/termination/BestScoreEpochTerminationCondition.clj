(ns org.deeplearning4j.earlystopping.termination.BestScoreEpochTerminationCondition
  "Created by Sadat Anwar on 3/26/16.
 Stop the training once we achieved an expected score. Normally this will stop if the current score is lower than
 the initialized score. If you want to stop the training once the score increases the defined score set the
 lesserBetter flag to false (feel free to give the flag a better name)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.termination BestScoreEpochTerminationCondition]))

(defn ->best-score-epoch-termination-condition
  "Constructor.

  best-expected-score - `double`
  lesser-better - `boolean`"
  (^BestScoreEpochTerminationCondition [^Double best-expected-score ^Boolean lesser-better]
    (new BestScoreEpochTerminationCondition best-expected-score lesser-better))
  (^BestScoreEpochTerminationCondition [^Double best-expected-score]
    (new BestScoreEpochTerminationCondition best-expected-score)))

(defn initialize
  "Description copied from interface: EpochTerminationCondition"
  ([^BestScoreEpochTerminationCondition this]
    (-> this (.initialize))))

(defn terminate
  "Description copied from interface: EpochTerminationCondition

  epoch-num - Number of the last completed epoch (starting at 0) - `int`
  score - Score calculate for this epoch - `double`

  returns: Whether training should be terminated at this epoch - `boolean`"
  (^Boolean [^BestScoreEpochTerminationCondition this ^Integer epoch-num ^Double score]
    (-> this (.terminate epoch-num score))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BestScoreEpochTerminationCondition this]
    (-> this (.toString))))

