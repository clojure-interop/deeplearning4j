(ns org.nd4j.linalg.indexing.IndexInfo
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing IndexInfo]))

(defn ->index-info
  "Constructor.

  indexes - `org.nd4j.linalg.indexing.INDArrayIndex`"
  (^IndexInfo [^org.nd4j.linalg.indexing.INDArrayIndex indexes]
    (new IndexInfo indexes)))

(defn get-num-new-axes
  "returns: `int`"
  (^Integer [^IndexInfo this]
    (-> this (.getNumNewAxes))))

(defn get-num-points
  "returns: `int`"
  (^Integer [^IndexInfo this]
    (-> this (.getNumPoints))))

