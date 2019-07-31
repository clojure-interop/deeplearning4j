(ns org.deeplearning4j.earlystopping.scorecalc.VAEReconProbScoreCalculator
  "Score calculator for variational autoencoder reconstruction probability or reconstruction log probability for a
 MultiLayerNetwork or ComputationGraph. VariationalAutoencoder layer must be first layer in the network
 See VariationalAutoencoder.reconstructionProbability(INDArray, int) for more details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.scorecalc VAEReconProbScoreCalculator]))

(defn ->vae-recon-prob-score-calculator
  "Constructor.

  Constructor for reconstruction probability

  iterator - Iterator - `org.nd4j.linalg.dataset.api.iterator.DataSetIterator`
  reconstruction-prob-num-samples - Number of samples. See VariationalAutoencoder.reconstructionProbability(INDArray, int)for details - `int`
  log-prob - If true: calculate (negative) log probability. False: probability - `boolean`
  average - If true: return average (log) probability. False: sum of log probability. - `boolean`"
  (^VAEReconProbScoreCalculator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer reconstruction-prob-num-samples ^Boolean log-prob ^Boolean average]
    (new VAEReconProbScoreCalculator iterator reconstruction-prob-num-samples log-prob average))
  (^VAEReconProbScoreCalculator [^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iterator ^Integer reconstruction-prob-num-samples ^Boolean log-prob]
    (new VAEReconProbScoreCalculator iterator reconstruction-prob-num-samples log-prob)))

(defn minimize-score
  "returns: If true: the score should be minimized. If false: the score should be maximized. - `boolean`"
  (^Boolean [^VAEReconProbScoreCalculator this]
    (-> this (.minimizeScore))))

