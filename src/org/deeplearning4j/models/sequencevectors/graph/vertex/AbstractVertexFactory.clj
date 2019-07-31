(ns org.deeplearning4j.models.sequencevectors.graph.vertex.AbstractVertexFactory
  "VertexFactory implementation"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.vertex AbstractVertexFactory]))

(defn ->abstract-vertex-factory
  "Constructor."
  (^AbstractVertexFactory []
    (new AbstractVertexFactory )))

(defn create
  "vertex-idx - `int`
  element - `T`

  returns: `org.deeplearning4j.models.sequencevectors.graph.primitives.Vertex<T>`"
  (^org.deeplearning4j.models.sequencevectors.graph.primitives.Vertex [^AbstractVertexFactory this ^Integer vertex-idx element]
    (-> this (.create vertex-idx element)))
  (^org.deeplearning4j.models.sequencevectors.graph.primitives.Vertex [^AbstractVertexFactory this ^Integer vertex-idx]
    (-> this (.create vertex-idx))))

