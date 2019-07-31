(ns org.deeplearning4j.nn.layers.recurrent.SimpleRnn
  "Simple RNN - aka \"vanilla\" RNN is the simplest type of recurrent neural network layer.
 It implements out_t = activationFn( in_t * inWeight  out_(t-1) * recurrentWeights  bias).
 Note that other architectures (LSTM, etc) are usually more effective, especially for longer time series"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent SimpleRnn]))

(defn ->simple-rnn
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^SimpleRnn [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new SimpleRnn conf)))

(def *-state-key-prev-activation
  "Static Constant.

  type: java.lang.String"
  SimpleRnn/STATE_KEY_PREV_ACTIVATION)

(defn rnn-time-step
  "Description copied from interface: RecurrentLayer

  input - Input to this layer - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SimpleRnn this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnTimeStep input workspace-mgr))))

(defn rnn-activate-using-stored-state
  "Description copied from interface: RecurrentLayer

  input - Layer input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - if true: training. Otherwise: test - `boolean`
  store-last-for-tbptt - If true: store the final state in tBpttStateMap for use in truncated BPTT training - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Layer activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SimpleRnn this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^Boolean store-last-for-tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnActivateUsingStoredState input training store-last-for-tbptt workspace-mgr))))

(defn backprop-gradient
  "Description copied from interface: Layer

  epsilon - w^(L+1)*delta^(L+1). Or, equiv: dC/da, i.e., (dC/dz)*(dz/da) = dC/da, where Cis cost function a=sigma(z) is activation. - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Pair where Gradient is gradient for this layer, INDArray is epsilon (activation gradient)
  needed by next layer, but before element-wise multiply by sigmaPrime(z). So for standard feed-forward layer, if this layer is
  L, then return.getSecond() == dL/dIn = (w^(L)*(delta^(L))^T)^T. Note that the returned array should be placed in the
  ArrayType.ACTIVATION_GRAD workspace via the workspace manager - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^SimpleRnn this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient epsilon workspace-mgr))))

(defn tbptt-backprop-gradient
  "Description copied from interface: RecurrentLayer

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  tbptt-back-length - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^SimpleRnn this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Integer tbptt-back-length ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.tbpttBackpropGradient epsilon tbptt-back-length workspace-mgr))))

(defn pretrain-layer?
  "Description copied from interface: Layer

  returns: true if the layer can be pretrained (using fit(INDArray), false otherwise - `boolean`"
  (^Boolean [^SimpleRnn this]
    (-> this (.isPretrainLayer))))

(defn activate
  "Description copied from interface: Layer

  training - training or test mode - `boolean`
  workspace-mgr - Workspace manager - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: the activation (layer output) of the last specified input. Note that the returned array should be placed
  in the ArrayType.ACTIVATIONS workspace via the workspace manager - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SimpleRnn this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate training workspace-mgr))))

