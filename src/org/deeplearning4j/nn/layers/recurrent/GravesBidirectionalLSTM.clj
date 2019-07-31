(ns org.deeplearning4j.nn.layers.recurrent.GravesBidirectionalLSTM
  "RNN tutorial: http://deeplearning4j.org/usingrnns.html
 READ THIS FIRST
 Bdirectional LSTM layer implementation.
 Based on Graves: Supervised Sequence Labelling with Recurrent Neural Networks
 http://www.cs.toronto.edu/~graves/phd.pdf
 See also for full/vectorized equations (and a comparison to other LSTM variants):
 Greff et al. 2015, \"LSTM: A Search Space Odyssey\", pg11. This is the \"vanilla\" variant in said paper
 http://arxiv.org/pdf/1503.04069.pdf
 A high level description of bidirectional LSTM can be found from
 \"Hybrid Speech Recognition with Deep Bidirectional LSTM\"
 http://www.cs.toronto.edu/~graves/asru_2013.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent GravesBidirectionalLSTM]))

(defn ->graves-bidirectional-lstm
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^GravesBidirectionalLSTM [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new GravesBidirectionalLSTM conf input))
  (^GravesBidirectionalLSTM [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new GravesBidirectionalLSTM conf)))

(defn gradient
  "Description copied from interface: Model

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^GravesBidirectionalLSTM this]
    (-> this (.gradient))))

(defn feed-forward-mask-array
  "Description copied from interface: Layer

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^GravesBidirectionalLSTM this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn activate
  "Description copied from interface: Layer

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesBidirectionalLSTM this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesBidirectionalLSTM this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^GravesBidirectionalLSTM this]
    (-> this (.isPretrainLayer))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^GravesBidirectionalLSTM this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn type
  "Description copied from interface: Layer

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^GravesBidirectionalLSTM this]
    (-> this (.type))))

(defn rnn-time-step
  "Description copied from interface: RecurrentLayer

  input - Input to this layer - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesBidirectionalLSTM this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnTimeStep input workspace-mgr))))

(defn rnn-activate-using-stored-state
  "Description copied from interface: RecurrentLayer

  input - Layer input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - if true: training. Otherwise: test - `boolean`
  store-last-for-tbptt - If true: store the final state in tBpttStateMap for use in truncated BPTT training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Layer activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesBidirectionalLSTM this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^Boolean store-last-for-tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnActivateUsingStoredState input training store-last-for-tbptt workspace-mgr))))

(defn tbptt-backprop-gradient
  "Description copied from interface: RecurrentLayer

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  tbptt-backward-length - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^GravesBidirectionalLSTM this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Integer tbptt-backward-length ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.tbpttBackpropGradient epsilon tbptt-backward-length workspace-mgr))))

