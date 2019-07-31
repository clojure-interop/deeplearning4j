(ns org.deeplearning4j.models.sequencevectors.graph.walkers.impl.WeightedWalker
  "This is vertex weight-based walker for SequenceVectors-based DeepWalk implementation.
 Instead of random walks, this walker produces walks based on weight of the edges."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers.impl WeightedWalker]))

(defn has-next?
  "This method checks, if walker has any more sequences left in queue

  returns: `boolean`"
  (^Boolean [^WeightedWalker this]
    (-> this (.hasNext))))

(defn label-enabled?
  "returns: `boolean`"
  (^Boolean [^WeightedWalker this]
    (-> this (.isLabelEnabled))))

(defn next
  "This method returns next walk sequence from this graph

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^WeightedWalker this]
    (-> this (.next))))

(defn reset
  "This method resets walker

  shuffle - if TRUE, order of walks will be shuffled - `boolean`"
  ([^WeightedWalker this ^Boolean shuffle]
    (-> this (.reset shuffle))))

