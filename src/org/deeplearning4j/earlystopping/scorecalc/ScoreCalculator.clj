(ns org.deeplearning4j.earlystopping.scorecalc.ScoreCalculator
  "ScoreCalculator interface is used to calculate a score for a neural network.
 For example, the loss function, test set accuracy, F1, or some other (possibly custom) metric."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc ScoreCalculator]))

(defn calculate-score
  "Calculate the score for the given MultiLayerNetwork

  network - `T`

  returns: `double`"
  (^Double [^ScoreCalculator this network]
    (-> this (.calculateScore network))))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^ScoreCalculator this]
    (-> this (.minimizeScore))))

