(ns org.datavec.api.records.reader.impl.csv.CSVNLinesSequenceRecordReader
  "A CSV Sequence record reader where:
 (a) all time series are in a single file
 (b) each time series is of the same length (specified in constructor)
 (c) no delimiter is used between time series
 For example, with nLinesPerSequence=10, lines 0 to 9 are the first time series, 10 to 19 are the second, and so on."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVNLinesSequenceRecordReader]))

(defn ->csvn-lines-sequence-record-reader
  "Constructor.

  No-arg constructor with the default number of lines per sequence (10)"
  (^CSVNLinesSequenceRecordReader []
    (new CSVNLinesSequenceRecordReader ))
  (^CSVNLinesSequenceRecordReader [^Integer n-lines-per-sequence ^Integer skip-num-lines ^java.lang.String delimiter]
    (new CSVNLinesSequenceRecordReader n-lines-per-sequence skip-num-lines delimiter))
  (^CSVNLinesSequenceRecordReader [^Integer n-lines-per-sequence]
    (new CSVNLinesSequenceRecordReader n-lines-per-sequence)))

(def *-lines-per-sequence
  "Static Constant.

  type: java.lang.String"
  CSVNLinesSequenceRecordReader/LINES_PER_SEQUENCE)

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^CSVNLinesSequenceRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^CSVNLinesSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^CSVNLinesSequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^CSVNLinesSequenceRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^CSVNLinesSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^CSVNLinesSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

