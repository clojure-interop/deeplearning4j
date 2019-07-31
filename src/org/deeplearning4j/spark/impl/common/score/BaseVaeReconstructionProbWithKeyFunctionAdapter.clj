(ns org.deeplearning4j.spark.impl.common.score.BaseVaeReconstructionProbWithKeyFunctionAdapter
  "Function to calculate the scores (reconstruction probability or log probability) for a variational autoencoder.
 Note that scoring is batched for computational efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common.score BaseVaeReconstructionProbWithKeyFunctionAdapter]))

(defn ->base-vae-reconstruction-prob-with-key-function-adapter
  "Constructor.

  params - MultiLayerNetwork parameters - `org.apache.spark.broadcast.Broadcast`
  json-config - MultiLayerConfiguration, as json - `org.apache.spark.broadcast.Broadcast`
  use-log-probability - If true: use log probability. False: use raw probability. - `boolean`
  batch-size - Batch size to use when scoring - `int`
  num-samples - Number of samples to use when calling VariationalAutoencoder.reconstructionLogProbability(INDArray, int) - `int`"
  (^BaseVaeReconstructionProbWithKeyFunctionAdapter [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Boolean use-log-probability ^Integer batch-size ^Integer num-samples]
    (new BaseVaeReconstructionProbWithKeyFunctionAdapter params json-config use-log-probability batch-size num-samples)))

(defn compute-score
  "vae - `org.deeplearning4j.nn.layers.variational.VariationalAutoencoder`
  to-score - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseVaeReconstructionProbWithKeyFunctionAdapter this ^org.deeplearning4j.nn.layers.variational.VariationalAutoencoder vae ^org.nd4j.linalg.api.ndarray.INDArray to-score]
    (-> this (.computeScore vae to-score))))

