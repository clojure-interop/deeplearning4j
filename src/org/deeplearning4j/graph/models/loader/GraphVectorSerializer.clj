(ns org.deeplearning4j.graph.models.loader.GraphVectorSerializer
  "GraphVectorSerializer: Provide static methods to save and load DeepWalk/Graph vectors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.models.loader GraphVectorSerializer]))

(defn *write-graph-vectors
  "deep-walk - `org.deeplearning4j.graph.models.deepwalk.DeepWalk`
  path - `java.lang.String`

  throws: java.io.IOException"
  ([^org.deeplearning4j.graph.models.deepwalk.DeepWalk deep-walk ^java.lang.String path]
    (GraphVectorSerializer/writeGraphVectors deep-walk path)))

(defn *load-txt-vectors
  "file - `java.io.File`

  returns: `org.deeplearning4j.graph.models.GraphVectors`

  throws: java.io.IOException"
  (^org.deeplearning4j.graph.models.GraphVectors [^java.io.File file]
    (GraphVectorSerializer/loadTxtVectors file)))

