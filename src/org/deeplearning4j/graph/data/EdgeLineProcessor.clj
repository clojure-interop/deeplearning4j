(ns org.deeplearning4j.graph.data.EdgeLineProcessor
  "EdgeLineProcessor is used during data loading from a file, where each edge is on a separate line
 Provides flexibility in loading graphs with arbitrary objects/properties that can be represented in a text format
 Can also be used handle conversion of edges between non-numeric vertices to an appropriate numbered format"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.data EdgeLineProcessor]))

(defn process-line
  "Process a line of text into an edge.
  May return null if line is not a valid edge (i.e., comment line etc)

  line - `java.lang.String`

  returns: `org.deeplearning4j.graph.api.Edge<E>`"
  (^org.deeplearning4j.graph.api.Edge [^EdgeLineProcessor this ^java.lang.String line]
    (-> this (.processLine line))))

