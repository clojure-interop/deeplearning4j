(ns org.datavec.api.records.writer.SequenceRecordWriter
  "Sequence record writer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.writer SequenceRecordWriter]))

(defn write
  "Write a record

  sequence - the record to write - `java.util.List`

  returns: `org.datavec.api.split.partition.PartitionMetaData`

  throws: java.io.IOException"
  (^org.datavec.api.split.partition.PartitionMetaData [^SequenceRecordWriter this ^java.util.List sequence]
    (-> this (.write sequence))))

(defn close
  "Close the sequence record writer"
  ([^SequenceRecordWriter this]
    (-> this (.close))))

