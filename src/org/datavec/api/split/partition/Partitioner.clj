(ns org.datavec.api.split.partition.Partitioner
  "A partitioner for iterating thorugh files for RecordWriter.
 This allows for a configurable log rotation like algorithm for partitioning files by number of recodrds,
 sizes among other things."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split.partition Partitioner]))

(defn total-records-written
  "Returns the total records written

  returns: `int`"
  (^Integer [^Partitioner this]
    (-> this (.totalRecordsWritten))))

(defn num-records-written
  "Number of records written so far

  returns: `int`"
  (^Integer [^Partitioner this]
    (-> this (.numRecordsWritten))))

(defn num-partitions
  "Returns the number of partitions

  returns: `int`"
  (^Integer [^Partitioner this]
    (-> this (.numPartitions))))

(defn init
  "Initializes this partitioner with the given configuration
  and input split

  configuration - the configuration to configurethis partitioner with - `org.datavec.api.conf.Configuration`
  split - the input split to use with this partitioner - `org.datavec.api.split.InputSplit`"
  ([^Partitioner this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit split]
    (-> this (.init configuration split)))
  ([^Partitioner this ^org.datavec.api.split.InputSplit input-split]
    (-> this (.init input-split))))

(defn update-partition-info
  "Updates the metadata for this partitioner
  (to indicate whether the next partition is needed or not)

  metadata - `org.datavec.api.split.partition.PartitionMetaData`"
  ([^Partitioner this ^org.datavec.api.split.partition.PartitionMetaData metadata]
    (-> this (.updatePartitionInfo metadata))))

(defn needs-new-partition
  "Returns true if the partition needs to be moved to the next.
  This is controlled with updatePartitionInfo(PartitionMetaData)
  which handles incrementing counters and the like
  to determine whether the current partition has been exhausted.

  returns: `boolean`"
  (^Boolean [^Partitioner this]
    (-> this (.needsNewPartition))))

(defn open-new-stream
  "\"Increment\" to the next stream

  returns: the new opened output stream - `java.io.OutputStream`"
  (^java.io.OutputStream [^Partitioner this]
    (-> this (.openNewStream))))

(defn current-output-stream
  "Get the current output stream

  returns: `java.io.OutputStream`"
  (^java.io.OutputStream [^Partitioner this]
    (-> this (.currentOutputStream))))

