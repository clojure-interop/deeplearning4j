(ns org.datavec.api.records.writer.impl.misc.MatlabRecordWriter
  "Write matlab records"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer.impl.misc MatlabRecordWriter]))

(defn ->matlab-record-writer
  "Constructor."
  (^MatlabRecordWriter []
    (new MatlabRecordWriter )))

(defn write
  "Description copied from interface: RecordWriter

  record - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^MatlabRecordWriter this ^java.util.List record]
    (-> this (.write record))))

