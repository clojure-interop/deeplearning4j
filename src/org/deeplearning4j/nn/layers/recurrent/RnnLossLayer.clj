(ns org.deeplearning4j.nn.layers.recurrent.RnnLossLayer
  "Recurrent Neural Network Loss Layer.
 Handles calculation of gradients etc for various objective functions.
 NOTE: Unlike RnnOutputLayer this RnnLossLayer does not have any parameters - i.e., there is no time
 distributed dense component here. Consequently, the output activations size is equal to the input size.
 Input and output activations are same as other RNN layers: 3 dimensions with shape
 [miniBatchSize,nIn,timeSeriesLength] and [miniBatchSize,nOut,timeSeriesLength] respectively."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent RnnLossLayer]))

(defn ->rnn-loss-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^RnnLossLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new RnnLossLayer conf)))

(defn fit
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the example labels(a binary outcome matrix) - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^RnnLossLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.fit examples labels)))
  ([^RnnLossLayer this ^org.nd4j.linalg.dataset.api.iterator.DataSetIterator iter]
    (-> this (.fit iter))))

(defn predict
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the labels for each example - `int[]`"
  ([^RnnLossLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.predict examples))))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^RnnLossLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn set-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^RnnLossLayer this ^org.nd4j.linalg.api.ndarray.INDArray mask-array]
    (-> this (.setMaskArray mask-array))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RnnLossLayer this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn compute-score
  "Description copied from interface: IOutputLayer

  full-network-l-1 - L1 regularization term for the entire network - `double`
  full-network-l-2 - L2 regularization term for the entire network - `double`
  training - whether score should be calculated at train or test time (this affects things like application ofdropout, etc) - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: score (loss function) - `double`"
  (^Double [^RnnLossLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScore full-network-l-1 full-network-l-2 training workspace-mgr))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^RnnLossLayer this]
    (-> this (.isPretrainLayer))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^RnnLossLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn f-1-score
  "Returns the f1 score for the given examples.
  Think of this to be like a percentage right.
  The higher the number the more it got right.
  This is on a scale from 0 to 1.

  examples - te the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`
  labels - the true labels - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the scores for each ndarray - `double`"
  (^Double [^RnnLossLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples ^org.nd4j.linalg.api.ndarray.INDArray labels]
    (-> this (.f1Score examples labels)))
  (^Double [^RnnLossLayer this ^org.nd4j.linalg.dataset.api.DataSet data]
    (-> this (.f1Score data))))

(defn compute-score-for-examples
  "Compute the score for each example individually, after labels and input have been set.

  full-network-l-1 - L1 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  full-network-l-2 - L2 regularization term for the entire network (or, 0.0 to not include regularization) - `double`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: A column INDArray of shape [numExamples,1], where entry i is the score of the ith example - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RnnLossLayer this ^Double full-network-l-1 ^Double full-network-l-2 ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.computeScoreForExamples full-network-l-1 full-network-l-2 workspace-mgr))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^RnnLossLayer this]
    (-> this (.type))))

(defn calc-l-1
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L1 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l1 regularization term for this layer. - `double`"
  (^Double [^RnnLossLayer this ^Boolean backprop-params-only]
    (-> this (.calcL1 backprop-params-only))))

(defn label-probabilities
  "Description copied from interface: Classifier

  examples - the examples to classify (one example in each row) - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: the likelihoods of each example and each label - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RnnLossLayer this ^org.nd4j.linalg.api.ndarray.INDArray examples]
    (-> this (.labelProbabilities examples))))

(defn calc-l-2
  "Description copied from interface: Layer

  backprop-params-only - If true: calculate L2 based on backprop params only. If false: calculatebased on all params (including pretrain params, if any) - `boolean`

  returns: the l2 regularization term for this layer. - `double`"
  (^Double [^RnnLossLayer this ^Boolean backprop-params-only]
    (-> this (.calcL2 backprop-params-only))))

(defn num-labels
  "Description copied from interface: Classifier

  returns: the number of possible labels for this classifier - `int`"
  (^Integer [^RnnLossLayer this]
    (-> this (.numLabels))))

(defn needs-labels
  "Description copied from interface: IOutputLayer

  returns: true if this output layer needs labels or not - `boolean`"
  (^Boolean [^RnnLossLayer this]
    (-> this (.needsLabels))))

