(ns org.deeplearning4j.graph.vertexfactory.StringVertexFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.vertexfactory StringVertexFactory]))

(defn ->string-vertex-factory
  "Constructor.

  format - `java.lang.String`"
  (^StringVertexFactory [^java.lang.String format]
    (new StringVertexFactory format))
  (^StringVertexFactory []
    (new StringVertexFactory )))

(defn create
  "vertex-idx - `int`

  returns: `org.deeplearning4j.graph.api.Vertex<java.lang.String>`"
  (^org.deeplearning4j.graph.api.Vertex [^StringVertexFactory this ^Integer vertex-idx]
    (-> this (.create vertex-idx))))

