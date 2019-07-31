(ns org.datavec.api.split.partition.NumberOfRecordsPartitioner
  "Partition relative to number of records written per file.
 This partitioner will ensure that no more than
 recordsPerFile number of records is written per
 file when outputting to the various locations of the
 InputSplit locations."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.split.partition NumberOfRecordsPartitioner]))

(defn ->number-of-records-partitioner
  "Constructor."
  (^NumberOfRecordsPartitioner []
    (new NumberOfRecordsPartitioner )))

(def *-default-records-per-file
  "Static Constant.

  type: int"
  NumberOfRecordsPartitioner/DEFAULT_RECORDS_PER_FILE)

(def *-records-per-file-config
  "Static Constant.

  type: java.lang.String"
  NumberOfRecordsPartitioner/RECORDS_PER_FILE_CONFIG)

(defn total-records-written
  "Description copied from interface: Partitioner

  returns: `int`"
  (^Integer [^NumberOfRecordsPartitioner this]
    (-> this (.totalRecordsWritten))))

(defn num-records-written
  "Description copied from interface: Partitioner

  returns: `int`"
  (^Integer [^NumberOfRecordsPartitioner this]
    (-> this (.numRecordsWritten))))

(defn num-partitions
  "Description copied from interface: Partitioner

  returns: `int`"
  (^Integer [^NumberOfRecordsPartitioner this]
    (-> this (.numPartitions))))

(defn init
  "Description copied from interface: Partitioner

  configuration - the configuration to configurethis partitioner with - `org.datavec.api.conf.Configuration`
  split - the input split to use with this partitioner - `org.datavec.api.split.InputSplit`"
  ([^NumberOfRecordsPartitioner this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit split]
    (-> this (.init configuration split)))
  ([^NumberOfRecordsPartitioner this ^org.datavec.api.split.InputSplit input-split]
    (-> this (.init input-split))))

(defn update-partition-info
  "Description copied from interface: Partitioner

  metadata - `org.datavec.api.split.partition.PartitionMetaData`"
  ([^NumberOfRecordsPartitioner this ^org.datavec.api.split.partition.PartitionMetaData metadata]
    (-> this (.updatePartitionInfo metadata))))

(defn needs-new-partition
  "Description copied from interface: Partitioner

  returns: `boolean`"
  (^Boolean [^NumberOfRecordsPartitioner this]
    (-> this (.needsNewPartition))))

(defn open-new-stream
  "Description copied from interface: Partitioner

  returns: the new opened output stream - `java.io.OutputStream`"
  (^java.io.OutputStream [^NumberOfRecordsPartitioner this]
    (-> this (.openNewStream))))

(defn current-output-stream
  "Description copied from interface: Partitioner

  returns: `java.io.OutputStream`"
  (^java.io.OutputStream [^NumberOfRecordsPartitioner this]
    (-> this (.currentOutputStream))))

