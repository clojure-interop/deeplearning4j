(ns org.deeplearning4j.graph.data.impl.DelimitedEdgeLineProcessor
  "A simple line processor, for data in the format
 01\\n 30\\n etc. Order per line is nodeFrom -> nodeTo, in the case of directed edges
 i.e., one edge per line without any additional edge information"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.data.impl DelimitedEdgeLineProcessor]))

(defn ->delimited-edge-line-processor
  "Constructor.

  delimiter - `java.lang.String`
  directed - `boolean`
  skip-lines-starting-with - `java.lang.String`"
  (^DelimitedEdgeLineProcessor [^java.lang.String delimiter ^Boolean directed ^java.lang.String skip-lines-starting-with]
    (new DelimitedEdgeLineProcessor delimiter directed skip-lines-starting-with))
  (^DelimitedEdgeLineProcessor [^java.lang.String delimiter ^Boolean directed]
    (new DelimitedEdgeLineProcessor delimiter directed)))

(defn process-line
  "Description copied from interface: EdgeLineProcessor

  line - `java.lang.String`

  returns: `org.deeplearning4j.graph.api.Edge<java.lang.String>`"
  (^org.deeplearning4j.graph.api.Edge [^DelimitedEdgeLineProcessor this ^java.lang.String line]
    (-> this (.processLine line))))

