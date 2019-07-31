(ns org.deeplearning4j.nn.layers.recurrent.BaseRecurrentLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent BaseRecurrentLayer]))

(defn ->base-recurrent-layer
  "Constructor.

  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  input - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^BaseRecurrentLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.api.ndarray.INDArray input]
    (new BaseRecurrentLayer conf input))
  (^BaseRecurrentLayer [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (new BaseRecurrentLayer conf)))

(defn rnn-get-previous-state
  "Returns a shallow copy of the stateMap

  returns: `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BaseRecurrentLayer this]
    (-> this (.rnnGetPreviousState))))

(defn rnn-set-previous-state
  "Set the state map. Values set using this method will be used
  in next call to rnnTimeStep()

  state-map - `java.util.Map`"
  ([^BaseRecurrentLayer this ^java.util.Map state-map]
    (-> this (.rnnSetPreviousState state-map))))

(defn rnn-clear-previous-state
  "Reset/clear the stateMap for rnnTimeStep() and tBpttStateMap for rnnActivateUsingStoredState()"
  ([^BaseRecurrentLayer this]
    (-> this (.rnnClearPreviousState))))

(defn rnn-get-tbptt-state
  "Description copied from interface: RecurrentLayer

  returns: State for the RNN layer - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BaseRecurrentLayer this]
    (-> this (.rnnGetTBPTTState))))

(defn rnn-set-tbptt-state
  "Description copied from interface: RecurrentLayer

  state - TBPTT state to set - `java.util.Map`"
  ([^BaseRecurrentLayer this ^java.util.Map state]
    (-> this (.rnnSetTBPTTState state))))

