(ns org.deeplearning4j.earlystopping.EarlyStoppingConfiguration
  "Early stopping configuration: Specifies the various configuration options for running training with early stopping.
 Users need to specify the following:
 (a) EarlyStoppingModelSaver: How models will be saved (to disk, to memory, etc) (Default: in memory)
 (b) Termination conditions: at least one termination condition must be specified
 (i) Iteration termination conditions: calculated once for each minibatch. For example, maxTime or invalid (NaN/infinite) scores
 (ii) Epoch termination conditions: calculated once per epoch. For example, maxEpochs or no improvement for N epochs
 (c) Score calculator: what score should be calculated at every epoch? (For example: test set loss or test set accuracy)
 (d) How frequently (ever N epochs) should scores be calculated? (Default: every epoch)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping EarlyStoppingConfiguration]))

(defn get-score-calculator
  "returns: `org.deeplearning4j.earlystopping.scorecalc.ScoreCalculator<T>`"
  (^org.deeplearning4j.earlystopping.scorecalc.ScoreCalculator [^EarlyStoppingConfiguration this]
    (-> this (.getScoreCalculator))))

(defn validate
  ""
  ([^EarlyStoppingConfiguration this]
    (-> this (.validate))))

