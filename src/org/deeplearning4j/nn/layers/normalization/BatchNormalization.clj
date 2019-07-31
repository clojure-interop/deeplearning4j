(ns org.deeplearning4j.nn.layers.normalization.BatchNormalization
  "Batch normalization layer.
 Rerences:
 http://arxiv.org/pdf/1502.03167v3.pdf
 http://arxiv.org/pdf/1410.7455v8.pdf
 https://kratzert.github.io/2016/02/12/understanding-the-gradient-flow-through-the-batch-normalization-layer.html
 tried this approach but results did not match https://cthorey.github.io/backpropagation/
 ideal to apply this between linear and non-linear transformations in layers it follows"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.normalization BatchNormalization]))

(defn ->batch-normalization
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^BatchNormalization [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new BatchNormalization conf)))

(defn fit
  "Description copied from interface: Model

  input - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BatchNormalization this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit input workspace-mgr))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^BatchNormalization this]
    (-> this (.gradient))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^BatchNormalization this]
    (-> this (.getHelper))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BatchNormalization this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-index
  "Description copied from interface: Layer

  returns: `int`"
  (^Integer [^BatchNormalization this]
    (-> this (.getIndex))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^BatchNormalization this]
    (-> this (.isPretrainLayer))))

(defn set-listeners
  "Description copied from interface: Layer

  listeners - `org.deeplearning4j.optimize.api.TrainingListener`"
  ([^BatchNormalization this ^org.deeplearning4j.optimize.api.TrainingListener listeners]
    (-> this (.setListeners listeners))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BatchNormalization this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn set-index
  "Description copied from interface: Layer

  index - `int`"
  ([^BatchNormalization this ^Integer index]
    (-> this (.setIndex index))))

(defn get-shape
  "x - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `long[]`"
  ([^BatchNormalization this ^org.nd4j.linalg.api.ndarray.INDArray x]
    (-> this (.getShape x))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^BatchNormalization this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^BatchNormalization this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^BatchNormalization this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn pre-output
  "x - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `org.deeplearning4j.nn.api.Layer$TrainingMode`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BatchNormalization this ^org.nd4j.linalg.api.ndarray.INDArray x ^org.deeplearning4j.nn.api.Layer$TrainingMode training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preOutput x training workspace-mgr))))

(defn get-listeners
  "Description copied from interface: Layer

  returns: `java.util.Collection<org.deeplearning4j.optimize.api.TrainingListener>`"
  (^java.util.Collection [^BatchNormalization this]
    (-> this (.getListeners))))

