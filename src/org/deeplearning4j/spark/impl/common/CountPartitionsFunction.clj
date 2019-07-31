(ns org.deeplearning4j.spark.impl.common.CountPartitionsFunction
  "This is a function use to count the number of elements in each partition.
 It is used as part of SparkUtils.repartitionBalanceIfRequired(JavaRDD, Repartition, int, int)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common CountPartitionsFunction]))

(defn ->count-partitions-function
  "Constructor."
  (^CountPartitionsFunction []
    (new CountPartitionsFunction )))

(defn call
  "v-1 - `java.lang.Integer`
  v-2 - `java.util.Iterator`

  returns: `java.util.Iterator<scala.Tuple2<java.lang.Integer,java.lang.Integer>>`

  throws: java.lang.Exception"
  (^java.util.Iterator [^CountPartitionsFunction this ^java.lang.Integer v-1 ^java.util.Iterator v-2]
    (-> this (.call v-1 v-2))))

