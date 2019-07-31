(ns org.deeplearning4j.earlystopping.scorecalc.AutoencoderScoreCalculator
  "Score function for a MultiLayerNetwork or ComputationGraph with a single
 AutoEncoder layer.
 Calculates the specified RegressionEvaluation.Metric on the layer's reconstructions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc AutoencoderScoreCalculator]))

(defn ->autoencoder-score-calculator
  "Constructor.

  metric - `org.deeplearning4j.eval.RegressionEvaluation$Metric`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^AutoencoderScoreCalculator [^org.deeplearning4j.eval.RegressionEvaluation$Metric metric ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (new AutoencoderScoreCalculator metric iterator)))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^AutoencoderScoreCalculator this]
    (-> this (.minimizeScore))))

