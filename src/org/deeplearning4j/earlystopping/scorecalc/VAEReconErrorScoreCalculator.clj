(ns org.deeplearning4j.earlystopping.scorecalc.VAEReconErrorScoreCalculator
  "Score function for variational autoencoder reconstruction error for a MultiLayerNetwork or ComputationGraph.
 VariationalAutoencoder layer must be first layer in the network"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc VAEReconErrorScoreCalculator]))

(defn ->vae-recon-error-score-calculator
  "Constructor.

  Constructor for reconstruction *ERROR*

  metric - `org.deeplearning4j.eval.RegressionEvaluation$Metric`
  iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`"
  (^VAEReconErrorScoreCalculator [^org.deeplearning4j.eval.RegressionEvaluation$Metric metric ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator]
    (new VAEReconErrorScoreCalculator metric iterator)))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^VAEReconErrorScoreCalculator this]
    (-> this (.minimizeScore))))

