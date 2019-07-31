(ns org.deeplearning4j.nn.graph.vertex.impl.ShiftVertex
  "A ShiftVertex is used to shift the activations of a single layer
 One could use it to add a bias or as part of some other calculation.
 For example, Highway Layers need them in two places. One, it's often
 useful to have the gate weights have a large negative bias. (Of course
 for this, we could just initialize the biases that way.)
 But, _also_ it needs to do this:
 (1-sigmoid(weight * input  bias)) (*) input  sigmoid(weight * input  bias) (*) activation(w2 * input  bias) ((*) is hadamard product)
 So, here, we could have
 1. a DenseLayer that does the sigmoid
 2. a ScaleVertex(-1) and
 3. a ShiftVertex(1)
 to accomplish that."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl ShiftVertex]))

(defn ->shift-vertex
  "Constructor.

  graph - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - `java.lang.String`
  vertex-index - `int`
  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`
  shift-factor - `double`"
  (^ShiftVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index input-vertices output-vertices ^Double shift-factor]
    (new ShiftVertex graph name vertex-index input-vertices output-vertices shift-factor))
  (^ShiftVertex [^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer vertex-index ^Double shift-factor]
    (new ShiftVertex graph name vertex-index shift-factor)))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^ShiftVertex this]
    (-> this (.hasLayer))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^ShiftVertex this]
    (-> this (.getLayer))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^ShiftVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^ShiftVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^ShiftVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ShiftVertex this]
    (-> this (.toString))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^ShiftVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

