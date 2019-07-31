(ns org.nd4j.linalg.api.ndarray.SparseInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray SparseInfoProvider]))

(defn create-sparse-information
  "flags - `int[]`
  sparse-offsets - `long[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^SparseInfoProvider this flags sparse-offsets hidden-dimensions ^Integer underlying-rank]
    (-> this (.createSparseInformation flags sparse-offsets hidden-dimensions underlying-rank))))

(defn purge-cache
  ""
  ([^SparseInfoProvider this]
    (-> this (.purgeCache))))

