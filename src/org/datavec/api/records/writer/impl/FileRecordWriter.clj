(ns org.datavec.api.records.writer.impl.FileRecordWriter
  "Write to files.
 To set the path and configuration via configuration:
 writeTo: org.datavec.api.records.writer.path
 This is the path used to write to"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer.impl FileRecordWriter]))

(defn ->file-record-writer
  "Constructor."
  (^FileRecordWriter []
    (new FileRecordWriter )))

(def *-default-charset
  "Static Constant.

  type: java.nio.charset.Charset"
  FileRecordWriter/DEFAULT_CHARSET)

(def *-new-line
  "Static Constant.

  type: java.lang.String"
  FileRecordWriter/NEW_LINE)

(defn supports-batch
  "Description copied from interface: RecordWriter

  returns: `boolean`"
  (^Boolean [^FileRecordWriter this]
    (-> this (.supportsBatch))))

(defn initialize
  "Description copied from interface: RecordWriter

  configuration - the configuration to iniailize with - `org.datavec.api.conf.Configuration`
  split - the split to use - `org.datavec.api.split.InputSplit`
  partitioner - `org.datavec.api.split.partition.Partitioner`

  throws: java.lang.Exception"
  ([^FileRecordWriter this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize configuration split partitioner)))
  ([^FileRecordWriter this ^org.datavec.api.split.InputSplit input-split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize input-split partitioner))))

(defn write
  "Description copied from interface: RecordWriter

  record - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^FileRecordWriter this ^java.util.List record]
    (-> this (.write record))))

(defn write-batch
  "Description copied from interface: RecordWriter

  batch - the batch to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^FileRecordWriter this ^java.util.List batch]
    (-> this (.writeBatch batch))))

(defn close
  "Description copied from interface: RecordWriter"
  ([^FileRecordWriter this]
    (-> this (.close))))

(defn set-conf
  "Description copied from interface: Configurable

  conf - `org.datavec.api.conf.Configuration`"
  ([^FileRecordWriter this ^org.datavec.api.conf.Configuration conf]
    (-> this (.setConf conf))))

(defn get-conf
  "Description copied from interface: Configurable

  returns: `org.datavec.api.conf.Configuration`"
  (^org.datavec.api.conf.Configuration [^FileRecordWriter this]
    (-> this (.getConf))))

