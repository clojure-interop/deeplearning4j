(ns org.datavec.api.records.reader.impl.csv.CSVVariableSlidingWindowRecordReader
  "A sliding window of variable size across an entire CSV.
 In practice the sliding window size starts at 1, then linearly increase to maxLinesPer sequence, then
 linearly decrease back to 1."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVVariableSlidingWindowRecordReader]))

(defn ->csv-variable-sliding-window-record-reader
  "Constructor.

  No-arg constructor with the default number of lines per sequence (10)"
  (^CSVVariableSlidingWindowRecordReader []
    (new CSVVariableSlidingWindowRecordReader ))
  (^CSVVariableSlidingWindowRecordReader [^Integer max-lines-per-sequence ^Integer skip-num-lines ^Integer stride ^java.lang.String delimiter]
    (new CSVVariableSlidingWindowRecordReader max-lines-per-sequence skip-num-lines stride delimiter))
  (^CSVVariableSlidingWindowRecordReader [^Integer max-lines-per-sequence ^Integer stride ^java.lang.String delimiter]
    (new CSVVariableSlidingWindowRecordReader max-lines-per-sequence stride delimiter))
  (^CSVVariableSlidingWindowRecordReader [^Integer max-lines-per-sequence ^Integer stride]
    (new CSVVariableSlidingWindowRecordReader max-lines-per-sequence stride))
  (^CSVVariableSlidingWindowRecordReader [^Integer max-lines-per-sequence]
    (new CSVVariableSlidingWindowRecordReader max-lines-per-sequence)))

(def *-lines-per-sequence
  "Static Constant.

  type: java.lang.String"
  CSVVariableSlidingWindowRecordReader/LINES_PER_SEQUENCE)

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^CSVVariableSlidingWindowRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^CSVVariableSlidingWindowRecordReader this]
    (-> this (.hasNext))))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^CSVVariableSlidingWindowRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^CSVVariableSlidingWindowRecordReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^CSVVariableSlidingWindowRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^CSVVariableSlidingWindowRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^CSVVariableSlidingWindowRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^CSVVariableSlidingWindowRecordReader this]
    (-> this (.reset))))

