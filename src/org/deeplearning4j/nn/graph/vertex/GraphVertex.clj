(ns org.deeplearning4j.nn.graph.vertex.GraphVertex
  "A GraphVertex is a vertex in the computation graph. It may contain Layer, or define some arbitrary forward/backward pass
 behaviour based on the inputs.
 The purposes of GraphVertex instances are as follows:
 1. To track the (local) network connection structure: i.e., a GraphVertex knows about the vertices on the input and output sides
 2. To store intermediate results (activations and epsilons)
 3. To allow forward pass and backward pass to be conducted, once the intermediate results are set"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex GraphVertex]))

(defn get-num-output-connections
  "Get the number of outgoing connections from this GraphVertex. A GraphVertex may only have a single output (for
  example, the activations out of a layer), but this output may be used as the input to an arbitrary number of other
  GraphVertex instances. This method returns the number of GraphVertex instances the output of this GraphVertex is input for.

  returns: `int`"
  (^Integer [^GraphVertex this]
    (-> this (.getNumOutputConnections))))

(defn set-input-vertices
  "Sets the input vertices.

  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^GraphVertex this input-vertices]
    (-> this (.setInputVertices input-vertices))))

(defn set-input
  "Set the input activations.

  input-number - Must be in range 0 to getNumInputArrays()-1 - `int`
  input - The input array - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^GraphVertex this ^Integer input-number ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setInput input-number input workspace-mgr))))

(defn set-epsilon
  "Set the errors (epsilon - aka dL/dActivation) for this GraphVertex

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GraphVertex this ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.setEpsilon epsilon))))

(defn feed-forward-mask-arrays
  "mask-arrays - `org.nd4j.linalg.api.ndarray.INDArray[]`
  current-mask-state - `org.deeplearning4j.nn.api.MaskState`
  minibatch-size - `int`

  returns: `org.nd4j.linalg.primitives.Pair<org.nd4j.linalg.api.ndarray.INDArray,org.deeplearning4j.nn.api.MaskState>`"
  (^org.nd4j.linalg.primitives.Pair [^GraphVertex this mask-arrays ^org.deeplearning4j.nn.api.MaskState current-mask-state ^Integer minibatch-size]
    (-> this (.feedForwardMaskArrays mask-arrays current-mask-state minibatch-size))))

(defn param-table
  "Get the parameter table for the vertex

  backprop-only - If true: exclude unsupervised training parameters - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^GraphVertex this ^Boolean backprop-only]
    (-> this (.paramTable backprop-only))))

(defn can-do-forward?
  "Whether the GraphVertex can do forward pass. Typically, this is just whether all inputs are set.

  returns: `boolean`"
  (^Boolean [^GraphVertex this]
    (-> this (.canDoForward))))

(defn has-layer?
  "Whether the GraphVertex contains a Layer object or not

  returns: `boolean`"
  (^Boolean [^GraphVertex this]
    (-> this (.hasLayer))))

(defn get-num-input-arrays
  "Get the number of input arrays. For example, a Layer may have only one input array, but in general a GraphVertex
  may have an arbtrary (>=1) number of input arrays (for example, from multiple other layers)

  returns: `int`"
  (^Integer [^GraphVertex this]
    (-> this (.getNumInputArrays))))

(defn do-backward
  "Do backward pass

  tbptt - If true: do backprop using truncated BPTT - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The gradients (may be null), and the errors/epsilons for all inputs to this GraphVertex - `org.nd4j.linalg.primitives.Pair<org.deeplearning4j.nn.gradient.Gradient,org.nd4j.linalg.api.ndarray.INDArray[]>`"
  ([^GraphVertex this ^Boolean tbptt ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doBackward tbptt workspace-mgr))))

(defn get-inputs
  "Get the array of inputs previously set for this GraphVertex

  returns: `org.nd4j.linalg.api.ndarray.INDArray[]`"
  ([^GraphVertex this]
    (-> this (.getInputs))))

