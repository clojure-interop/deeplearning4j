(ns org.datavec.spark.transform.misc.comparator.Tuple2Comparator
  "Simple comparator: Compare Tuple2<T,Long> by Long value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc.comparator Tuple2Comparator]))

(defn ->tuple-2-comparator
  "Constructor."
  (^Tuple2Comparator []
    (new Tuple2Comparator )))

(defn compare
  "o-1 - `scala.Tuple2`
  o-2 - `scala.Tuple2`

  returns: `int`"
  (^Integer [^Tuple2Comparator this ^scala.Tuple2 o-1 ^scala.Tuple2 o-2]
    (-> this (.compare o-1 o-2))))

