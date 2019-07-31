(ns org.datavec.local.transforms.rank.UnzipForCalculateSortedRankFunction
  "A simple helper function for use in executing CalculateSortedRank"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.rank UnzipForCalculateSortedRankFunction]))

(defn ->unzip-for-calculate-sorted-rank-function
  "Constructor."
  (^UnzipForCalculateSortedRankFunction []
    (new UnzipForCalculateSortedRankFunction )))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^UnzipForCalculateSortedRankFunction this ^org.nd4j.linalg.primitives.Pair v-1]
    (-> this (.apply v-1))))

