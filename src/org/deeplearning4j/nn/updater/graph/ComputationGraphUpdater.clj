(ns org.deeplearning4j.nn.updater.graph.ComputationGraphUpdater
  "Gradient updater for ComputationGraph. Most of the functionality is shared with
 MultiLayerUpdater via BaseMultiLayerUpdater"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.updater.graph ComputationGraphUpdater]))

(defn ->computation-graph-updater
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  updater-state - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^ComputationGraphUpdater [^org.deeplearning4j.nn.graph.ComputationGraph graph ^org.nd4j.linalg.api.ndarray.INDArray updater-state]
    (new ComputationGraphUpdater graph updater-state))
  (^ComputationGraphUpdater [^org.deeplearning4j.nn.graph.ComputationGraph graph]
    (new ComputationGraphUpdater graph)))

