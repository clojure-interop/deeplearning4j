(ns org.datavec.api.records.writer.impl.csv.CSVRecordWriter
  "Csv record writer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer.impl.csv CSVRecordWriter]))

(defn ->csv-record-writer
  "Constructor."
  (^CSVRecordWriter []
    (new CSVRecordWriter )))

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  CSVRecordWriter/DEFAULT_DELIMITER)

(defn supports-batch
  "Description copied from interface: RecordWriter

  returns: `boolean`"
  (^Boolean [^CSVRecordWriter this]
    (-> this (.supportsBatch))))

(defn write-batch
  "Description copied from interface: RecordWriter

  batch - the batch to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^CSVRecordWriter this ^java.util.List batch]
    (-> this (.writeBatch batch))))

(defn write
  "Description copied from interface: RecordWriter

  record - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^CSVRecordWriter this ^java.util.List record]
    (-> this (.write record))))

