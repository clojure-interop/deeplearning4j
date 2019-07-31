(ns org.deeplearning4j.models.sequencevectors.graph.walkers.impl.RandomWalker
  "This is Random-based walker for SequenceVectors-based DeepWalk implementation
 Original DeepWalk paper: http://arxiv.org/pdf/1403.6652v2"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers.impl RandomWalker]))

(defn has-next?
  "This method checks, if walker has any more sequences left in queue

  returns: `boolean`"
  (^Boolean [^RandomWalker this]
    (-> this (.hasNext))))

(defn label-enabled?
  "returns: `boolean`"
  (^Boolean [^RandomWalker this]
    (-> this (.isLabelEnabled))))

(defn next
  "This method returns next walk sequence from this graph

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^RandomWalker this]
    (-> this (.next))))

(defn reset
  "This method resets walker

  shuffle - if TRUE, order of walks will be shuffled - `boolean`"
  ([^RandomWalker this ^Boolean shuffle]
    (-> this (.reset shuffle))))

