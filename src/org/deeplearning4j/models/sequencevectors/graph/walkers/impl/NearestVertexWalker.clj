(ns org.deeplearning4j.models.sequencevectors.graph.walkers.impl.NearestVertexWalker
  "This walker represents connections of a given node  their neighborhoods up to certain depth.
 Basically it's the same idea as context for a given node.
 So this walker produces Sequences, with label defined. And label - is element itself."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.graph.walkers.impl NearestVertexWalker]))

(defn has-next?
  "Description copied from interface: GraphWalker

  returns: `boolean`"
  (^Boolean [^NearestVertexWalker this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: GraphWalker

  returns: `org.deeplearning4j.models.sequencevectors.sequence.Sequence<V>`"
  (^org.deeplearning4j.models.sequencevectors.sequence.Sequence [^NearestVertexWalker this]
    (-> this (.next))))

(defn reset
  "Description copied from interface: GraphWalker

  shuffle - if TRUE, order of walks will be shuffled - `boolean`"
  ([^NearestVertexWalker this ^Boolean shuffle]
    (-> this (.reset shuffle))))

(defn label-enabled?
  "returns: `boolean`"
  (^Boolean [^NearestVertexWalker this]
    (-> this (.isLabelEnabled))))

