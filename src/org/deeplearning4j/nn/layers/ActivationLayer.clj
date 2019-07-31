(ns org.deeplearning4j.nn.layers.ActivationLayer
  "Activation Layer
 Used to apply activation on input and corresponding derivative on epsilon.
 Decouples activation from the layer type and ideal for cases when applying
 BatchNormLayer. For example, use \"identity\" activation on the layer prior to BatchNorm and
 apply this layer after the BatchNorm."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers ActivationLayer]))

(defn ->activation-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^ActivationLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new ActivationLayer conf input))
  (^ActivationLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new ActivationLayer conf)))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^ActivationLayer this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^ActivationLayer this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^ActivationLayer this]
    (-> this (.type))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ActivationLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr mgr]
    (-> this (.activate training mgr))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^ActivationLayer this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^ActivationLayer this]
    (-> this (.clearNoiseWeightParams))))

(defn params
  "Description copied from class: AbstractLayer

  returns: the parameters of the neural network - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ActivationLayer this]
    (-> this (.params))))

