(ns org.deeplearning4j.clustering.vptree.VPTreeFillSearch
  "Brute force search
 for running search
 relative to a target
 but forced to fill the result list
 until the desired k is matched.
 The algorithm does this by searching
 nearby points by k in a greedy fashion"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.clustering.vptree VPTreeFillSearch]))

(defn ->vp-tree-fill-search
  "Constructor.

  vp-tree - `org.deeplearning4j.clustering.vptree.VPTree`
  k - `int`
  target - `org.nd4j.linalg.api.ndarray.INDArray`"
  (^VPTreeFillSearch [^org.deeplearning4j.clustering.vptree.VPTree vp-tree ^Integer k ^org.nd4j.linalg.api.ndarray.INDArray target]
    (new VPTreeFillSearch vp-tree k target)))

(defn search
  ""
  ([^VPTreeFillSearch this]
    (-> this (.search))))

