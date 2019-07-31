(ns org.deeplearning4j.nn.graph.vertex.impl.SubsetVertex
  "SubsetVertex is used to select a subset of the activations out of another GraphVertex.
 For example, a subset of the activations out of a layer.
 Note that this subset is specifying by means of an interval of the original activations.
 For example, to get the first 10 activations of a layer (or, first 10 features out of a CNN layer) use
 new SubsetVertex(0,9).
 In the case of convolutional (4d) activations, this is done along channels."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl SubsetVertex]))

(defn ->subset-vertex
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  from - `int`
  to - `int`"
  (^SubsetVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index input-vertices output-vertices ^Integer from ^Integer to]
    (new SubsetVertex graph name vertex-index input-vertices output-vertices from to))
  (^SubsetVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^Integer from ^Integer to]
    (new SubsetVertex graph name vertex-index from to)))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^SubsetVertex this]
    (-> this (.hasLayer))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^SubsetVertex this]
    (-> this (.getLayer))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^SubsetVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^SubsetVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^SubsetVertex this]
    (-> this (.toString))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^SubsetVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^SubsetVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

