(ns org.deeplearning4j.spark.impl.common.repartition.BalancedPartitioner
  "This is a custom partitioner to repartition a RDD.
 Unlike a standard .repartition() call (which assigns partitions like [2,3,4,1,2,3,4,1,2,...] for 4 partitions],
 this function attempts to keep contiguous elements (i.e., those elements originally in the same partition) together
 much more frequently. Furthermore, it is less prone to producing larger or smaller than expected partitions, as
 it is entirely deterministic, whereas .repartition() has a degree of randomness (i.e., start index) which can result in
 a large degree of variance when the number of elements in the original partitions is small (as is the case generally in DL4J)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.common.repartition BalancedPartitioner]))

(defn ->balanced-partitioner
  "Constructor.

  num-partitions - `int`
  elements-per-partition - `int`
  remainder - `int`"
  (^BalancedPartitioner [^Integer num-partitions ^Integer elements-per-partition ^Integer remainder]
    (new BalancedPartitioner num-partitions elements-per-partition remainder)))

(defn num-partitions
  "returns: `int`"
  (^Integer [^BalancedPartitioner this]
    (-> this (.numPartitions))))

(defn get-partition
  "key - `java.lang.Object`

  returns: `int`"
  (^Integer [^BalancedPartitioner this ^java.lang.Object key]
    (-> this (.getPartition key))))

