(ns org.deeplearning4j.graph.api.Vertex
  "Vertex in a graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.api Vertex]))

(defn ->vertex
  "Constructor."
  (^Vertex []
    (new Vertex )))

(defn vertex-id
  "returns: `int`"
  (^Integer [^Vertex this]
    (-> this (.vertexID))))

(defn get-value
  "returns: `T`"
  ([^Vertex this]
    (-> this (.getValue))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Vertex this]
    (-> this (.toString))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^Vertex this ^java.lang.Object o]
    (-> this (.equals o))))

(defn hash-code
  "returns: `int`"
  (^Integer [^Vertex this]
    (-> this (.hashCode))))

