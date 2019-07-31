(ns org.deeplearning4j.graph.api.IGraph
  "Interface for a IGraph, with objects for each vertex and edge.
 In the simplest case, edges and vertices may be labelled (i.e., IGraph for example), or may be
 any arbitrary object (or, null).
 IGraph may include directed edges, undirected edges, or a combination of both
 Note: Every vertex in the graph has an integer index, in range of 0 to numVertices() inclusive"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.api IGraph]))

(defn get-vertex
  "Get a vertex in the graph for a given index

  idx - integer index of the vertex to get. must be in range 0 to numVertices() - `int`

  returns: vertex - `org.deeplearning4j.graph.api.Vertex<V>`"
  (^org.deeplearning4j.graph.api.Vertex [^IGraph this ^Integer idx]
    (-> this (.getVertex idx))))

(defn get-random-connected-vertex
  "Randomly sample a vertex connected to a given vertex. Sampling is done uniformly at random.
  Specifically, returns a random X such that either a directed edge (vertex -> X) exists,
  or an undirected edge (vertex -- X) exists
  Can be used for example to implement a random walk on the graph (specifically: a unweighted random walk)

  vertex - vertex to randomly sample from - `int`
  rng - Random number generator to use - `java.util.Random`

  returns: A vertex connected to the specified vertex, - `org.deeplearning4j.graph.api.Vertex<V>`

  throws: org.deeplearning4j.graph.exception.NoEdgesException - thrown if the specified vertex has no edges, or no outgoing edges (in the caseof a directed graph)."
  (^org.deeplearning4j.graph.api.Vertex [^IGraph this ^Integer vertex ^java.util.Random rng]
    (-> this (.getRandomConnectedVertex vertex rng))))

(defn get-edges-out
  "Returns a list of edges for a vertex with a given index
  For undirected graphs, returns all edges incident on the vertex
  For directed graphs, only returns outward directed edges

  vertex - index of the vertex to - `int`

  returns: list of edges for this vertex - `java.util.List<org.deeplearning4j.graph.api.Edge<E>>`"
  (^java.util.List [^IGraph this ^Integer vertex]
    (-> this (.getEdgesOut vertex))))

(defn num-vertices
  "Number of vertices in the graph

  returns: `int`"
  (^Integer [^IGraph this]
    (-> this (.numVertices))))

(defn get-vertices
  "Get multiple vertices in the graph, with secified indices

  from - first vertex to get, inclusive - `int`
  to - last vertex to get, inclusive - `int`

  returns: list of vertices - `java.util.List<org.deeplearning4j.graph.api.Vertex<V>>`"
  (^java.util.List [^IGraph this ^Integer from ^Integer to]
    (-> this (.getVertices from to)))
  (^java.util.List [^IGraph this indexes]
    (-> this (.getVertices indexes))))

(defn get-connected-vertices
  "Get a list of all of the vertices that the specified vertex is connected to
  Specifically, for undirected graphs return list of all X such that (vertex -- X) exists
  For directed graphs, return list of all X such that (vertex -> X) exists

  vertex - Index of the vertex - `int`

  returns: list of vertices that the specified vertex is connected to - `java.util.List<org.deeplearning4j.graph.api.Vertex<V>>`"
  (^java.util.List [^IGraph this ^Integer vertex]
    (-> this (.getConnectedVertices vertex))))

(defn get-vertex-degree
  "Returns the degree of the vertex.
  For undirected graphs, this is just the degree.
  For directed graphs, this returns the outdegree

  vertex - vertex to get degree for - `int`

  returns: vertex degree - `int`"
  (^Integer [^IGraph this ^Integer vertex]
    (-> this (.getVertexDegree vertex))))

(defn add-edge
  "Convenience method for adding an edge (directed or undirected) to graph

  from - `int`
  to - `int`
  value - `E`
  directed - `boolean`"
  ([^IGraph this ^Integer from ^Integer to value ^Boolean directed]
    (-> this (.addEdge from to value directed)))
  ([^IGraph this ^org.deeplearning4j.graph.api.Edge edge]
    (-> this (.addEdge edge))))

(defn get-connected-vertex-indices
  "Return an array of indexes of vertices that the specified vertex is connected to.
  Specifically, for undirected graphs return int[] of all X.vertexID() such that (vertex -- X) exists
  For directed graphs, return int[] of all X.vertexID() such that (vertex -> X) exists

  vertex - index of the vertex - `int`

  returns: list of vertices that the specified vertex is connected to - `int[]`"
  ([^IGraph this ^Integer vertex]
    (-> this (.getConnectedVertexIndices vertex))))

