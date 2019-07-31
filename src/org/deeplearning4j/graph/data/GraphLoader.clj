(ns org.deeplearning4j.graph.data.GraphLoader
  "Utility methods for loading graphs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.data GraphLoader]))

(defn *load-undirected-graph-edge-list-file
  "Simple method for loading an undirected graph, where the graph is represented by a edge list with one edge
  per line with a delimiter in between
  This method assumes that all lines in the file are of the form i<delim>j where i and j are integers
  in range 0 to numVertices inclusive, and \"\" is the user-provided delimiter

  path - Path to the edge list file - `java.lang.String`
  num-vertices - number of vertices in the graph - `int`
  delim - `java.lang.String`
  allow-multiple-edges - If set to false, the graph will not allow multiple edges between any two vertices to exist. However,checking for duplicates during graph loading can be costly, so use allowMultipleEdges=true whenpossible. - `boolean`

  returns: graph - `org.deeplearning4j.graph.graph.Graph<java.lang.String,java.lang.String>`

  throws: java.io.IOException - if file cannot be read"
  (^org.deeplearning4j.graph.graph.Graph [^java.lang.String path ^Integer num-vertices ^java.lang.String delim ^Boolean allow-multiple-edges]
    (GraphLoader/loadUndirectedGraphEdgeListFile path num-vertices delim allow-multiple-edges))
  (^org.deeplearning4j.graph.graph.Graph [^java.lang.String path ^Integer num-vertices ^java.lang.String delim]
    (GraphLoader/loadUndirectedGraphEdgeListFile path num-vertices delim)))

(defn *load-weighted-edge-list-file
  "Method for loading a weighted graph from an edge list file, where each edge (inc. weight) is represented by a
  single line. Graph may be directed or undirected
  This method assumes that edges are of the format: fromIndex<delim>toIndex<delim>edgeWeight where <delim>
  is the delimiter.

  path - Path to the edge list file - `java.lang.String`
  num-vertices - The number of vertices in the graph - `int`
  delim - The delimiter used in the file (typically: \",\" or \" \" etc) - `java.lang.String`
  directed - whether the edges should be treated as directed (true) or undirected (false) - `boolean`
  allow-multiple-edges - If set to false, the graph will not allow multiple edges between any two vertices to exist. However,checking for duplicates during graph loading can be costly, so use allowMultipleEdges=true whenpossible. - `boolean`
  ignore-lines-starting-with - Starting characters for comment lines. May be null. For example: \"//\" or \"#\" - `java.lang.String`

  returns: The graph - `org.deeplearning4j.graph.graph.Graph<java.lang.String,java.lang.Double>`

  throws: java.io.IOException"
  (^org.deeplearning4j.graph.graph.Graph [^java.lang.String path ^Integer num-vertices ^java.lang.String delim ^Boolean directed ^Boolean allow-multiple-edges ^java.lang.String ignore-lines-starting-with]
    (GraphLoader/loadWeightedEdgeListFile path num-vertices delim directed allow-multiple-edges ignore-lines-starting-with))
  (^org.deeplearning4j.graph.graph.Graph [^java.lang.String path ^Integer num-vertices ^java.lang.String delim ^Boolean directed ^java.lang.String ignore-lines-starting-with]
    (GraphLoader/loadWeightedEdgeListFile path num-vertices delim directed ignore-lines-starting-with)))

(defn *load-graph
  "Load a graph into memory, using a given EdgeLineProcessor.
  Assume one edge per line

  path - Path to the file containing the edges, one per line - `java.lang.String`
  line-processor - EdgeLineProcessor used to convert lines of text into a graph (or null for comment lines etc) - `org.deeplearning4j.graph.data.EdgeLineProcessor`
  vertex-factory - Used to create vertices - `org.deeplearning4j.graph.vertexfactory.VertexFactory`
  num-vertices - number of vertices in the graph - `int`
  allow-multiple-edges - whether the graph should allow multiple edges between a given pair of vertices or not - `boolean`

  returns: IGraph - `<V,E> org.deeplearning4j.graph.graph.Graph<V,E>`

  throws: java.io.IOException"
  ([^java.lang.String path ^org.deeplearning4j.graph.data.EdgeLineProcessor line-processor ^org.deeplearning4j.graph.vertexfactory.VertexFactory vertex-factory ^Integer num-vertices ^Boolean allow-multiple-edges]
    (GraphLoader/loadGraph path line-processor vertex-factory num-vertices allow-multiple-edges)))

