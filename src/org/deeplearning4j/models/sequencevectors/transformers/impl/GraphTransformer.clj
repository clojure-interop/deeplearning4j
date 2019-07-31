(ns org.deeplearning4j.models.sequencevectors.transformers.impl.GraphTransformer
  "This class is used to build vocabulary and sequences out of graph, via GraphWalkers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.transformers.impl GraphTransformer]))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.models.sequencevectors.sequence.Sequence<T>>`"
  (^java.util.Iterator [^GraphTransformer this]
    (-> this (.iterator))))

