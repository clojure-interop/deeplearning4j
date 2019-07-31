(ns org.deeplearning4j.spark.impl.multilayer.scoring.VaeReconstructionErrorWithKeyFunction
  "Function to calculate the reconstruction error for a variational autoencoder, that is the first layer in a
 MultiLayerNetwork.
 Note that the VAE must be using a loss function, not a ReconstructionDistribution
 Also note that scoring is batched for computational efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.scoring VaeReconstructionErrorWithKeyFunction]))

(defn ->vae-reconstruction-error-with-key-function
  "Constructor.

  params - `org.apache.spark.broadcast.Broadcast`
  json-config - `org.apache.spark.broadcast.Broadcast`
  batch-size - `int`"
  (^VaeReconstructionErrorWithKeyFunction [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Integer batch-size]
    (new VaeReconstructionErrorWithKeyFunction params json-config batch-size)))

