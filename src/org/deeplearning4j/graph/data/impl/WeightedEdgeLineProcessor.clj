(ns org.deeplearning4j.graph.data.impl.WeightedEdgeLineProcessor
  "A simple line processor, for data in the format 0<delim>1<delim>weight. Order per line is nodeFrom -> nodeTo, in
 the case of directed edges, and the weights are assumed to be doubles
 i.e., one edge per line without any additional edge information"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.data.impl WeightedEdgeLineProcessor]))

(defn ->weighted-edge-line-processor
  "Constructor.

  delimiter - `java.lang.String`
  directed - `boolean`
  skip-lines-starting-with - `java.lang.String`"
  (^WeightedEdgeLineProcessor [^java.lang.String delimiter ^Boolean directed ^java.lang.String skip-lines-starting-with]
    (new WeightedEdgeLineProcessor delimiter directed skip-lines-starting-with))
  (^WeightedEdgeLineProcessor [^java.lang.String delimiter ^Boolean directed]
    (new WeightedEdgeLineProcessor delimiter directed)))

(defn process-line
  "Description copied from interface: EdgeLineProcessor

  line - `java.lang.String`

  returns: `org.deeplearning4j.graph.api.Edge<java.lang.Double>`"
  (^org.deeplearning4j.graph.api.Edge [^WeightedEdgeLineProcessor this ^java.lang.String line]
    (-> this (.processLine line))))

