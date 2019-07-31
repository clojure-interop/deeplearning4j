(ns org.deeplearning4j.graph.vertexfactory.IntegerVertexFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.vertexfactory IntegerVertexFactory]))

(defn ->integer-vertex-factory
  "Constructor."
  (^IntegerVertexFactory []
    (new IntegerVertexFactory )))

(defn create
  "vertex-idx - `int`

  returns: `org.deeplearning4j.graph.api.Vertex<java.lang.Integer>`"
  (^org.deeplearning4j.graph.api.Vertex [^IntegerVertexFactory this ^Integer vertex-idx]
    (-> this (.create vertex-idx))))

