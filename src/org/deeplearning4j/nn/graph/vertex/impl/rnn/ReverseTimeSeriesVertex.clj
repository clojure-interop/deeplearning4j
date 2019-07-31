(ns org.deeplearning4j.nn.graph.vertex.impl.rnn.ReverseTimeSeriesVertex
  "ReverseTimeSeriesVertex is used in recurrent neural networks to revert the order of time series.
 As a result, the last time step is moved to the beginning of the time series and the first time step
 is moved to the end. This allows recurrent layers to backward process time series.
 Masks: The input might be masked (to allow for varying time series lengths in one minibatch). In this case the
 present input (mask array = 1) will be reverted in place and the padding (mask array = 0) will be left untouched at
 the same place. For a time series of length n, this would normally mean, that the first n time steps are reverted and
 the following padding is left untouched, but more complex masks are supported (e.g. [1, 0, 1, 0, ...]."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl.rnn ReverseTimeSeriesVertex]))

(defn ->reverse-time-series-vertex
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  input-name - `java.lang.String`"
  (^ReverseTimeSeriesVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^java.lang.String input-name]
    (new ReverseTimeSeriesVertex graph name vertex-index input-name)))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^ReverseTimeSeriesVertex this]
    (-> this (.hasLayer))))

(defn output-vertex?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^ReverseTimeSeriesVertex this]
    (-> this (.isOutputVertex))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^ReverseTimeSeriesVertex this]
    (-> this (.getLayer))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ReverseTimeSeriesVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^ReverseTimeSeriesVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ReverseTimeSeriesVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^ReverseTimeSeriesVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ReverseTimeSeriesVertex this]
    (-> this (.toString))))

