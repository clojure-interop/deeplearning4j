(ns org.deeplearning4j.spark.impl.multilayer.scoring.VaeReconstructionProbWithKeyFunction
  "Function to calculate the reconstruction probability for a variational autoencoder, that is the first layer in a
 MultiLayerNetwork.
 Note that scoring is batched for computational efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.multilayer.scoring VaeReconstructionProbWithKeyFunction]))

(defn ->vae-reconstruction-prob-with-key-function
  "Constructor.

  params - `org.apache.spark.broadcast.Broadcast`
  json-config - `org.apache.spark.broadcast.Broadcast`
  use-log-probability - `boolean`
  batch-size - `int`
  num-samples - `int`"
  (^VaeReconstructionProbWithKeyFunction [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Boolean use-log-probability ^Integer batch-size ^Integer num-samples]
    (new VaeReconstructionProbWithKeyFunction params json-config use-log-probability batch-size num-samples)))

