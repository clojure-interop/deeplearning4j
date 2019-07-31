(ns org.deeplearning4j.models.sequencevectors.graph.walkers.GraphWalker
  "This interface describes methods needed for various DeepWalk-related implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers GraphWalker]))

(defn get-source-graph
  "returns: `org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph<T,?>`"
  (^org.deeplearning4j.models.sequencevectors.graph.primitives.IGraph [^GraphWalker this]
    (-> this (.getSourceGraph))))

(defn has-next?
  "This method checks, if walker has any more sequences left in queue

  returns: `boolean`"
  (^Boolean [^GraphWalker this]
    (-> this (.hasNext))))

(defn next
  "This method returns next walk sequence from this graph

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^GraphWalker this]
    (-> this (.next))))

(defn reset
  "This method resets walker

  shuffle - if TRUE, order of walks will be shuffled - `boolean`"
  ([^GraphWalker this ^Boolean shuffle]
    (-> this (.reset shuffle))))

(defn label-enabled?
  "returns: `boolean`"
  (^Boolean [^GraphWalker this]
    (-> this (.isLabelEnabled))))

