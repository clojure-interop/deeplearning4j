(ns org.datavec.local.transforms.misc.comparator.Tuple2Comparator
  "Simple comparator: Compare Tuple2<T,Long> by Long value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.misc.comparator Tuple2Comparator]))

(defn ->tuple-2-comparator
  "Constructor."
  (^Tuple2Comparator []
    (new Tuple2Comparator )))

(defn compare
  "o-1 - `org.nd4j.linalg.primitives.Pair`
  o-2 - `org.nd4j.linalg.primitives.Pair`

  returns: `int`"
  (^Integer [^Tuple2Comparator this ^org.nd4j.linalg.primitives.Pair o-1 ^org.nd4j.linalg.primitives.Pair o-2]
    (-> this (.compare o-1 o-2))))

