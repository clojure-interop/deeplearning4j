(ns org.deeplearning4j.nn.layers.feedforward.autoencoder.AutoEncoder
  "Autoencoder.
 Add Gaussian noise to input and learn
 a reconstruction function."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.feedforward.autoencoder AutoEncoder]))

(defn ->auto-encoder
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^AutoEncoder [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new AutoEncoder conf input))
  (^AutoEncoder [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new AutoEncoder conf)))

(defn sample-hidden-given-visible
  "Description copied from class: BasePretrainNetwork

  v - the visible to sample from - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the hidden mean and sample - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^AutoEncoder this ^org.nd4j.linalg.api.ndarray.INDArray v]
    (-> this (.sampleHiddenGivenVisible v))))

(defn sample-visible-given-hidden
  "Description copied from class: BasePretrainNetwork

  h - the hidden to sample from - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the mean and sample - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^AutoEncoder this ^org.nd4j.linalg.api.ndarray.INDArray h]
    (-> this (.sampleVisibleGivenHidden h))))

(defn encode
  "v - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AutoEncoder this ^org.nd4j.linalg.api.ndarray.INDArray v ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.encode v training workspace-mgr))))

(defn decode
  "y - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AutoEncoder this ^org.nd4j.linalg.api.ndarray.INDArray y ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.decode y workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^AutoEncoder this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^AutoEncoder this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^AutoEncoder this]
    (-> this (.isPretrainLayer))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^AutoEncoder this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

