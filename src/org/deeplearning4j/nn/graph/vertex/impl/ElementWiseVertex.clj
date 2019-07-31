(ns org.deeplearning4j.nn.graph.vertex.impl.ElementWiseVertex
  "An ElementWiseVertex is used to combine the activations of two or more layer in an element-wise manner
 For example, the activations may be combined by addition, subtraction or multiplication or by selecting the maximum.
 Addition, Average, Product and Max may use an arbitrary number of input arrays. Note that in the case of subtraction, only two inputs may be used.
 In all cases, the shape of the input arrays must be identical."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl ElementWiseVertex]))

(defn ->element-wise-vertex
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  op - `org.deeplearning4j.nn.graph.vertex.impl.ElementWiseVertex$Op`"
  (^ElementWiseVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index input-vertices output-vertices ^org.deeplearning4j.nn.graph.vertex.impl.ElementWiseVertex$Op op]
    (new ElementWiseVertex graph name vertex-index input-vertices output-vertices op))
  (^ElementWiseVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^org.deeplearning4j.nn.graph.vertex.impl.ElementWiseVertex$Op op]
    (new ElementWiseVertex graph name vertex-index op)))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^ElementWiseVertex this]
    (-> this (.hasLayer))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^ElementWiseVertex this]
    (-> this (.getLayer))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ElementWiseVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^ElementWiseVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ElementWiseVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^ElementWiseVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ElementWiseVertex this]
    (-> this (.toString))))

