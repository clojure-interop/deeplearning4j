(ns org.deeplearning4j.graph.data.impl.DelimitedVertexLoader
  "Load vertex information, one per line of form \"0Some text attribute/label\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.data.impl DelimitedVertexLoader]))

(defn ->delimited-vertex-loader
  "Constructor.

  delimiter - `java.lang.String`
  ignore-lines-prefix - `java.lang.String`"
  (^DelimitedVertexLoader [^java.lang.String delimiter ^java.lang.String ignore-lines-prefix]
    (new DelimitedVertexLoader delimiter ignore-lines-prefix))
  (^DelimitedVertexLoader [^java.lang.String delimiter]
    (new DelimitedVertexLoader delimiter)))

(defn load-vertices
  "path - `java.lang.String`

  returns: `java.util.List<org.deeplearning4j.graph.api.Vertex<java.lang.String>>`

  throws: java.io.IOException"
  (^java.util.List [^DelimitedVertexLoader this ^java.lang.String path]
    (-> this (.loadVertices path))))

