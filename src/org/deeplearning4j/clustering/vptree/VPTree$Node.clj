(ns org.deeplearning4j.clustering.vptree.VPTree$Node
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.vptree VPTree$Node]))

(defn ->node
  "Constructor.

  index - `int`
  threshold - `float`"
  (^VPTree$Node [^Integer index ^Float threshold]
    (new VPTree$Node index threshold)))

(defn fetch-futures
  ""
  ([^VPTree$Node this]
    (-> this (.fetchFutures))))

