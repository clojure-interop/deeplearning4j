(ns org.deeplearning4j.nn.layers.recurrent.GravesLSTM
  "Deprecated.
 Will be eventually removed. Use LSTM instead, which has similar prediction accuracy, but supports
 CuDNN for faster network training on CUDA (Nvidia) GPUs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent GravesLSTM]))

(defn ->graves-lstm
  "Constructor.

  Deprecated.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^GravesLSTM [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new GravesLSTM conf input))
  (^GravesLSTM [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new GravesLSTM conf)))

(def *-state-key-prev-activation
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  GravesLSTM/STATE_KEY_PREV_ACTIVATION)

(def *-state-key-prev-memcell
  "Static Constant.

  Deprecated.

  type: java.lang.String"
  GravesLSTM/STATE_KEY_PREV_MEMCELL)

(defn gradient
  "Deprecated.

  returns: the gradient for this model, as calculated before - `org.deeplearning4j.nn.gradient.Gradient`"
  (^org.deeplearning4j.nn.gradient.Gradient [^GravesLSTM this]
    (-> this (.gradient))))

(defn feed-forward-mask-array
  "Deprecated.

  mask-array - Mask array to set - `org.nd4j.linalg.api.ndarray.INDArray`
  current-mask-state - Current state of the mask - see MaskState - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - Current minibatch size. Needs to be known as it cannot always be inferred from the activationsarray due to reshaping (such as a DenseLayer within a recurrent neural network) - `int`

  returns: New mask array after this layer, along with the new mask state. - `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^GravesLSTM this ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArray mask-array current-mask-state minibatch-size))))

(defn activate
  "Deprecated.

  input - the input to use - `org.nd4j.linalg.api.ndarray.INDArray`
  training - train or test mode - `boolean`
  workspace-mgr - Workspace manager. - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Activations array. Note that the returned array should be placed in the
  ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesLSTM this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate input training workspace-mgr)))
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesLSTM this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

(defn pretrain-layer?
  "Deprecated.

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^GravesLSTM this]
    (-> this (.isPretrainLayer))))

(defn backprop-gradient
  "Deprecated.

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^GravesLSTM this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn type
  "Deprecated.

  returns: `org.deeplearning4j.nn.api.Layer$Type`"
  (^org.deeplearning4j.nn.api.Layer$Type [^GravesLSTM this]
    (-> this (.type))))

(defn rnn-time-step
  "Deprecated.

  input - Input to this layer - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesLSTM this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnTimeStep input workspace-mgr))))

(defn rnn-activate-using-stored-state
  "Deprecated.

  input - Layer input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - if true: training. Otherwise: test - `boolean`
  store-last-for-tbptt - If true: store the final state in tBpttStateMap for use in truncated BPTT training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Layer activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GravesLSTM this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^Boolean store-last-for-tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnActivateUsingStoredState input training store-last-for-tbptt workspace-mgr))))

(defn tbptt-backprop-gradient
  "Deprecated.

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  tbptt-backward-length - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^GravesLSTM this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Integer tbptt-backward-length ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.tbpttBackpropGradient epsilon tbptt-backward-length workspace-mgr))))

