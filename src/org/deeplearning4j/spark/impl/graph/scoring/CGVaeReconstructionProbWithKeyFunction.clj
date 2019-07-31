(ns org.deeplearning4j.spark.impl.graph.scoring.CGVaeReconstructionProbWithKeyFunction
  "Function to calculate the reconstruction probability for a variational autoencoder, that is the first layer in a
 ComputationGraph.
 Note that scoring is batched for computational efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.graph.scoring CGVaeReconstructionProbWithKeyFunction]))

(defn ->cg-vae-reconstruction-prob-with-key-function
  "Constructor.

  params - MultiLayerNetwork parameters - `org.apache.spark.broadcast.Broadcast`
  json-config - MultiLayerConfiguration, as json - `org.apache.spark.broadcast.Broadcast`
  use-log-probability - If true: use log probability. False: use raw probability. - `boolean`
  batch-size - Batch size to use when scoring - `int`
  num-samples - Number of samples to use when calling VariationalAutoencoder.reconstructionLogProbability(INDArray, int) - `int`"
  (^CGVaeReconstructionProbWithKeyFunction [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Boolean use-log-probability ^Integer batch-size ^Integer num-samples]
    (new CGVaeReconstructionProbWithKeyFunction params json-config use-log-probability batch-size num-samples)))

(defn get-vae-layer
  "returns: `org.deeplearning4j.nn.layers.variational.VariationalAutoencoder`"
  (^org.deeplearning4j.nn.layers.variational.VariationalAutoencoder [^CGVaeReconstructionProbWithKeyFunction this]
    (-> this (.getVaeLayer))))

