(ns org.deeplearning4j.spark.api.worker.NetBroadcastTuple
  "A simple class for storing configurations, parameters and updaters in one class (so they can be broadcast together)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.worker NetBroadcastTuple]))

(defn ->net-broadcast-tuple
  "Constructor.

  configuration - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`
  graph-configuration - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`
  parameters - `org.nd4j.linalg.api.ndarray.INDArray`
  updater-state - `org.nd4j.linalg.api.ndarray.INDArray`
  counter - `java.util.concurrent.atomic.AtomicInteger`"
  (^NetBroadcastTuple [^org.deeplearning4j.nn.conf.MultiLayerConfiguration configuration ^org.deeplearning4j.nn.conf.ComputationGraphConfiguration graph-configuration ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray updater-state ^java.util.concurrent.atomic.AtomicInteger counter]
    (new NetBroadcastTuple configuration graph-configuration parameters updater-state counter))
  (^NetBroadcastTuple [^org.deeplearning4j.nn.conf.MultiLayerConfiguration configuration ^org.deeplearning4j.nn.conf.ComputationGraphConfiguration graph-configuration ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray updater-state]
    (new NetBroadcastTuple configuration graph-configuration parameters updater-state))
  (^NetBroadcastTuple [^org.deeplearning4j.nn.conf.MultiLayerConfiguration configuration ^org.nd4j.linalg.api.ndarray.INDArray parameters ^org.nd4j.linalg.api.ndarray.INDArray updater-state]
    (new NetBroadcastTuple configuration parameters updater-state)))

