(ns org.deeplearning4j.nn.layers.feedforward.elementwise.ElementWiseMultiplicationLayer
  "Elementwise multiplication layer with weights: implements out = activationFn(input .* w  b) where:
 - w is a learnable weight vector of length nOut
 - \".*\" is element-wise multiplication
 - b is a bias vector

 Note that the input and output sizes of the element-wise layer are the same for this layer

 created by jingshu"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.feedforward.elementwise ElementWiseMultiplicationLayer]))

(defn ->element-wise-multiplication-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^ElementWiseMultiplicationLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new ElementWiseMultiplicationLayer conf input))
  (^ElementWiseMultiplicationLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new ElementWiseMultiplicationLayer conf)))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^ElementWiseMultiplicationLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn pretrain-layer?
  "Returns true if the layer can be trained in an unsupervised/pretrain manner (VAE, RBMs etc)

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^ElementWiseMultiplicationLayer this]
    (-> this (.isPretrainLayer))))

(defn pre-output
  "training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ElementWiseMultiplicationLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.preOutput training workspace-mgr))))

