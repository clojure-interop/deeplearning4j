(ns org.deeplearning4j.nn.graph.vertex.impl.FrozenVertex
  "FrozenVertex is used for the purposes of transfer learning
 A frozen layers wraps another DL4J GraphVertex within it.
 During backprop, the FrozenVertex is skipped, and any parameters are not be updated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.graph.vertex.impl FrozenVertex]))

(defn ->frozen-vertex
  "Constructor.

  underlying - `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^FrozenVertex [^org.deeplearning4j.nn.graph.vertex.GraphVertex underlying]
    (new FrozenVertex underlying)))

(defn get-config
  "returns: Training configuration - `org.deeplearning4j.nn.api.TrainingConfig`"
  (^org.deeplearning4j.nn.api.TrainingConfig [^FrozenVertex this]
    (-> this (.getConfig))))

