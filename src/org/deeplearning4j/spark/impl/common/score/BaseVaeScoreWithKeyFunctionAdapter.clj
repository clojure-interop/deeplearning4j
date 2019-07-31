(ns org.deeplearning4j.spark.impl.common.score.BaseVaeScoreWithKeyFunctionAdapter
  "Function to calculate the scores (reconstruction probability, reconstruction error) for a variational autoencoder.
 Note that scoring is batched for computational efficiency."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common.score BaseVaeScoreWithKeyFunctionAdapter]))

(defn ->base-vae-score-with-key-function-adapter
  "Constructor.

  params - MultiLayerNetwork parameters - `org.apache.spark.broadcast.Broadcast`
  json-config - MultiLayerConfiguration, as json - `org.apache.spark.broadcast.Broadcast`
  batch-size - Batch size to use when scoring - `int`"
  (^BaseVaeScoreWithKeyFunctionAdapter [^org.apache.spark.broadcast.Broadcast params ^org.apache.spark.broadcast.Broadcast json-config ^Integer batch-size]
    (new BaseVaeScoreWithKeyFunctionAdapter params json-config batch-size)))

(defn get-vae-layer
  "returns: `org.deeplearning4j.nn.layers.variational.VariationalAutoencoder`"
  (^org.deeplearning4j.nn.layers.variational.VariationalAutoencoder [^BaseVaeScoreWithKeyFunctionAdapter this]
    (-> this (.getVaeLayer))))

(defn compute-score
  "vae - `org.deeplearning4j.nn.layers.variational.VariationalAutoencoder`
  to-score - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseVaeScoreWithKeyFunctionAdapter this ^org.deeplearning4j.nn.layers.variational.VariationalAutoencoder vae ^org.nd4j.linalg.api.ndarray.INDArray to-score]
    (-> this (.computeScore vae to-score))))

(defn call
  "iterator - `java.util.Iterator`

  returns: `java.lang.Iterable<scala.Tuple2<K,java.lang.Double>>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^BaseVaeScoreWithKeyFunctionAdapter this ^java.util.Iterator iterator]
    (-> this (.call iterator))))

