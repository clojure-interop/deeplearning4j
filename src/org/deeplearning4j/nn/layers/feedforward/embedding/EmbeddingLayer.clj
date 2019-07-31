(ns org.deeplearning4j.nn.layers.feedforward.embedding.EmbeddingLayer
  "Embedding layer: feed-forward layer that expects single integers per example as input (class numbers, in range 0 to numClass-1)
 as input. This input has shape [numExamples,1] instead of [numExamples,numClasses] for the equivalent one-hot representation.
 Mathematically, EmbeddingLayer is equivalent to using a DenseLayer with a one-hot representation for the input; however,
 it can be much more efficient with a large number of classes (as a dense layer  one-hot input does a matrix multiply
 with all but one value being zero).
 Note: can only be used as the first layer for a network
 Note 2: For a given example index i, the output is activationFunction(weights.getRow(i)  bias), hence the
 weight rows can be considered a vector/embedding for each example."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.feedforward.embedding EmbeddingLayer]))

(defn ->embedding-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^EmbeddingLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new EmbeddingLayer conf)))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^EmbeddingLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^EmbeddingLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn has-bias?
  "Description copied from class: BaseLayer

  returns: True if a bias term is present, false otherwise - `boolean`"
  (^Boolean [^EmbeddingLayer this]
    (-> this (.hasBias))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^EmbeddingLayer this]
    (-> this (.isPretrainLayer))))

