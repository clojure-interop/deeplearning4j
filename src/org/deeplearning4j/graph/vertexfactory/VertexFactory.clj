(ns org.deeplearning4j.graph.vertexfactory.VertexFactory
  "Vertex factory, used to create nodes from an integer index (0 to nVertices-1 inclusive)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.vertexfactory VertexFactory]))

(defn create
  "vertex-idx - `int`

  returns: `org.deeplearning4j.graph.api.Vertex<T>`"
  (^org.deeplearning4j.graph.api.Vertex [^VertexFactory this ^Integer vertex-idx]
    (-> this (.create vertex-idx))))

