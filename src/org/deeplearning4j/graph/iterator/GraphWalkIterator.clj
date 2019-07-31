(ns org.deeplearning4j.graph.iterator.GraphWalkIterator
  "Interface/iterator representing a sequence of walks on a graph
 For example, a GraphWalkIterator<T> can represesnt a set of independent random walks on a graph"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.graph.iterator GraphWalkIterator]))

(defn walk-length
  "Length of the walks returned by next()
  Note that a walk of length i contains i+1 vertices

  returns: `int`"
  (^Integer [^GraphWalkIterator this]
    (-> this (.walkLength))))

(defn next
  "Get the next vertex sequence.

  returns: `org.deeplearning4j.graph.api.IVertexSequence<T>`"
  (^org.deeplearning4j.graph.api.IVertexSequence [^GraphWalkIterator this]
    (-> this (.next))))

(defn has-next?
  "Whether the iterator has any more vertex sequences.

  returns: `boolean`"
  (^Boolean [^GraphWalkIterator this]
    (-> this (.hasNext))))

(defn reset
  "Reset the graph walk iterator."
  ([^GraphWalkIterator this]
    (-> this (.reset))))

