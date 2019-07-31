(ns org.deeplearning4j.nn.api.Updater
  "Update the model"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api Updater]))

(defn set-state-view-array
  "Set the internal (historical) state view array for this updater

  layer - Layer that this updater belongs to - `org.deeplearning4j.nn.api.Trainable`
  view-array - View array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize - Whether to initialize the array or not - `boolean`"
  ([^Updater this ^org.deeplearning4j.nn.api.Trainable layer ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize]
    (-> this (.setStateViewArray layer view-array initialize))))

(defn get-state-view-array
  "returns: the view array for this updater - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Updater this]
    (-> this (.getStateViewArray))))

(defn update
  "Updater: updates the model

  layer - `org.deeplearning4j.nn.api.Trainable`
  gradient - `org.deeplearning4j.nn.gradient.Gradient`
  iteration - `int`
  epoch - `int`
  mini-batch-size - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^Updater this ^org.deeplearning4j.nn.api.Trainable layer ^org.deeplearning4j.nn.gradient.Gradient gradient ^Integer iteration ^Integer epoch ^Integer mini-batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.update layer gradient iteration epoch mini-batch-size workspace-mgr))))

