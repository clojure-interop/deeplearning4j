(ns org.deeplearning4j.spark.models.sequencevectors.functions.PartitionTrainingFunction
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.models.sequencevectors.functions PartitionTrainingFunction]))

(defn ->partition-training-function
  "Constructor.

  vocab-cache-broadcast - `org.apache.spark.broadcast.Broadcast`
  vectors-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`
  param-server-configuration-broadcast - `org.apache.spark.broadcast.Broadcast`"
  (^PartitionTrainingFunction [^org.apache.spark.broadcast.Broadcast vocab-cache-broadcast ^org.apache.spark.broadcast.Broadcast vectors-configuration-broadcast ^org.apache.spark.broadcast.Broadcast param-server-configuration-broadcast]
    (new PartitionTrainingFunction vocab-cache-broadcast vectors-configuration-broadcast param-server-configuration-broadcast)))

(defn call
  "sequence-iterator - `java.util.Iterator`

  throws: java.lang.Exception"
  ([^PartitionTrainingFunction this ^java.util.Iterator sequence-iterator]
    (-> this (.call sequence-iterator))))

