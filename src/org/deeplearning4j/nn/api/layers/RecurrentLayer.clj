(ns org.deeplearning4j.nn.api.layers.RecurrentLayer
  "Created by Alex on 28/08/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.api.layers RecurrentLayer]))

(defn rnn-time-step
  "Do one or more time steps using the previous time step state stored in stateMap.
  Can be used to efficiently do forward pass one or n-steps at a time (instead of doing
  forward pass always from t=0)
  If stateMap is empty, default initialization (usually zeros) is used
  Implementations also update stateMap at the end of this method

  input - Input to this layer - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RecurrentLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.rnnTimeStep input workspace-mgr))))

(defn rnn-get-previous-state
  "Returns a shallow copy of the RNN stateMap (that contains the stored history for use in methods such
  as rnnTimeStep

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^RecurrentLayer this]
    (-> this (.rnnGetPreviousState))))

(defn rnn-set-previous-state
  "Set the stateMap (stored history). Values set using this method will be used in next call to rnnTimeStep()

  state-map - `java.util.Map`"
  ([^RecurrentLayer this ^java.util.Map state-map]
    (-> this (.rnnSetPreviousState state-map))))

(defn rnn-clear-previous-state
  "Reset/clear the stateMap for rnnTimeStep() and tBpttStateMap for rnnActivateUsingStoredState()"
  ([^RecurrentLayer this]
    (-> this (.rnnClearPreviousState))))

(defn rnn-activate-using-stored-state
  "Similar to rnnTimeStep, this method is used for activations using the state
  stored in the stateMap as the initialization. However, unlike rnnTimeStep this
  method does not alter the stateMap; therefore, unlike rnnTimeStep, multiple calls to
  this method (with identical input) will:
  (a) result in the same output
  (b) leave the state maps (both stateMap and tBpttStateMap) in an identical state

  input - Layer input - `org.nd4j.linalg.api.ndarray.INDArray`
  training - if true: training. Otherwise: test - `boolean`
  store-last-for-tbptt - If true: store the final state in tBpttStateMap for use in truncated BPTT training - `boolean`
  workspace-mg - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: Layer activations - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^RecurrentLayer this ^org.nd4j.linalg.api.ndarray.INDArray input ^Boolean training ^Boolean store-last-for-tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mg]
    (-> this (.rnnActivateUsingStoredState input training store-last-for-tbptt workspace-mg))))

(defn rnn-get-tbptt-state
  "Get the RNN truncated backpropagations through time (TBPTT) state for the recurrent layer.
  The TBPTT state is used to store intermediate activations/state between updating parameters when doing
  TBPTT learning

  returns: State for the RNN layer - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^RecurrentLayer this]
    (-> this (.rnnGetTBPTTState))))

(defn rnn-set-tbptt-state
  "Set the RNN truncated backpropagations through time (TBPTT) state for the recurrent layer.
  The TBPTT state is used to store intermediate activations/state between updating parameters when doing
  TBPTT learning

  state - TBPTT state to set - `java.util.Map`"
  ([^RecurrentLayer this ^java.util.Map state]
    (-> this (.rnnSetTBPTTState state))))

(defn tbptt-backprop-gradient
  "Truncated BPTT equivalent of Layer.backpropGradient().
  Primary difference here is that forward pass in the context of BPTT is that we do
  forward pass using stored state for truncated BPTT vs. from zero initialization
  for standard BPTT.

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  tbptt-back-length - `int`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^RecurrentLayer this ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Integer tbptt-back-length ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.tbpttBackpropGradient epsilon tbptt-back-length workspace-mgr))))

