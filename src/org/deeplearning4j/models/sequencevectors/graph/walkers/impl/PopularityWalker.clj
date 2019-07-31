(ns org.deeplearning4j.models.sequencevectors.graph.walkers.impl.PopularityWalker
  "This is vertex popularity-based walker for SequenceVectors-based DeepWalk implementation.
 Instead of rand walks, this walker produces walks based on number of edges coming into each node.
 This allows you to build walks filtering too rare nodes, or too popular nodes, depending on your demands.
 Original DeepWalk paper: http://arxiv.org/pdf/1403.6652v2"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers.impl PopularityWalker]))

(defn ->popularity-walker
  "Constructor."
  (^PopularityWalker []
    (new PopularityWalker )))

(defn has-next?
  "This method checks, if walker has any more sequences left in queue

  returns: `boolean`"
  (^Boolean [^PopularityWalker this]
    (-> this (.hasNext))))

(defn label-enabled?
  "returns: `boolean`"
  (^Boolean [^PopularityWalker this]
    (-> this (.isLabelEnabled))))

(defn next
  "This method returns next walk sequence from this graph

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^PopularityWalker this]
    (-> this (.next))))

(defn reset
  "Description copied from class: RandomWalker

  shuffle - if TRUE, order of walks will be shuffled - `boolean`"
  ([^PopularityWalker this ^Boolean shuffle]
    (-> this (.reset shuffle))))

