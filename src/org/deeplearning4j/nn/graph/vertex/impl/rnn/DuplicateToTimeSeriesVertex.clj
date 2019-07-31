(ns org.deeplearning4j.nn.graph.vertex.impl.rnn.DuplicateToTimeSeriesVertex
  "DuplicateToTimeSeriesVertex is a vertex that goes from 2d activations to a 3d time series activations, by means of
 duplication. That is, given a 2d input with shape [numExamples,nIn] duplicate each row to give output of
 [numExamples,nIn,timeSeriesLength], where the activations are the same for all time steps.
 This method is used for example in sequence to sequence models.
 Note: The length of the output time series (number of time steps) is determined by means of referencing one of the
 inputs in the ComputationGraph. That is: Because the length of the time series may differ at runtime, we generally want the number
 of time steps to match some other input; here, we are specifying the length of the output time series to be the same as
 one of the input time series"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl.rnn DuplicateToTimeSeriesVertex]))

(defn ->duplicate-to-time-series-vertex
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  input-name - `java.lang.String`"
  (^DuplicateToTimeSeriesVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index input-vertices output-vertices ^java.lang.String input-name]
    (new DuplicateToTimeSeriesVertex graph name vertex-index input-vertices output-vertices input-name))
  (^DuplicateToTimeSeriesVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^java.lang.String input-vertex-name]
    (new DuplicateToTimeSeriesVertex graph name vertex-index input-vertex-name)))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^DuplicateToTimeSeriesVertex this]
    (-> this (.hasLayer))))

(defn output-vertex?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^DuplicateToTimeSeriesVertex this]
    (-> this (.isOutputVertex))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^DuplicateToTimeSeriesVertex this]
    (-> this (.getLayer))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^DuplicateToTimeSeriesVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^DuplicateToTimeSeriesVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^DuplicateToTimeSeriesVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^DuplicateToTimeSeriesVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DuplicateToTimeSeriesVertex this]
    (-> this (.toString))))

