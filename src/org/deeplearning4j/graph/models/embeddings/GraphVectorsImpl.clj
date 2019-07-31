(ns org.deeplearning4j.graph.models.embeddings.GraphVectorsImpl
  "Base implementation for GraphVectors. Used in DeepWalk, and also when loading
 graph vectors from file."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models.embeddings GraphVectorsImpl]))

(defn ->graph-vectors-impl
  "Constructor."
  (^GraphVectorsImpl []
    (new GraphVectorsImpl )))

(defn get-graph
  "returns: `org.deeplearning4j.graph.api.IGraph<V,E>`"
  (^org.deeplearning4j.graph.api.IGraph [^GraphVectorsImpl this]
    (-> this (.getGraph))))

(defn num-vertices
  "returns: `int`"
  (^Integer [^GraphVectorsImpl this]
    (-> this (.numVertices))))

(defn get-vector-size
  "returns: `int`"
  (^Integer [^GraphVectorsImpl this]
    (-> this (.getVectorSize))))

(defn get-vertex-vector
  "vertex - `org.deeplearning4j.graph.api.Vertex`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GraphVectorsImpl this ^org.deeplearning4j.graph.api.Vertex vertex]
    (-> this (.getVertexVector vertex))))

(defn vertices-nearest
  "vertex-idx - `int`
  top - `int`

  returns: `int[]`"
  ([^GraphVectorsImpl this ^Integer vertex-idx ^Integer top]
    (-> this (.verticesNearest vertex-idx top))))

(defn similarity
  "Returns the cosine similarity of the vector representations of two vertices in the graph

  vertex-1 - `org.deeplearning4j.graph.api.Vertex`
  vertex-2 - `org.deeplearning4j.graph.api.Vertex`

  returns: Cosine similarity of two vertices - `double`"
  (^Double [^GraphVectorsImpl this ^org.deeplearning4j.graph.api.Vertex vertex-1 ^org.deeplearning4j.graph.api.Vertex vertex-2]
    (-> this (.similarity vertex-1 vertex-2))))

