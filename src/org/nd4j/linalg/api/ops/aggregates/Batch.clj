(ns org.nd4j.linalg.api.ops.aggregates.Batch
  "Wrapper for \"batch of aggregates\""
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.aggregates Batch]))

(defn ->batch
  "Constructor.

  This constructor takes List of Aggregates, and builds Batch instance, usable with Nd4j executioner.

  aggregates - `java.util.List`"
  (^Batch [^java.util.List aggregates]
    (new Batch aggregates)))

(defn *get-batches
  "Helper method to create batch from list of aggregates, for cases when list of aggregates is higher then batchLimit

  list - `java.util.List`
  partition-size - `int`

  returns: `<U extends org.nd4j.linalg.api.ops.aggregates.Aggregate> java.util.List<org.nd4j.linalg.api.ops.aggregates.Batch<U>>`"
  ([^java.util.List list ^Integer partition-size]
    (Batch/getBatches list partition-size))
  ([^java.util.List list]
    (Batch/getBatches list)))

(defn op-num
  "This method returns opNum for batched aggregate

  returns: `int`"
  (^Integer [^Batch this]
    (-> this (.opNum))))

(defn append
  "This method tries to append aggregate to the current batch, if it has free room

  aggregate - `T`

  returns: `boolean`"
  (^Boolean [^Batch this aggregate]
    (-> this (.append aggregate))))

(defn full?
  "This method checks, if number of batched aggregates equals to maximum possible value

  returns: `boolean`"
  (^Boolean [^Batch this]
    (-> this (.isFull))))

