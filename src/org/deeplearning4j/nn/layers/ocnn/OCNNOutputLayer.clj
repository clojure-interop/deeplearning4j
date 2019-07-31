(ns org.deeplearning4j.nn.layers.ocnn.OCNNOutputLayer
  "Layer implementation for OCNNOutputLayer
 See OCNNOutputLayer
 for details."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.ocnn OCNNOutputLayer]))

(defn ->ocnn-output-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^OCNNOutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new OCNNOutputLayer conf input))
  (^OCNNOutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new OCNNOutputLayer conf)))

(defn set-labels
  "Description copied from interface: IOutputLayer

  labels - Labels array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^OCNNOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels labels))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^OCNNOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^OCNNOutputLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn compute-score
  "Compute score after labels and input have been set.

  full-network-l-1 - L1 regularization term for the entire network - `double`
  full-network-l-2 - L2 regularization term for the entire network - `double`
  training - whether score should be calculated at train or test time (this affects things like application ofdropout, etc) - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: score (loss function) - `double`"
  (^Double [^OCNNOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScore full-network-l-1 full-network-l-2 training workspace-mgr))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^OCNNOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn f-1-score
  "Returns the f1 score for the given examples.
  Think of this to be like a percentage right.
  The higher the number the more it got right.
  This is on a scale from 0 to 1.

  examples - te the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the true labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the scores for each ndarray - `double`"
  (^Double [^OCNNOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.f1Score examples labels))))

(defn compute-score-for-examples
  "Compute the score for each example individually, after labels and input have been set.

  full-network-l-1 - L1 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  full-network-l-2 - L2 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: A column INDArray of shape [numExamples,1], where entry i is the score of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^OCNNOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScoreForExamples full-network-l-1 full-network-l-2 workspace-mgr))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^OCNNOutputLayer this]
    (-> this (.type))))

(defn label-probabilities
  "Description copied from class: BaseOutputLayer

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the likelihoods of each example and each label - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^OCNNOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.labelProbabilities examples))))

(defn needs-labels
  "Description copied from interface: IOutputLayer

  returns: true if this output layer needs labels or not - `boolean`"
  (^Boolean [^OCNNOutputLayer this]
    (-> this (.needsLabels))))

