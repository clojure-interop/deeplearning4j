(ns org.deeplearning4j.nn.layers.convolution.DepthwiseConvolution2DLayer
  "2D depth-wise convolution layer configuration.

 Performs a channels-wise convolution, which
 operates on each of the input maps separately. A channel multiplier is used to
 specify the number of outputs per input map. This convolution
 is carried out with the specified kernel sizes, stride and padding values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.convolution DepthwiseConvolution2DLayer]))

(defn ->depthwise-convolution-2-d-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^DepthwiseConvolution2DLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new DepthwiseConvolution2DLayer conf input))
  (^DepthwiseConvolution2DLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new DepthwiseConvolution2DLayer conf)))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^DepthwiseConvolution2DLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DepthwiseConvolution2DLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

