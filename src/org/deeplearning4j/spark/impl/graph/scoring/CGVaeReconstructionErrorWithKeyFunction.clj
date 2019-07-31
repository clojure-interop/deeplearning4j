(ns org.deeplearning4j.spark.impl.graph.scoring.CGVaeReconstructionErrorWithKeyFunction
  "Function to calculate the reconstruction error for a variational autoencoder, that is the first layer in a
 ComputationGraph.
 Note that the VAE must be using a loss function, not a ReconstructionDistribution
 Also note that scoring is batched for computational efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring CGVaeReconstructionErrorWithKeyFunction]))

(defn ->cg-vae-reconstruction-error-with-key-function
  "Constructor.

  params - MultiLayerNetwork parameters - `org.apache.spark.broadcast.Broadcast`
  json-config - MultiLayerConfiguration, as json - `org.apache.spark.broadcast.Broadcast`
  batch-size - Batch size to use when scoring - `int`"
  (^CGVaeReconstructionErrorWithKeyFunction [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Integer batch-size]
    (new CGVaeReconstructionErrorWithKeyFunction params json-config batch-size)))

(defn get-vae-layer
  "returns: `org.deeplearning4j.nn.layers.variational.VariationalAutoencoder`"
  (^org.deeplearning4j.nn.layers.variational.VariationalAutoencoder [^CGVaeReconstructionErrorWithKeyFunction this]
    (-> this (.getVaeLayer))))

(defn compute-score
  "vae - `org.deeplearning4j.nn.layers.variational.VariationalAutoencoder`
  to-score - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^CGVaeReconstructionErrorWithKeyFunction this ^org.deeplearning4j.nn.layers.variational.VariationalAutoencoder vae ^org.nd4j.linalg.api.ndarray.INDArray to-score]
    (-> this (.computeScore vae to-score))))

