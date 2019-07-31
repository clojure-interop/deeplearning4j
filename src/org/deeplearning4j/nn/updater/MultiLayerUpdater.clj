(ns org.deeplearning4j.nn.updater.MultiLayerUpdater
  "MultiLayerUpdater: Gradient updater for MultiLayerNetworks.
 Expects backprop gradients for all layers to be in single Gradient object,
 keyed by \"0_b\", \"1_w\" etc., as per MultiLayerNetwork.backward()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.updater MultiLayerUpdater]))

(defn ->multi-layer-updater
  "Constructor.

  network - `org.deeplearning4j.nn.multilayer.MultiLayerNetwork`
  updater-state - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^MultiLayerUpdater [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network ^org.nd4j.linalg.api.ndarray.INDArray updater-state]
    (new MultiLayerUpdater network updater-state))
  (^MultiLayerUpdater [^org.deeplearning4j.nn.multilayer.MultiLayerNetwork network]
    (new MultiLayerUpdater network)))

(defn clone
  "returns: `org.deeplearning4j.nn.api.Updater`"
  (^org.deeplearning4j.nn.api.Updater [^MultiLayerUpdater this]
    (-> this (.clone))))

