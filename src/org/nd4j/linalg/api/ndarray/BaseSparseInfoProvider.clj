(ns org.nd4j.linalg.api.ndarray.BaseSparseInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ndarray BaseSparseInfoProvider]))

(defn ->base-sparse-info-provider
  "Constructor."
  (^BaseSparseInfoProvider []
    (new BaseSparseInfoProvider )))

(defn create-sparse-information
  "flags - `int[]`
  sparse-offsets - `long[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^BaseSparseInfoProvider this flags sparse-offsets hidden-dimensions ^Integer underlying-rank]
    (-> this (.createSparseInformation flags sparse-offsets hidden-dimensions underlying-rank))))

