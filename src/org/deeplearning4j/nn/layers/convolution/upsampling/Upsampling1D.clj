(ns org.deeplearning4j.nn.layers.convolution.upsampling.Upsampling1D
  "1D Upsampling layer.

 Used for upsampling a 1D convolution. Currently derived from 2D version.
 For forward and backward pass we add a dummy dimension, apply the 2D version
 and strip the extra dimension again. Eventually, we will want to migrate to a
 proper 1D version without this overhead."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.convolution.upsampling Upsampling1D]))

(defn ->upsampling-1-d
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^Upsampling1D [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new Upsampling1D conf input))
  (^Upsampling1D [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new Upsampling1D conf)))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^Upsampling1D this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^Upsampling1D this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

