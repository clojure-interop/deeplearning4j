(ns org.deeplearning4j.nn.graph.vertex.VertexIndices
  "VertexIndices defines a pair of integers: the index of a vertex, and the edge number of that vertex.
 This is used for example in ComputationGraph to define the connection structure
 between GraphVertex objects in the graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex VertexIndices]))

(defn ->vertex-indices
  "Constructor."
  (^VertexIndices []
    (new VertexIndices )))

(defn get-vertex-index
  "Index of the vertex

  returns: `int`"
  (^Integer [^VertexIndices this]
    (-> this (.getVertexIndex))))

(defn get-vertex-edge-number
  "The edge number. Represents the index of the output of the vertex index, OR the index of the
  input to the vertex, depending on the context

  returns: `int`"
  (^Integer [^VertexIndices this]
    (-> this (.getVertexEdgeNumber))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^VertexIndices this]
    (-> this (.toString))))

