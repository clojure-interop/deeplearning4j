(ns org.datavec.poi.excel.ExcelRecordWriter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.poi.excel ExcelRecordWriter]))

(defn ->excel-record-writer
  "Constructor."
  (^ExcelRecordWriter []
    (new ExcelRecordWriter )))

(def *-worksheet-name
  "Static Constant.

  type: java.lang.String"
  ExcelRecordWriter/WORKSHEET_NAME)

(def *-file-type
  "Static Constant.

  type: java.lang.String"
  ExcelRecordWriter/FILE_TYPE)

(def *-default-file-type
  "Static Constant.

  type: java.lang.String"
  ExcelRecordWriter/DEFAULT_FILE_TYPE)

(def *-default-worksheet-name
  "Static Constant.

  type: java.lang.String"
  ExcelRecordWriter/DEFAULT_WORKSHEET_NAME)

(defn supports-batch
  "Description copied from interface: RecordWriter

  returns: `boolean`"
  (^Boolean [^ExcelRecordWriter this]
    (-> this (.supportsBatch))))

(defn initialize
  "Description copied from interface: RecordWriter

  configuration - the configuration to iniailize with - `org.datavec.api.conf.Configuration`
  split - the split to use - `org.datavec.api.split.InputSplit`
  partitioner - `org.datavec.api.split.partition.Partitioner`

  throws: java.lang.Exception"
  ([^ExcelRecordWriter this ^org.datavec.api.conf.Configuration configuration ^org.datavec.api.split.InputSplit split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize configuration split partitioner)))
  ([^ExcelRecordWriter this ^org.datavec.api.split.InputSplit input-split ^org.datavec.api.split.partition.Partitioner partitioner]
    (-> this (.initialize input-split partitioner))))

(defn write
  "Description copied from interface: RecordWriter

  record - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^ExcelRecordWriter this ^java.util.List record]
    (-> this (.write record))))

(defn write-batch
  "Description copied from interface: RecordWriter

  batch - the batch to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^ExcelRecordWriter this ^java.util.List batch]
    (-> this (.writeBatch batch))))

(defn close
  "Description copied from interface: RecordWriter"
  ([^ExcelRecordWriter this]
    (-> this (.close))))

