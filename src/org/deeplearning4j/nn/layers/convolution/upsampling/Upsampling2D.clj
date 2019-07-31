(ns org.deeplearning4j.nn.layers.convolution.upsampling.Upsampling2D
  "2D Upsampling layer.

 Used for upsampling a 2D convolution"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.convolution.upsampling Upsampling2D]))

(defn ->upsampling-2-d
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^Upsampling2D [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new Upsampling2D conf input))
  (^Upsampling2D [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new Upsampling2D conf)))

(defn score
  "Description copied from interface: Model

  returns: the score for the model - `double`"
  (^Double [^Upsampling2D this]
    (-> this (.score))))

(defn fit
  "Description copied from interface: Model

  input - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^Upsampling2D this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit input workspace-mgr)))
  ([^Upsampling2D this]
    (-> this (.fit))))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^Upsampling2D this]
    (-> this (.gradient))))

(defn params
  "Description copied from class: AbstractLayer

  returns: the parameters of the neural network - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Upsampling2D this]
    (-> this (.params))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Upsampling2D this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Upsampling2D this ^java.lang.String param]
    (-> this (.getParam param))))

(defn update
  "Description copied from interface: Model

  gradient - the gradient to apply - `org.nd4j.linalg.api.ndarray.INDArray`
  param-type - `java.lang.String`"
  ([^Upsampling2D this ^org.nd4j.linalg.api.ndarray.INDArray gradient ^java.lang.String param-type]
    (-> this (.update gradient param-type))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^Upsampling2D this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^Upsampling2D this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^Upsampling2D this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^Upsampling2D this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn num-params
  "Description copied from class: AbstractLayer

  returns: the number of parameters for the model - `int`"
  (^Integer [^Upsampling2D this]
    (-> this (.numParams))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^Upsampling2D this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^Upsampling2D this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^Upsampling2D this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

