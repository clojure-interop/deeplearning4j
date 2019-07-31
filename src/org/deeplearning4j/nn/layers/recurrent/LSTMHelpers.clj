(ns org.deeplearning4j.nn.layers.recurrent.LSTMHelpers
  "RNN tutorial: http://deeplearning4j.org/usingrnns.html
 READ THIS FIRST if you want to understand what the heck is happening here.
 Shared code for the standard \"forwards\" LSTM RNN and the bidirectional LSTM RNN
 This was extracted from GravesLSTM and refactored into static helper functions. The general reasoning for this was
 so we only have math in one place, instead of two.
 Based on Graves: Supervised Sequence Labelling with Recurrent Neural Networks
 http://www.cs.toronto.edu/~graves/phd.pdf
 See also for full/vectorized equations (and a comparison to other LSTM variants):
 Greff et al. 2015, \"LSTM: A Search Space Odyssey\", pg11.

 When 'hasPeepholeConnections' is true, this is the \"vanilla\" variant in said paper
 When 'hasPeepholeConnections' is false, this is the \"no peephole\" variant
 http://arxiv.org/pdf/1503.04069.pdf"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.layers.recurrent LSTMHelpers]))

(defn *activate-helper
  "Returns FwdPassReturn object with activations/INDArrays. Allows activateHelper to be used for forward pass, backward pass
  and rnnTimeStep whilst being reasonably efficient for all

  layer - `org.deeplearning4j.nn.layers.BaseLayer`
  conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  gate-activation-fn - `org.nd4j.linalg.activations.IActivation`
  input - `org.nd4j.linalg.api.ndarray.INDArray`
  recurrent-weights - `org.nd4j.linalg.api.ndarray.INDArray`
  original-input-weights - `org.nd4j.linalg.api.ndarray.INDArray`
  biases - `org.nd4j.linalg.api.ndarray.INDArray`
  training - `boolean`
  original-prev-output-activations - `org.nd4j.linalg.api.ndarray.INDArray`
  original-prev-mem-cell-state - `org.nd4j.linalg.api.ndarray.INDArray`
  for-backprop - `boolean`
  forwards - `boolean`
  input-weight-key - `java.lang.String`
  mask-array - `org.nd4j.linalg.api.ndarray.INDArray`
  has-peephole-connections - `boolean`
  helper - `org.deeplearning4j.nn.layers.recurrent.LSTMHelper`
  cache-mode - `org.deeplearning4j.nn.conf.CacheMode`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.deeplearning4j.nn.layers.recurrent.FwdPassReturn`"
  (^org.deeplearning4j.nn.layers.recurrent.FwdPassReturn [^org.deeplearning4j.nn.layers.BaseLayer layer ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.activations.IActivation gate-activation-fn ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray recurrent-weights ^org.nd4j.linalg.api.ndarray.INDArray original-input-weights ^org.nd4j.linalg.api.ndarray.INDArray biases ^Boolean training ^org.nd4j.linalg.api.ndarray.INDArray original-prev-output-activations ^org.nd4j.linalg.api.ndarray.INDArray original-prev-mem-cell-state ^Boolean for-backprop ^Boolean forwards ^java.lang.String input-weight-key ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^Boolean has-peephole-connections ^org.deeplearning4j.nn.layers.recurrent.LSTMHelper helper ^org.deeplearning4j.nn.conf.CacheMode cache-mode ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (LSTMHelpers/activateHelper layer conf gate-activation-fn input recurrent-weights original-input-weights biases training original-prev-output-activations original-prev-mem-cell-state for-backprop forwards input-weight-key mask-array has-peephole-connections helper cache-mode workspace-mgr)))

(defn *backprop-gradient-helper
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
  helper - `org.deeplearning4j.nn.layers.recurrent.LSTMHelper`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^org.nd4j.linalg.primitives.Pair [^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^org.nd4j.linalg.activations.IActivation gate-activation-fn ^org.nd4j.linalg.api.ndarray.INDArray input ^org.nd4j.linalg.api.ndarray.INDArray recurrent-weights ^org.nd4j.linalg.api.ndarray.INDArray input-weights ^org.nd4j.linalg.api.ndarray.INDArray epsilon ^Boolean truncated-bptt ^Integer tbptt-backward-length ^org.deeplearning4j.nn.layers.recurrent.FwdPassReturn fwd-pass ^Boolean forwards ^java.lang.String input-weight-key ^java.lang.String recurrent-weight-key ^java.lang.String bias-weight-key ^java.util.Map gradient-views ^org.nd4j.linalg.api.ndarray.INDArray mask-array ^Boolean has-peephole-connections ^org.deeplearning4j.nn.layers.recurrent.LSTMHelper helper ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (LSTMHelpers/backpropGradientHelper conf gate-activation-fn input recurrent-weights input-weights epsilon truncated-bptt tbptt-backward-length fwd-pass forwards input-weight-key recurrent-weight-key bias-weight-key gradient-views mask-array has-peephole-connections helper workspace-mgr)))

(defn *get-memory-report
  "is-graves - `boolean`
  lstm-layer - `org.deeplearning4j.nn.conf.layers.FeedForwardLayer`
  input-type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^Boolean is-graves ^org.deeplearning4j.nn.conf.layers.FeedForwardLayer lstm-layer ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (LSTMHelpers/getMemoryReport is-graves lstm-layer input-type))
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^org.deeplearning4j.nn.conf.layers.AbstractLSTM lstm-layer ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (LSTMHelpers/getMemoryReport lstm-layer input-type)))

