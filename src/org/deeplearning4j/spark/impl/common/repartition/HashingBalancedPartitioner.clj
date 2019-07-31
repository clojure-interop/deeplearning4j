(ns org.deeplearning4j.spark.impl.common.repartition.HashingBalancedPartitioner
  "This is a custom partitioner that rebalances a minimum of elements
 it expects a key in the form (SparkUID, class)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common.repartition HashingBalancedPartitioner]))

(defn ->hashing-balanced-partitioner
  "Constructor.

  partition-weights-by-class - `java.util.List`"
  (^HashingBalancedPartitioner [^java.util.List partition-weights-by-class]
    (new HashingBalancedPartitioner partition-weights-by-class)))

(defn num-partitions
  "returns: `int`"
  (^Integer [^HashingBalancedPartitioner this]
    (-> this (.numPartitions))))

(defn get-partition
  "key - `java.lang.Object`

  returns: `int`"
  (^Integer [^HashingBalancedPartitioner this ^java.lang.Object key]
    (-> this (.getPartition key))))

