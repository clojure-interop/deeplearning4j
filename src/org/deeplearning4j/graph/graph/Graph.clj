(ns org.deeplearning4j.graph.graph.Graph
  "Graph, where all edges and vertices are stored in-memory.
 Internally, this is a directed graph with adjacency list representation; however, if undirected edges
 are added, these edges are duplicated internally to allow for fast lookup.
 Depending on the value of allowMultipleEdges, this graph implementation may or may not allow
 multiple edges between any two adjacent nodes. If multiple edges are required (such that two or more distinct edges
 between vertices X and Y exist simultaneously) then allowMultipleEdges should be set to true.
 As per IGraph, this graph representation can have arbitrary objects attached
 Vertices are initialized either directly via list, or via a VertexFactory. Edges are added using one of the
 addEdge methods."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.graph Graph]))

(defn ->graph
  "Constructor.

  num-vertices - `int`
  allow-multiple-edges - `boolean`
  vertex-factory - `org.deeplearning4j.graph.vertexfactory.VertexFactory`"
  (^Graph [^Integer num-vertices ^Boolean allow-multiple-edges ^org.deeplearning4j.graph.vertexfactory.VertexFactory vertex-factory]
    (new Graph num-vertices allow-multiple-edges vertex-factory))
  (^Graph [^Integer num-vertices ^org.deeplearning4j.graph.vertexfactory.VertexFactory vertex-factory]
    (new Graph num-vertices vertex-factory))
  (^Graph [^java.util.List vertices]
    (new Graph vertices)))

(defn get-vertex
  "Description copied from interface: IGraph

  idx - integer index of the vertex to get. must be in range 0 to numVertices() - `int`

  returns: vertex - `org.deeplearning4j.graph.api.Vertex<V>`"
  (^org.deeplearning4j.graph.api.Vertex [^Graph this ^Integer idx]
    (-> this (.getVertex idx))))

(defn get-random-connected-vertex
  "Description copied from interface: IGraph

  vertex - vertex to randomly sample from - `int`
  rng - Random number generator to use - `java.util.Random`

  returns: A vertex connected to the specified vertex, - `org.deeplearning4j.graph.api.Vertex<V>`

  throws: org.deeplearning4j.graph.exception.NoEdgesException - thrown if the specified vertex has no edges, or no outgoing edges (in the caseof a directed graph)."
  (^org.deeplearning4j.graph.api.Vertex [^Graph this ^Integer vertex ^java.util.Random rng]
    (-> this (.getRandomConnectedVertex vertex rng))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Graph this]
    (-> this (.toString))))

(defn get-edges-out
  "Description copied from interface: IGraph

  vertex - index of the vertex to - `int`

  returns: list of edges for this vertex - `java.util.List<org.deeplearning4j.graph.api.Edge<E>>`"
  (^java.util.List [^Graph this ^Integer vertex]
    (-> this (.getEdgesOut vertex))))

(defn num-vertices
  "Description copied from interface: IGraph

  returns: `int`"
  (^Integer [^Graph this]
    (-> this (.numVertices))))

(defn get-vertices
  "Description copied from interface: IGraph

  from - first vertex to get, inclusive - `int`
  to - last vertex to get, inclusive - `int`

  returns: list of vertices - `java.util.List<org.deeplearning4j.graph.api.Vertex<V>>`"
  (^java.util.List [^Graph this ^Integer from ^Integer to]
    (-> this (.getVertices from to)))
  (^java.util.List [^Graph this indexes]
    (-> this (.getVertices indexes))))

(defn get-connected-vertices
  "Description copied from interface: IGraph

  vertex - Index of the vertex - `int`

  returns: list of vertices that the specified vertex is connected to - `java.util.List<org.deeplearning4j.graph.api.Vertex<V>>`"
  (^java.util.List [^Graph this ^Integer vertex]
    (-> this (.getConnectedVertices vertex))))

(defn get-vertex-degree
  "Description copied from interface: IGraph

  vertex - vertex to get degree for - `int`

  returns: vertex degree - `int`"
  (^Integer [^Graph this ^Integer vertex]
    (-> this (.getVertexDegree vertex))))

(defn add-edge
  "Description copied from interface: IGraph

  edge - `org.deeplearning4j.graph.api.Edge`"
  ([^Graph this ^org.deeplearning4j.graph.api.Edge edge]
    (-> this (.addEdge edge))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Graph this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Graph this ^java.lang.Object o]
    (-> this (.equals o))))

(defn get-connected-vertex-indices
  "Description copied from interface: IGraph

  vertex - index of the vertex - `int`

  returns: list of vertices that the specified vertex is connected to - `int[]`"
  ([^Graph this ^Integer vertex]
    (-> this (.getConnectedVertexIndices vertex))))

