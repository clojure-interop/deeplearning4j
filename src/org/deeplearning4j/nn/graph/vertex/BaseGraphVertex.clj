(ns org.deeplearning4j.nn.graph.vertex.BaseGraphVertex
  "BaseGraphVertex defines a set of common functionality for GraphVertex instances."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex BaseGraphVertex]))

(defn get-num-output-connections
  "Description copied from interface: GraphVertex

  returns: `int`"
  (^Integer [^BaseGraphVertex this]
    (-> this (.getNumOutputConnections))))

(defn set-input-vertices
  "Description copied from interface: GraphVertex

  input-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseGraphVertex this input-vertices]
    (-> this (.setInputVertices input-vertices))))

(defn set-input
  "Description copied from interface: GraphVertex

  input-number - Must be in range 0 to GraphVertex.getNumInputArrays()-1 - `int`
  input - The input array - `org.nd4j.linalg.api.ndarray.INDArray`
  workspace-mgr - `org.deeplearning4j.nn.workspace.LayerWorkspaceMgr`"
  ([^BaseGraphVertex this ^Integer input-number ^org.nd4j.linalg.api.ndarray.INDArray input ^org.deeplearning4j.nn.workspace.LayerWorkspaceMgr workspace-mgr]
    (-> this (.setInput input-number input workspace-mgr))))

(defn set-epsilon
  "Description copied from interface: GraphVertex

  epsilon - `org.nd4j.linalg.api.ndarray.INDArray`"
  ([^BaseGraphVertex this ^org.nd4j.linalg.api.ndarray.INDArray epsilon]
    (-> this (.setEpsilon epsilon))))

(defn param-table
  "Description copied from interface: GraphVertex

  backprop-only - If true: exclude unsupervised training parameters - `boolean`

  returns: Parameter table - `java.util.Map<java.lang.String,org.nd4j.linalg.api.ndarray.INDArray>`"
  (^java.util.Map [^BaseGraphVertex this ^Boolean backprop-only]
    (-> this (.paramTable backprop-only))))

(defn can-do-forward?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseGraphVertex this]
    (-> this (.canDoForward))))

(defn params
  "returns: 1d parameter vector - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseGraphVertex this]
    (-> this (.params))))

(defn get-num-input-arrays
  "Description copied from interface: GraphVertex

  returns: `int`"
  (^Integer [^BaseGraphVertex this]
    (-> this (.getNumInputArrays))))

(defn get-gradients-view-array
  "returns: 1D gradients view array - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseGraphVertex this]
    (-> this (.getGradientsViewArray))))

(defn clear-vertex
  "Description copied from interface: GraphVertex"
  ([^BaseGraphVertex this]
    (-> this (.clearVertex))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseGraphVertex this]
    (-> this (.toString))))

(defn can-do-backward?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseGraphVertex this]
    (-> this (.canDoBackward))))

(defn input-vertex?
  "Description copied from interface: GraphVertex

  returns: `boolean`"
  (^Boolean [^BaseGraphVertex this]
    (-> this (.isInputVertex))))

(defn num-params
  "returns: Number of parameters - `int`"
  (^Integer [^BaseGraphVertex this]
    (-> this (.numParams))))

(defn set-layer-as-frozen
  "Description copied from interface: GraphVertex"
  ([^BaseGraphVertex this]
    (-> this (.setLayerAsFrozen))))

(defn get-output-vertices
  "A representation of the vertices that this vertex is connected to (outputs duing forward pass)
  Specifically, if outputVertices[X].getVertexIndex() = Y, and outputVertices[X].getVertexEdgeNumber() = Z
  then the Xth output of this vertex is connected to the Zth input of vertex Y

  returns: `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseGraphVertex this]
    (-> this (.getOutputVertices))))

(defn get-vertex-name
  "Description copied from interface: GraphVertex

  returns: `java.lang.String`"
  (^java.lang.String [^BaseGraphVertex this]
    (-> this (.getVertexName))))

(defn get-input-vertices
  "A representation of the vertices that are inputs to this vertex (inputs duing forward pass)
  Specifically, if inputVertices[X].getVertexIndex() = Y, and inputVertices[X].getVertexEdgeNumber() = Z
  then the Zth output of vertex Y is the Xth input to this vertex

  returns: `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseGraphVertex this]
    (-> this (.getInputVertices))))

(defn get-vertex-index
  "Description copied from interface: GraphVertex

  returns: `int`"
  (^Integer [^BaseGraphVertex this]
    (-> this (.getVertexIndex))))

(defn clear
  "Description copied from interface: GraphVertex"
  ([^BaseGraphVertex this]
    (-> this (.clear))))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^BaseGraphVertex this]
    (-> this (.getConfig))))

(defn get-epsilon
  "Description copied from interface: GraphVertex

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^BaseGraphVertex this]
    (-> this (.getEpsilon))))

(defn set-output-vertices
  "Description copied from interface: GraphVertex

  output-vertices - `org.deeplearning4j.nn.graph.vertex.VertexIndices[]`"
  ([^BaseGraphVertex this output-vertices]
    (-> this (.setOutputVertices output-vertices))))

