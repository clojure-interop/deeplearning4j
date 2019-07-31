(ns org.deeplearning4j.spark.impl.repartitioner.EqualRepartitioner
  "Equal repartitioner. Splits the data into numExecutors equal sized partitions.
 Note that if the number of objects isn't an exact multiple of the number of executors, the \"remainder\"
 are randomly allocated to one partition without replacement (i.e., the largest partitions will have exactly 1
 more object than the smallest partitions)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.repartitioner EqualRepartitioner]))

(defn ->equal-repartitioner
  "Constructor."
  (^EqualRepartitioner []
    (new EqualRepartitioner )))

(defn *repartition
  "rdd - `org.apache.spark.api.java.JavaRDD`
  num-partitions - `int`
  partition-counts - `java.util.List`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^org.apache.spark.api.java.JavaRDD rdd ^Integer num-partitions ^java.util.List partition-counts]
    (EqualRepartitioner/repartition rdd num-partitions partition-counts)))

(defn repartition
  "rdd - `org.apache.spark.api.java.JavaRDD`
  min-objects-per-partition - `int`
  num-executors - `int`

  returns: `<T> org.apache.spark.api.java.JavaRDD<T>`"
  ([^EqualRepartitioner this ^org.apache.spark.api.java.JavaRDD rdd ^Integer min-objects-per-partition ^Integer num-executors]
    (-> this (.repartition rdd min-objects-per-partition num-executors))))