(defn clear-vertex
  "This method clears inpjut for this vertex"
  ([^GraphVertex this]
    (-> this (.clearVertex))))

(defn output-vertex?
  "Whether the GraphVertex is an output vertex

  returns: `boolean`"
  (^Boolean [^GraphVertex this]
    (-> this (.isOutputVertex))))

(defn can-do-backward?
  "Whether the GraphVertex can do backward pass. Typically, this is just whether all errors/epsilons are set

  returns: `boolean`"
  (^Boolean [^GraphVertex this]
    (-> this (.canDoBackward))))

(defn get-layer
  "Get the Layer (if any). Returns null if hasLayer() == false

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^GraphVertex this]
    (-> this (.getLayer))))

(defn input-vertex?
  "Whether the GraphVertex is an input vertex

  returns: `boolean`"
  (^Boolean [^GraphVertex this]
    (-> this (.isInputVertex))))

(defn set-backprop-gradients-view-array
  "See Model.setBackpropGradientsViewArray(INDArray)

  backprop-gradients-view-array - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GraphVertex this ^org.nd4j.linalg.api.ndarray.INDArray backprop-gradients-view-array]
    (-> this (.setBackpropGradientsViewArray backprop-gradients-view-array))))

(defn set-layer-as-frozen
  "Only applies to layer vertices. Will throw exceptions on others.
  If applied to a layer vertex it will treat the parameters of the layer within it as constant.
  Activations through these will be calculated as they would as test time regardless of training mode"
  ([^GraphVertex this]
    (-> this (.setLayerAsFrozen))))

(defn do-forward
  "Do forward pass using the stored inputs

  training - if true: forward pass at training time. If false: forward pass at test time - `boolean`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`

  returns: The output (for example, activations) of the GraphVertex - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GraphVertex this ^Boolean training ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.doForward training workspace-mgr))))

(defn get-output-vertices
  "A representation of the vertices that this vertex is connected to (outputs duing forward pass)
  Specifically, if outputVertices[X].getVertexIndex() = Y, and outputVertices[X].getVertexEdgeNumber() = Z
  then the Xth output of this vertex is connected to the Zth input of vertex Y

  returns: `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^GraphVertex this]
    (-> this (.getOutputVertices))))

(defn get-vertex-name
  "Get the name/label of the GraphVertex

  returns: `java.lang.String`"
  (^java.lang.String [^GraphVertex this]
    (-> this (.getVertexName))))

(defn set-output-vertex
  "Set the GraphVertex to be an output vertex

  output-vertex - `boolean`"
  ([^GraphVertex this ^Boolean output-vertex]
    (-> this (.setOutputVertex output-vertex))))

(defn get-input-vertices
  "A representation of the vertices that are inputs to this vertex (inputs duing forward pass)
  Specifically, if inputVertices[X].getVertexIndex() = Y, and inputVertices[X].getVertexEdgeNumber() = Z
  then the Zth output connection (see getNumOutputConnections() of vertex Y is the Xth input to this vertex

  returns: `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^GraphVertex this]
    (-> this (.getInputVertices))))

(defn get-vertex-index
  "Get the index of the GraphVertex

  returns: `int`"
  (^Integer [^GraphVertex this]
    (-> this (.getVertexIndex))))

(defn clear
  "Clear the internal state (if any) of the GraphVertex. For example, any stored inputs/errors"
  ([^GraphVertex this]
    (-> this (.clear))))

(defn set-inputs
  "Set all inputs for this GraphVertex

  inputs - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^GraphVertex this ^org.nd4j.linalg.api.ndarray.INDArray inputs]
    (-> this (.setInputs inputs))))

(defn get-epsilon
  "Get the epsilon/error (i.e., dL/dOutput) array previously set for this GraphVertex

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GraphVertex this]
    (-> this (.getEpsilon))))

(defn set-output-vertices
  "set the output vertices.

  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^GraphVertex this output-vertices]
    (-> this (.setOutputVertices output-vertices))))

