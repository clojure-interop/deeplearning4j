(ns org.deeplearning4j.nn.layers.FrozenLayerWithBackprop
  "Frozen layer freezes parameters of the layer it wraps, but allows the backpropagation to continue."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers FrozenLayerWithBackprop]))

(defn ->frozen-layer-with-backprop
  "Constructor.

  inside-layer - `org.deeplearning4j.nn.api.Layer`"
  (^FrozenLayerWithBackprop [^org.deeplearning4j.nn.api.Layer inside-layer]
    (new FrozenLayerWithBackprop inside-layer)))

(defn fit
  "Description copied from interface: Model

  data - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^FrozenLayerWithBackprop this ^org.nd4j.linalg.api.ndarray.INDArray data ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit data workspace-mgr)))
  ([^FrozenLayerWithBackprop this]
    (-> this (.fit))))

(defn get-inside-layer
  "returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^FrozenLayerWithBackprop this]
    (-> this (.getInsideLayer))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^FrozenLayerWithBackprop this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^FrozenLayerWithBackprop this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^FrozenLayerWithBackprop this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^FrozenLayerWithBackprop this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type)))
  ([^FrozenLayerWithBackprop this ^org.deeplearning4j.nn.gradient.Gradient gradient]
    (-> this (.update gradient))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^FrozenLayerWithBackprop this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn log-test-mode
  "training - `boolean`"
  ([^FrozenLayerWithBackprop this ^Boolean training]
    (-> this (.logTestMode training))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^FrozenLayerWithBackprop this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^FrozenLayerWithBackprop this ^Boolean backprop-only-params]
    (-> this (.calcL1 backprop-only-params))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-only-params - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^FrozenLayerWithBackprop this ^Boolean backprop-only-params]
    (-> this (.calcL2 backprop-only-params))))

(defn apply-constraints
  "Description copied from interface: Model

  iteration - `int`
  epoch - `int`"
  ([^FrozenLayerWithBackprop this ^Integer iteration ^Integer epoch]
    (-> this (.applyConstraints iteration epoch))))

