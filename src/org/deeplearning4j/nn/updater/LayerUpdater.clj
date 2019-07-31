(ns org.deeplearning4j.nn.updater.LayerUpdater
  "Updater for a single layer, excluding MultiLayerNetwork (which also implements the Layer interface)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.updater LayerUpdater]))

(defn ->layer-updater
  "Constructor.

  layer - `org.deeplearning4j.nn.api.Layer`
  updater-state - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^LayerUpdater [^org.deeplearning4j.nn.api.Layer layer ^org.nd4j.linalg.api.ndarray.INDArray updater-state]
    (new LayerUpdater layer updater-state))
  (^LayerUpdater [^org.deeplearning4j.nn.api.Layer layer]
    (new LayerUpdater layer)))

