(ns org.deeplearning4j.spark.stats.PartitionCountEventStats
  "Event stats implementation with partition count"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.stats PartitionCountEventStats]))

(defn ->partition-count-event-stats
  "Constructor.

  machine-id - `java.lang.String`
  jvm-id - `java.lang.String`
  thread-id - `long`
  start-time - `long`
  duration-ms - `long`
  num-partitions - `int`"
  (^PartitionCountEventStats [^java.lang.String machine-id ^java.lang.String jvm-id ^Long thread-id ^Long start-time ^Long duration-ms ^Integer num-partitions]
    (new PartitionCountEventStats machine-id jvm-id thread-id start-time duration-ms num-partitions))
  (^PartitionCountEventStats [^Long start-time ^Long duration-ms ^Integer num-partitions]
    (new PartitionCountEventStats start-time duration-ms num-partitions)))

(defn as-string
  "Description copied from interface: EventStats

  delimiter - Delimiter to use for the data - `java.lang.String`

  returns: String representation of the EventStats object - `java.lang.String`"
  (^java.lang.String [^PartitionCountEventStats this ^java.lang.String delimiter]
    (-> this (.asString delimiter))))

(defn get-string-header
  "Description copied from interface: EventStats

  delimiter - Delimiter to use for the header - `java.lang.String`

  returns: Header line - `java.lang.String`"
  (^java.lang.String [^PartitionCountEventStats this ^java.lang.String delimiter]
    (-> this (.getStringHeader delimiter))))

