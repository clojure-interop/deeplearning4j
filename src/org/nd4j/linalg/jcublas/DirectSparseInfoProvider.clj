(ns org.nd4j.linalg.jcublas.DirectSparseInfoProvider
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.jcublas DirectSparseInfoProvider]))

(defn ->direct-sparse-info-provider
  "Constructor."
  (^DirectSparseInfoProvider []
    (new DirectSparseInfoProvider )))

(defn create-sparse-information
  "flags - `int[]`
  sparse-offsets - `long[]`
  hidden-dimensions - `int[]`
  underlying-rank - `int`

  returns: `org.nd4j.linalg.api.buffer.DataBuffer`"
  (^org.nd4j.linalg.api.buffer.DataBuffer [^DirectSparseInfoProvider this flags sparse-offsets hidden-dimensions ^Integer underlying-rank]
    (-> this (.createSparseInformation flags sparse-offsets hidden-dimensions underlying-rank))))

(defn purge-cache
  ""
  ([^DirectSparseInfoProvider this]
    (-> this (.purgeCache))))

