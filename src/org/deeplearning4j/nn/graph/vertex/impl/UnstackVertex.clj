(ns org.deeplearning4j.nn.graph.vertex.impl.UnstackVertex
  "UnstackVertex allows for unstacking of inputs so that they may be forwarded through
 a network. This is useful for cases such as Triplet Embedding, where embeddings can
 be separated and run through subsequent layers.
 Works similarly to SubsetVertex, except on dimension 0 of the input. stackSize is
 explicitly defined by the user to properly calculate an step."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl UnstackVertex]))

(defn ->unstack-vertex
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  from - `int`
  stack-size - `int`"
  (^UnstackVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index input-vertices output-vertices ^Integer from ^Integer stack-size]
    (new UnstackVertex graph name vertex-index input-vertices output-vertices from stack-size))
  (^UnstackVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^Integer from ^Integer stack-size]
    (new UnstackVertex graph name vertex-index from stack-size)))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^UnstackVertex this]
    (-> this (.hasLayer))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^UnstackVertex this]
    (-> this (.getLayer))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^UnstackVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^UnstackVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^UnstackVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^UnstackVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UnstackVertex this]
    (-> this (.toString))))

