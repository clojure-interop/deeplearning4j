(ns org.datavec.spark.transform.rank.UnzipForCalculateSortedRankFunction
  "A simple helper function for use in executing CalculateSortedRank"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.rank UnzipForCalculateSortedRankFunction]))

(defn ->unzip-for-calculate-sorted-rank-function
  "Constructor."
  (^UnzipForCalculateSortedRankFunction []
    (new UnzipForCalculateSortedRankFunction )))

(defn call
  "v-1 - `scala.Tuple2`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^UnzipForCalculateSortedRankFunction this ^scala.Tuple2 v-1]
    (-> this (.call v-1))))

