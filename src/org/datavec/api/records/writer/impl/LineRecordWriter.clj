(ns org.datavec.api.records.writer.impl.LineRecordWriter
  "Line record writer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer.impl LineRecordWriter]))

(defn ->line-record-writer
  "Constructor."
  (^LineRecordWriter []
    (new LineRecordWriter )))

(defn write
  "Description copied from interface: RecordWriter

  record - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^LineRecordWriter this ^java.util.List record]
    (-> this (.write record))))

