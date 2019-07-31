(ns org.deeplearning4j.nn.layers.samediff.SameDiffOutputLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.samediff SameDiffOutputLayer]))

(defn ->same-diff-output-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^SameDiffOutputLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new SameDiffOutputLayer conf)))

(def *-input-key
  "Static Constant.

  type: java.lang.String"
  SameDiffOutputLayer/INPUT_KEY)

(def *-labels-key
  "Static Constant.

  type: java.lang.String"
  SameDiffOutputLayer/LABELS_KEY)

(defn param-table
  "Description copied from interface: Model

  backprop-params-only - If true, return backprop params only. If false: return all params (equivalent toparamsTable()) - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^SameDiffOutputLayer this ^Boolean backprop-params-only]
    (-> this (.paramTable backprop-params-only)))
  (^java.util.Map [^SameDiffOutputLayer this]
    (-> this (.paramTable))))

(defn fit
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the example labels(a binary outcome matrix) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.fit examples labels)))
  ([^SameDiffOutputLayer this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.fit iter))))

(defn predict
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the labels for each example - `int[]`"
  ([^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.predict examples))))

(defn set-param
  "Description copied from interface: Model

  key - the key to se t - `java.lang.String`
  val - the new ndarray - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiffOutputLayer this ^java.lang.String key ^org.nd4j.linalg.api.ndarray.INDArray val]
    (-> this (.setParam key val))))

(defn params
  "Returns the parameters of the neural network as a flattened row vector

  returns: the parameters of the neural network - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOutputLayer this]
    (-> this (.params))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOutputLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn get-param
  "Description copied from interface: Model

  param - the key of the parameter - `java.lang.String`

  returns: the parameter vector/matrix with that particular key - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOutputLayer this ^java.lang.String param]
    (-> this (.getParam param))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOutputLayer this]
    (-> this (.getGradientsViewArray))))

(defn compute-score
  "Description copied from interface: IOutputLayer

  full-network-l-1 - L1 regularization term for the entire network - `double`
  full-network-l-2 - L2 regularization term for the entire network - `double`
  training - whether score should be calculated at train or test time (this affects things like application ofdropout, etc) - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: score (loss function) - `double`"
  (^Double [^SameDiffOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScore full-network-l-1 full-network-l-2 training workspace-mgr))))

(defn set-params-view-array
  "Description copied from interface: Model

  params - a 1 x nParams row vector that is a view of the larger (MLN/CG) parameters array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParamsViewArray params))))

(defn set-param-table
  "Description copied from interface: Model

  param-table - `java.util.Map`"
  ([^SameDiffOutputLayer this ^java.util.Map param-table]
    (-> this (.setParamTable param-table))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^SameDiffOutputLayer this]
    (-> this (.isPretrainLayer))))

(defn clear-noise-weight-params
  ""
  ([^SameDiffOutputLayer this]
    (-> this (.clearNoiseWeightParams))))

(defn set-params
  "Description copied from interface: Model

  params - the parameters for the model - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray params]
    (-> this (.setParams params))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: Model

  gradients - a 1 x nParams row vector that is a view of the larger (MLN/CG) gradients array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray gradients]
    (-> this (.setBackpropGradientsViewArray gradients))))

(defn num-params
  "Description copied from class: AbstractLayer

  returns: the number of parameters for the model - `int`"
  (^Integer [^SameDiffOutputLayer this]
    (-> this (.numParams))))

(defn f-1-score
  "Description copied from interface: Classifier

  examples - te the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the true labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the scores for each ndarray - `double`"
  (^Double [^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.f1Score examples labels)))
  (^Double [^SameDiffOutputLayer this ^org.nd4j.linalg.dataset.api.DataSet data]
    (-> this (.f1Score data))))

(defn compute-score-for-examples
  "Description copied from interface: IOutputLayer

  full-network-l-1 - L1 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  full-network-l-2 - L2 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: A column INDArray of shape [numExamples,1], where entry i is the score of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOutputLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScoreForExamples full-network-l-1 full-network-l-2 workspace-mgr))))

(defn label-probabilities
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the likelihoods of each example and each label - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SameDiffOutputLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.labelProbabilities examples))))

(defn clone
  "returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^SameDiffOutputLayer this]
    (-> this (.clone))))

(defn num-labels
  "Description copied from interface: Classifier

  returns: the number of possible labels for this classifier - `int`"
  (^Integer [^SameDiffOutputLayer this]
    (-> this (.numLabels))))

(defn needs-labels
  "Description copied from interface: IOutputLayer

  returns: true if this output layer needs labels or not - `boolean`"
  (^Boolean [^SameDiffOutputLayer this]
    (-> this (.needsLabels))))

