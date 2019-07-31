(ns org.deeplearning4j.nn.layers.FrozenLayer
  "For purposes of transfer learning
 A frozen layers wraps another dl4j layer within it.
 The params of the layer within it are \"frozen\" or in other words held constant
 During the forward pass the frozen layer behaves as the layer within it would during test regardless of the training/test mode the network is in.
 Backprop is skipped since parameters are not be updated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers FrozenLayer]))

(defn ->frozen-layer
  "Constructor.

  inside-layer - `org.deeplearning4j.nn.api.Layer`"
  (^FrozenLayer [^org.deeplearning4j.nn.api.Layer inside-layer]
    (new FrozenLayer inside-layer)))

(defn fit
  "Description copied from interface: Model

  data - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^FrozenLayer this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit data workspace-mgr)))
  ([^FrozenLayer this]
    (-> this (.fit))))

(defn set-cache-mode
  "Description copied from interface: Layer

  mode - `org.deeplearning4j.nn.conf.CacheMode`"
  ([^FrozenLayer this ^org.deeplearning4j.nn.conf.CacheMode mode]
    (-> this (.setCacheMode mode))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^FrozenLayer this]
    (-> this (.gradient))))

(defn get-inside-layer
  "returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^FrozenLayer this]
    (-> this (.getInsideLayer))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^FrozenLayer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FrozenLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^FrozenLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^FrozenLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^FrozenLayer this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^FrozenLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn log-test-mode
  "training - `boolean`"
  ([^FrozenLayer this ^Boolean training]
    (-> this (.logTestMode training))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^FrozenLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^FrozenLayer this ^Boolean backprop-only-params]
    (-> this (.calcL1 backprop-only-params))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^FrozenLayer this ^Boolean backprop-only-params]
    (-> this (.calcL2 backprop-only-params))))

(defn init
  "Init the model"
  ([^FrozenLayer this]
    (-> this (.init))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^FrozenLayer this]
    (-> this (.getConfig))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^FrozenLayer this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^FrozenLayer this]
    (-> this (.gradientAndScore))))

