(ns org.datavec.api.records.reader.impl.csv.CSVSequenceRecordReader
  "CSV Sequence Record Reader
 This reader is intended to read sequences of data in CSV format, where
 each sequence is defined in its own file (and there are multiple files)
 Each line in the file represents one time step"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVSequenceRecordReader]))

(defn ->csv-sequence-record-reader
  "Constructor.

  skip-num-lines - `int`
  delimiter - `java.lang.String`"
  (^CSVSequenceRecordReader [^Integer skip-num-lines ^java.lang.String delimiter]
    (new CSVSequenceRecordReader skip-num-lines delimiter))
  (^CSVSequenceRecordReader [^Integer skip-num-lines]
    (new CSVSequenceRecordReader skip-num-lines))
  (^CSVSequenceRecordReader []
    (new CSVSequenceRecordReader )))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^CSVSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^CSVSequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^CSVSequenceRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^CSVSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

