(ns org.deeplearning4j.models.sequencevectors.graph.vertex.VertexFactory
  "Vertex factory, used to create nodes from an integer index (0 to nVertices-1 inclusive)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.vertex VertexFactory]))

(defn create
  "vertex-idx - `int`
  element - `T`

  returns: `org.deeplearning4j.models.sequencevectors.graph.primitives.Vertex<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.primitives.Vertex [^VertexFactory this ^Integer vertex-idx element]
    (-> this (.create vertex-idx element)))
  (^org.deeplearning4j.models.sequencevectors.graph.primitives.Vertex [^VertexFactory this ^Integer vertex-idx]
    (-> this (.create vertex-idx))))

