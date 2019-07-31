(ns org.deeplearning4j.graph.data.VertexLoader
  "Interface defines a method of leading vertices from a file."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.data VertexLoader]))

(defn load-vertices
  "path - `java.lang.String`

  returns: `java.util.List<org.deeplearning4j.graph.api.Vertex<V>>`

  throws: java.io.IOException"
  (^java.util.List [^VertexLoader this ^java.lang.String path]
    (-> this (.loadVertices path))))

