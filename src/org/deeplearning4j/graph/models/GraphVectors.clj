(ns org.deeplearning4j.graph.models.GraphVectors
  "Vectors for nodes in a graph.
 Provides lookup table and convenience methods for graph vectors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models GraphVectors]))

(defn get-graph
  "returns: `org.deeplearning4j.graph.api.IGraph<V,E>`"
  (^org.deeplearning4j.graph.api.IGraph [^GraphVectors this]
    (-> this (.getGraph))))

(defn num-vertices
  "returns: `int`"
  (^Integer [^GraphVectors this]
    (-> this (.numVertices))))

(defn get-vector-size
  "returns: `int`"
  (^Integer [^GraphVectors this]
    (-> this (.getVectorSize))))

(defn get-vertex-vector
  "vertex - `org.deeplearning4j.graph.api.Vertex`

  returns: `org.nd4j.linalg.api.ndarray.INDArray`"
  (^org.nd4j.linalg.api.ndarray.INDArray [^GraphVectors this ^org.deeplearning4j.graph.api.Vertex vertex]
    (-> this (.getVertexVector vertex))))

(defn vertices-nearest
  "vertex-idx - `int`
  top - `int`

  returns: `int[]`"
  ([^GraphVectors this ^Integer vertex-idx ^Integer top]
    (-> this (.verticesNearest vertex-idx top))))

(defn similarity
  "vertex-1 - `org.deeplearning4j.graph.api.Vertex`
  vertex-2 - `org.deeplearning4j.graph.api.Vertex`

  returns: `double`"
  (^Double [^GraphVectors this ^org.deeplearning4j.graph.api.Vertex vertex-1 ^org.deeplearning4j.graph.api.Vertex vertex-2]
    (-> this (.similarity vertex-1 vertex-2))))

