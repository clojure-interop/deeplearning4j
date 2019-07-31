(ns org.deeplearning4j.spark.impl.common.SplitPartitionsFunction2
  "Equivelent to SplitPartitionsFunction, but for JavaPairRDDs"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common SplitPartitionsFunction2]))

(defn ->split-partitions-function-2
  "Constructor."
  (^SplitPartitionsFunction2 []
    (new SplitPartitionsFunction2 )))

(defn call
  "v-1 - `java.lang.Integer`
  iter - `java.util.Iterator`

  returns: `java.util.Iterator<scala.Tuple2<T,U>>`

  throws: java.lang.Exception"
  (^java.util.Iterator [^SplitPartitionsFunction2 this ^java.lang.Integer v-1 ^java.util.Iterator iter]
    (-> this (.call v-1 iter))))

