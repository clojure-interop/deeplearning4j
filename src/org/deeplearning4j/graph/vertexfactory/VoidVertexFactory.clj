(ns org.deeplearning4j.graph.vertexfactory.VoidVertexFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.vertexfactory VoidVertexFactory]))

(defn ->void-vertex-factory
  "Constructor."
  (^VoidVertexFactory []
    (new VoidVertexFactory )))

(defn create
  "vertex-idx - `int`

  returns: `org.deeplearning4j.graph.api.Vertex<java.lang.Void>`"
  (^org.deeplearning4j.graph.api.Vertex [^VoidVertexFactory this ^Integer vertex-idx]
    (-> this (.create vertex-idx))))

