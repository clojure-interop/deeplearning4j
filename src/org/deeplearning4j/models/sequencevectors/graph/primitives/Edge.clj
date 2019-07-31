(ns org.deeplearning4j.models.sequencevectors.graph.primitives.Edge
  "Edge in a graph. May be a directed or undirected edge.
 Parameterized, and may store a value/object associated with the edge"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.primitives Edge]))

(defn ->edge
  "Constructor.

  from - `int`
  to - `int`
  value - `T`
  directed - `boolean`"
  (^Edge [^Integer from ^Integer to value ^Boolean directed]
    (new Edge from to value directed)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Edge this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Edge this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Edge this]
    (-> this (.hashCode))))

