(ns org.datavec.api.records.writer.RecordWriter
  "Record writer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer RecordWriter]))

(defn supports-batch
  "Returns true if this record writer
  supports efficient batch writing using writeBatch(List)

  returns: `boolean`"
  (^Boolean [^RecordWriter this]
    (-> this (.supportsBatch))))

(defn initialize
  "Initialize the record reader with the given configuration
  and InputSplit

  configuration - the configuration to iniailize with - `org.datavec.api.conf.Configuration`
  split - the split to use - `org.datavec.api.split.InputSplit`
  partitioner - `org.datavec.api.split.partition.Partitioner`

  throws: java.lang.Exception"
  ([^RecordWriter this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize configuration split partitioner)))
  ([^RecordWriter this ^org.datavec.api.split.InputSplit input-split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize input-split partitioner))))

(defn write
  "Write a record

  record - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^RecordWriter this ^java.util.List record]
    (-> this (.write record))))

(defn write-batch
  "Write a batch of records

  batch - the batch to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^RecordWriter this ^java.util.List batch]
    (-> this (.writeBatch batch))))

(defn close
  "Close the recod reader"
  ([^RecordWriter this]
    (-> this (.close))))

