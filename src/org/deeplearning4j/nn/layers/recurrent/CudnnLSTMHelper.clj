(ns org.deeplearning4j.nn.layers.recurrent.CudnnLSTMHelper
  "cuDNN-based helper for the recurrent LSTM layer (no peephole connections)."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent CudnnLSTMHelper]))

(defn ->cudnn-lstm-helper
  "Constructor."
  (^CudnnLSTMHelper []
    (new CudnnLSTMHelper )))

(defn check-supported
  "gate-activation-fn - `org.nd4j.linalg.activations.IActivation`
  activation-fn - `org.nd4j.linalg.activations.IActivation`
  has-peephole-connections - `boolean`

  returns: `boolean`"
  (^Boolean [^CudnnLSTMHelper this ^org.nd4j.linalg.activations.IActivation gate-activation-fn ^org.nd4j.linalg.activations.IActivation activation-fn ^Boolean has-peephole-connections]
    (-> this (.checkSupported gate-activation-fn activation-fn has-peephole-connections))))

(defn backprop-gradient
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gate-activation-fn - `org.nd4j.linalg.activations.IActivation`
  input - `org.nd4j.linalg.api.ndarray.INDArray`
  recurrent-weights - `org.nd4j.linalg.api.ndarray.INDArray`
  input-weights - `org.nd4j.linalg.api.ndarray.INDArray`
  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`
  truncated-bptt - `boolean`
  tbptt-backward-length - `int`
  fwd-pass - `org.deeplearning4j.nn.layers.recurrent.FwdPassReturn`
  forwards - `boolean`
  input-weight-key - `java.lang.String`
  recurrent-weight-key - `java.lang.String`
  bias-weight-key - `java.lang.String`
  gradient-views - `java.util.Map`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  has-peephole-connections - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^CudnnLSTMHelper this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.activations.IActivation gate-activation-fn ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray recurrent-weights ^org.nd4j.linalg.api.ndarray.INDArray input-weights ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Boolean truncated-bptt ^Integer tbptt-backward-length ^org.deeplearning4j.nn.layers.recurrent.FwdPassReturn fwd-pass ^Boolean forwards ^java.lang.String input-weight-key ^java.lang.String recurrent-weight-key ^java.lang.String bias-weight-key ^java.util.Map gradient-views ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^Boolean has-peephole-connections ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.backpropGradient conf gate-activation-fn input recurrent-weights input-weights epsilon truncated-bptt tbptt-backward-length fwd-pass forwards input-weight-key recurrent-weight-key bias-weight-key gradient-views mask-array has-peephole-connections workspace-mgr))))

(defn activate
  "layer - `org.deeplearning4j.nn.api.Layer`
  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gate-activation-fn - `org.nd4j.linalg.activations.IActivation`
  input - `org.nd4j.linalg.api.ndarray.INDArray`
  recurrent-weights - `org.nd4j.linalg.api.ndarray.INDArray`
  input-weights - `org.nd4j.linalg.api.ndarray.INDArray`
  biases - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  prev-output-activations - `org.nd4j.linalg.api.ndarray.INDArray`
  prev-mem-cell-state - `org.nd4j.linalg.api.ndarray.INDArray`
  for-backprop - `boolean`
  forwards - `boolean`
  input-weight-key - `java.lang.String`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  has-peephole-connections - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.deeplearning4j.nn.layers.recurrent.FwdPassReturn`"
  (^org.deeplearning4j.nn.layers.recurrent.FwdPassReturn [^CudnnLSTMHelper this ^org.deeplearning4j.nn.api.Layer layer ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.activations.IActivation gate-activation-fn ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray recurrent-weights ^org.nd4j.linalg.api.ndarray.INDArray input-weights ^org.nd4j.linalg.api.ndarray.INDArray biases ^Boolean training ^org.nd4j.linalg.api.ndarray.INDArray prev-output-activations ^org.nd4j.linalg.api.ndarray.INDArray prev-mem-cell-state ^Boolean for-backprop ^Boolean forwards ^java.lang.String input-weight-key ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^Boolean has-peephole-connections ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.activate layer conf gate-activation-fn input recurrent-weights input-weights biases training prev-output-activations prev-mem-cell-state for-backprop forwards input-weight-key mask-array has-peephole-connections workspace-mgr))))

(defn helper-memory-use
  "Description copied from interface: LayerHelper

  returns: Map of memory, may be null if none is used. - `java.util.Map<java.lang.String,java.lang.Long>`"
  (^java.util.Map [^CudnnLSTMHelper this]
    (-> this (.helperMemoryUse))))

