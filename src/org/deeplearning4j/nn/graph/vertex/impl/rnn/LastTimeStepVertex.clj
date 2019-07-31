(ns org.deeplearning4j.nn.graph.vertex.impl.rnn.LastTimeStepVertex
  "LastTimeStepVertex is used in the context of recurrent neural network activations, to go from 3d (time series)
 activations to 2d activations, by extracting out the last time step of activations for each example.
 This can be used for example in sequence to sequence architectures, and potentially for sequence classification.
 NOTE: Because RNNs may have masking arrays (to allow for examples/time series of different lengths in the same
 minibatch), it is necessary to provide the same of the network input that has the corresponding mask array. If this
 input does not have a mask array, the last time step of the input will be used for all examples; otherwise, the time
 step of the last non-zero entry in the mask array (for each example separately) will be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl.rnn LastTimeStepVertex]))

(defn ->last-time-step-vertex
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  input-name - `java.lang.String`"
  (^LastTimeStepVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index input-vertices output-vertices ^java.lang.String input-name]
    (new LastTimeStepVertex graph name vertex-index input-vertices output-vertices input-name))
  (^LastTimeStepVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^java.lang.String input-name]
    (new LastTimeStepVertex graph name vertex-index input-name)))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^LastTimeStepVertex this]
    (-> this (.hasLayer))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^LastTimeStepVertex this]
    (-> this (.getLayer))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^LastTimeStepVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^LastTimeStepVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^LastTimeStepVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^LastTimeStepVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LastTimeStepVertex this]
    (-> this (.toString))))

