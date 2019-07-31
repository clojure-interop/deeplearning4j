(ns org.deeplearning4j.nn.layers.normalization.LocalResponseNormalization
  "Deep neural net normalization approach normalizes activations between layers
 \"brightness normalization\"
 Used for nets like AlexNet

 For a^i_{x,y} the activity of a neuron computed by applying kernel i
 at position (x,y) and applying ReLU nonlinearity, the response
 normalized activation b^i_{x,y} is given by:

 x^2 = (a^j_{x,y})^2
 unitScale = (k  alpha * sum_{j=max(0, i - n/2)}^{max(N-1, i  n/2)} (a^j_{x,y})^2 )
 y = b^i_{x,y} = x * unitScale**-beta

 gy = epsilon (aka deltas from previous layer)
 sumPart = sum(a^j_{x,y} * gb^j_{x,y})
 gx = gy * unitScale**-beta - 2 * alpha * beta * sumPart/unitScale * a^i_{x,y}

 Reference:
 http://www.cs.toronto.edu/~fritz/absps/imagenet.pdf
 https://github.com/vlfeat/matconvnet/issues/10
 Chainer

 Created by nyghtowl on 10/29/15."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.normalization LocalResponseNormalization]))

(defn ->local-response-normalization
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^LocalResponseNormalization [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new LocalResponseNormalization conf input))
  (^LocalResponseNormalization [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new LocalResponseNormalization conf)))

(defn fit
  "Description copied from interface: Model

  input - the data to fit the model to - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^LocalResponseNormalization this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.fit input workspace-mgr))))

(defn get-helper
  "returns: Get the layer helper, if any - `org.deeplearning4j.nn.layers.LayerHelper`"
  (^org.deeplearning4j.nn.layers.LayerHelper [^LocalResponseNormalization this]
    (-> this (.getHelper))))

(defn params
  "Description copied from class: AbstractLayer

  returns: the parameters of the neural network - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LocalResponseNormalization this]
    (-> this (.params))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LocalResponseNormalization this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LocalResponseNormalization this ^java.lang.String param]
    (-> this (.getParam param))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^LocalResponseNormalization this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^LocalResponseNormalization this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^LocalResponseNormalization this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^LocalResponseNormalization this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^LocalResponseNormalization this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^LocalResponseNormalization this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^LocalResponseNormalization this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn clone
  "returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^LocalResponseNormalization this]
    (-> this (.clone))))

