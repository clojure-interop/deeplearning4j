(ns org.deeplearning4j.graph.graph.VertexSequence
  "A vertex sequence represents a sequences of vertices in a graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.graph VertexSequence]))

(defn ->vertex-sequence
  "Constructor.

  graph - `org.deeplearning4j.graph.api.IGraph`
  indices - `int[]`"
  (^VertexSequence [^org.deeplearning4j.graph.api.IGraph graph indices]
    (new VertexSequence graph indices)))

(defn sequence-length
  "Description copied from interface: IVertexSequence

  returns: `int`"
  (^Integer [^VertexSequence this]
    (-> this (.sequenceLength))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^VertexSequence this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.graph.api.Vertex<V>`"
  (^org.deeplearning4j.graph.api.Vertex [^VertexSequence this]
    (-> this (.next))))

(defn remove
  ""
  ([^VertexSequence this]
    (-> this (.remove))))

