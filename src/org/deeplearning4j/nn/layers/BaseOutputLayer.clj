(ns org.deeplearning4j.nn.layers.BaseOutputLayer
  "Output layer with different objective
 in co-occurrences for different objectives.
 This includes classification as well as prediction"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers BaseOutputLayer]))

(defn ->base-output-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseOutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new BaseOutputLayer conf input))
  (^BaseOutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new BaseOutputLayer conf)))

(defn set-labels
  "Description copied from interface: IOutputLayer

  labels - Labels array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.setLabels labels))))

(defn fit
  "Fit the model

  input - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the example labels(a binary outcome matrix) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.fit input labels)))
  ([^BaseOutputLayer this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.fit iter))))

(defn predict
  "Returns the predictions for each example in the dataset

  input - the matrix to predict - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the prediction for the dataset - `int[]`"
  ([^BaseOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.predict input))))

(defn gradient
  "Gets the gradient from one training iteration

  returns: the gradient (bias and weight matrix) - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^BaseOutputLayer this]
    (-> this (.gradient))))

(defn compute-gradient-and-score
  "Description copied from interface: Model

  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseOutputLayer this ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeGradientAndScore workspace-mgr))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr))))

(defn compute-score
  "Compute score after labels and input have been set.

  full-network-l-1 - L1 regularization term for the entire network - `double`
  full-network-l-2 - L2 regularization term for the entire network - `double`
  training - whether score should be calculated at train or test time (this affects things like application ofdropout, etc) - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: score (loss function) - `double`"
  (^Double [^BaseOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScore full-network-l-1 full-network-l-2 training workspace-mgr))))

(defn has-bias?
  "Description copied from class: BaseLayer

  returns: True if a bias term is present, false otherwise - `boolean`"
  (^Boolean [^BaseOutputLayer this]
    (-> this (.hasBias))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^BaseOutputLayer this]
    (-> this (.isPretrainLayer))))

(defn get-labels
  "Description copied from interface: IOutputLayer

  returns: Labels array, or null if it has not been set - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseOutputLayer this]
    (-> this (.getLabels))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn f-1-score
  "Returns the f1 score for the given examples.
  Think of this to be like a percentage right.
  The higher the number the more it got right.
  This is on a scale from 0 to 1.

  examples - te the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the true labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the scores for each ndarray - `double`"
  (^Double [^BaseOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.f1Score examples labels)))
  (^Double [^BaseOutputLayer this ^org.nd4j.linalg.dataset.api.DataSet data]
    (-> this (.f1Score data))))

(defn compute-score-for-examples
  "Compute the score for each example individually, after labels and input have been set.

  full-network-l-1 - L1 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  full-network-l-2 - L2 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: A column INDArray of shape [numExamples,1], where entry i is the score of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScoreForExamples full-network-l-1 full-network-l-2 workspace-mgr))))

(defn label-probabilities
  "Returns the probabilities for each label
  for each example row wise

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the likelihoods of each example and each label - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.labelProbabilities examples))))

(defn num-labels
  "Returns the number of possible labels

  returns: the number of possible labels for this classifier - `int`"
  (^Integer [^BaseOutputLayer this]
    (-> this (.numLabels))))

(defn clear
  "Description copied from interface: Model"
  ([^BaseOutputLayer this]
    (-> this (.clear))))

(defn needs-labels
  "Description copied from interface: IOutputLayer

  returns: true if this output layer needs labels or not - `boolean`"
  (^Boolean [^BaseOutputLayer this]
    (-> this (.needsLabels))))

(defn gradient-and-score
  "Description copied from interface: Model

  returns: the gradient and score - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,java.lang.Double>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseOutputLayer this]
    (-> this (.gradientAndScore))))

