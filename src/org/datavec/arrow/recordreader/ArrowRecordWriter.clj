(ns org.datavec.arrow.recordreader.ArrowRecordWriter
  "Output arrow records to an output stream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.arrow.recordreader ArrowRecordWriter]))

(defn ->arrow-record-writer
  "Constructor.

  schema - `org.datavec.api.transform.schema.Schema`"
  (^ArrowRecordWriter [^org.datavec.api.transform.schema.Schema schema]
    (new ArrowRecordWriter schema)))

(defn supports-batch
  "Description copied from interface: RecordWriter

  returns: `boolean`"
  (^Boolean [^ArrowRecordWriter this]
    (-> this (.supportsBatch))))

(defn initialize
  "Description copied from interface: RecordWriter

  configuration - the configuration to iniailize with - `org.datavec.api.conf.Configuration`
  split - the split to use - `org.datavec.api.split.InputSplit`
  partitioner - `org.datavec.api.split.partition.Partitioner`

  throws: java.lang.Exception"
  ([^ArrowRecordWriter this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize configuration split partitioner)))
  ([^ArrowRecordWriter this ^org.datavec.api.split.InputSplit input-split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize input-split partitioner))))

(defn write
  "Description copied from interface: RecordWriter

  record - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^ArrowRecordWriter this ^java.util.List record]
    (-> this (.write record))))

(defn write-batch
  "Description copied from interface: RecordWriter

  batch - the batch to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^ArrowRecordWriter this ^java.util.List batch]
    (-> this (.writeBatch batch))))

(defn close
  "Description copied from interface: RecordWriter"
  ([^ArrowRecordWriter this]
    (-> this (.close))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^ArrowRecordWriter this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^ArrowRecordWriter this]
    (-> this (.getConf))))

