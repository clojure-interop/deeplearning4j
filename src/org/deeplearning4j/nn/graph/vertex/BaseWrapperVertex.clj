(ns org.deeplearning4j.nn.graph.vertex.BaseWrapperVertex
  "A base class for wrapper vertices: i.e., those vertices that have another vertex inside.
 Use this as the basis of such wrapper vertices, which can selectively override only
 the vertices that are required."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex BaseWrapperVertex]))

(defn get-num-output-connections
  "Description copied from interface: GraphVertex

  returns: `int`"
  (^Integer [^BaseWrapperVertex this]
    (-> this (.getNumOutputConnections))))

(defn set-input-vertices
  "Description copied from interface: GraphVertex

  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseWrapperVertex this input-vertices]
    (-> this (.setInputVertices input-vertices))))

(defn set-input
  "Description copied from interface: GraphVertex

  input-number - Must be in range 0 to GraphVertex.getNumInputArrays()-1 - `int`
  input - The input array - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseWrapperVertex this ^Integer input-number ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setInput input-number input workspace-mgr))))

(defn set-epsilon
  "Description copied from interface: GraphVertex

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperVertex this ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.setEpsilon epsilon))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^BaseWrapperVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn param-table
  "Description copied from interface: GraphVertex

  backprop-only - If true: exclude unsupervised training parameters - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BaseWrapperVertex this ^Boolean backprop-only]
    (-> this (.paramTable backprop-only))))

(defn can-do-forward?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseWrapperVertex this]
    (-> this (.canDoForward))))

(defn has-layer?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseWrapperVertex this]
    (-> this (.hasLayer))))

(defn params
  "returns: 1d parameter vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperVertex this]
    (-> this (.params))))

(defn get-num-input-arrays
  "Description copied from interface: GraphVertex

  returns: `int`"
  (^Integer [^BaseWrapperVertex this]
    (-> this (.getNumInputArrays))))

(defn do-backward
  "Description copied from interface: GraphVertex

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^BaseWrapperVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn get-inputs
  "Description copied from interface: GraphVertex

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^BaseWrapperVertex this]
    (-> this (.getInputs))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperVertex this]
    (-> this (.getGradientsViewArray))))

(defn clear-vertex
  "Description copied from interface: GraphVertex"
  ([^BaseWrapperVertex this]
    (-> this (.clearVertex))))

(defn output-vertex?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseWrapperVertex this]
    (-> this (.isOutputVertex))))

(defn can-do-backward?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseWrapperVertex this]
    (-> this (.canDoBackward))))

(defn get-layer
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^BaseWrapperVertex this]
    (-> this (.getLayer))))

(defn input-vertex?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseWrapperVertex this]
    (-> this (.isInputVertex))))

(defn set-backprop-gradients-view-array
  "Description copied from interface: GraphVertex

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn num-params
  "returns: Number of parameters - `int`"
  (^Integer [^BaseWrapperVertex this]
    (-> this (.numParams))))

(defn set-layer-as-frozen
  "Description copied from interface: GraphVertex"
  ([^BaseWrapperVertex this]
    (-> this (.setLayerAsFrozen))))

(defn do-forward
  "Description copied from interface: GraphVertex

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn get-output-vertices
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseWrapperVertex this]
    (-> this (.getOutputVertices))))

(defn get-vertex-name
  "Description copied from interface: GraphVertex

  returns: `java.lang.String`"
  (^java.lang.String [^BaseWrapperVertex this]
    (-> this (.getVertexName))))

(defn set-output-vertex
  "Description copied from interface: GraphVertex

  output-vertex - `boolean`"
  ([^BaseWrapperVertex this ^Boolean output-vertex]
    (-> this (.setOutputVertex output-vertex))))

(defn get-input-vertices
  "Description copied from interface: GraphVertex

  returns: `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseWrapperVertex this]
    (-> this (.getInputVertices))))

(defn get-vertex-index
  "Description copied from interface: GraphVertex

  returns: `int`"
  (^Integer [^BaseWrapperVertex this]
    (-> this (.getVertexIndex))))

(defn clear
  "Description copied from interface: GraphVertex"
  ([^BaseWrapperVertex this]
    (-> this (.clear))))

(defn set-inputs
  "Description copied from interface: GraphVertex

  inputs - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseWrapperVertex this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.setInputs inputs))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^BaseWrapperVertex this]
    (-> this (.getConfig))))

(defn get-epsilon
  "Description copied from interface: GraphVertex

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseWrapperVertex this]
    (-> this (.getEpsilon))))

(defn set-output-vertices
  "Description copied from interface: GraphVertex

  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseWrapperVertex this output-vertices]
    (-> this (.setOutputVertices output-vertices))))

