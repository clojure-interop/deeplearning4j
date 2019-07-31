(ns org.deeplearning4j.nn.updater.BaseMultiLayerUpdater
  "BaseMultiLayerUpdater - core functionality for applying updaters to MultiLayerNetwork and ComputationGraph.

 This implements updater combining: that is, for any layers (and variables) that:
 (a) have contiguous parameters/gradients in the view arrays, and
 (b) have identical updater configuration (including updater, LR, LR/momentum schedules, etc - different L1/L2 are OK,
 however)
 are combined into a single GradientUpdater operation, instead of having a set of
 smaller operations. A smaller number of larger operations improves performance, especially for GPUs."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.updater BaseMultiLayerUpdater]))

(defn ->base-multi-layer-updater
  "Constructor.

  network - Network to create the updater for - `T`
  updater-state - The updater state to use. Note: This array is used *directly* and isn't copied/cloned - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseMultiLayerUpdater [network ^org.nd4j.linalg.api.ndarray.INDArray updater-state]
    (new BaseMultiLayerUpdater network updater-state))
  (^BaseMultiLayerUpdater [network]
    (new BaseMultiLayerUpdater network)))

(defn set-state-view-array
  "Description copied from interface: Updater

  layer - Layer that this updater belongs to - `org.deeplearning4j.nn.api.Trainable`
  view-array - View array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize - Whether to initialize the array or not - `boolean`"
  ([^BaseMultiLayerUpdater this ^org.deeplearning4j.nn.api.Trainable layer ^org.nd4j.linalg.api.ndarray.INDArray view-array ^Boolean initialize]
    (-> this (.setStateViewArray layer view-array initialize)))
  ([^BaseMultiLayerUpdater this ^org.nd4j.linalg.api.ndarray.INDArray view-array]
    (-> this (.setStateViewArray view-array))))

(defn get-state-view-array
  "returns: the view array for this updater - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseMultiLayerUpdater this]
    (-> this (.getStateViewArray))))

(defn update
  "Description copied from interface: Updater

  layer - `org.deeplearning4j.nn.api.Trainable`
  gradient - `org.deeplearning4j.nn.gradient.Gradient`
  iteration - `int`
  epoch - `int`
  batch-size - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseMultiLayerUpdater this ^org.deeplearning4j.nn.api.Trainable layer ^org.deeplearning4j.nn.gradient.Gradient gradient ^Integer iteration ^Integer epoch ^Integer batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.update layer gradient iteration epoch batch-size workspace-mgr)))
  ([^BaseMultiLayerUpdater this ^org.deeplearning4j.nn.gradient.Gradient gradient ^Integer iteration ^Integer epoch ^Integer batch-size ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.update gradient iteration epoch batch-size workspace-mgr))))

(defn pre-apply
  "Pre-apply: Apply gradient normalization/clipping

  layer - Layer to apply gradient normalization/clipping for - `org.deeplearning4j.nn.api.Trainable`
  gradient - Gradient to update - `org.deeplearning4j.nn.gradient.Gradient`
  iteration - The current iteration (i.e., number of parameter updates so far) - `int`"
  ([^BaseMultiLayerUpdater this ^org.deeplearning4j.nn.api.Trainable layer ^org.deeplearning4j.nn.gradient.Gradient gradient ^Integer iteration]
    (-> this (.preApply layer gradient iteration))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^BaseMultiLayerUpdater this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^BaseMultiLayerUpdater this]
    (-> this (.hashCode))))

