(ns org.deeplearning4j.nn.layers.feedforward.embedding.EmbeddingSequenceLayer
  "Embedding layer for sequences: feed-forward layer that expects fixed-length number (inputLength) of integers/indices
 per example as input, ranged from 0 to numClasses - 1. This input thus has shape [numExamples, inputLength].
 The output of this layer is 3D, namely of shape [numExamples, nOut, inputLength].
 Note: can only be used as the first layer for a network
 Note 2: For a given example index i, the output is activationFunction(weights.getRow(i)  bias), hence the
 weight rows can be considered a vector/embedding of each index."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.feedforward.embedding EmbeddingSequenceLayer]))

(defn ->embedding-sequence-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^EmbeddingSequenceLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new EmbeddingSequenceLayer conf)))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^EmbeddingSequenceLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^EmbeddingSequenceLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn has-bias?
  "Description copied from class: BaseLayer

  returns: True if a bias term is present, false otherwise - `boolean`"
  (^Boolean [^EmbeddingSequenceLayer this]
    (-> this (.hasBias))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^EmbeddingSequenceLayer this]
    (-> this (.isPretrainLayer))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^EmbeddingSequenceLayer this]
    (-> this (.type))))

(defn clear
  "Description copied from interface: Model"
  ([^EmbeddingSequenceLayer this]
    (-> this (.clear))))

