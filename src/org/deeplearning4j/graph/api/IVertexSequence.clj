(ns org.deeplearning4j.graph.api.IVertexSequence
  "Represents a sequence of vertices in a graph.
 General-purpose, but can be used to represent a walk on a graph, for example."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.api IVertexSequence]))

(defn sequence-length
  "Length of the vertex sequence

  returns: `int`"
  (^Integer [^IVertexSequence this]
    (-> this (.sequenceLength))))

