(ns org.datavec.api.records.reader.impl.csv.CSVRecordReader
  "Simple csv record reader."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVRecordReader]))

(defn ->csv-record-reader
  "Constructor.

  Skip lines, use delimiter, and strip quotes

  skip-num-lines - the number of lines to skip - `int`
  delimiter - the delimiter - `char`
  quote - the quote to strip - `char`"
  (^CSVRecordReader [^Integer skip-num-lines ^Character delimiter ^Character quote]
    (new CSVRecordReader skip-num-lines delimiter quote))
  (^CSVRecordReader [^Integer skip-num-lines ^Character delimiter]
    (new CSVRecordReader skip-num-lines delimiter))
  (^CSVRecordReader [^Integer skip-num-lines]
    (new CSVRecordReader skip-num-lines))
  (^CSVRecordReader []
    (new CSVRecordReader )))

(def *-default-delimiter
  "Static Constant.

  type: char"
  CSVRecordReader/DEFAULT_DELIMITER)

(def *-default-quote
  "Static Constant.

  type: char"
  CSVRecordReader/DEFAULT_QUOTE)

(def *-skip-num-lines
  "Static Constant.

  type: java.lang.String"
  CSVRecordReader/SKIP_NUM_LINES)

(def *-delimiter
  "Static Constant.

  type: java.lang.String"
  CSVRecordReader/DELIMITER)

(def *-quote
  "Static Constant.

  type: java.lang.String"
  CSVRecordReader/QUOTE)

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^CSVRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn batches-supported
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^CSVRecordReader this]
    (-> this (.batchesSupported))))

(defn has-next?
  "Description copied from interface: RecordReader

  returns: `boolean`"
  (^Boolean [^CSVRecordReader this]
    (-> this (.hasNext))))

(defn next
  "Description copied from interface: RecordReader

  num - `int`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^CSVRecordReader this ^Integer num]
    (-> this (.next num)))
  (^java.util.List [^CSVRecordReader this]
    (-> this (.next))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^CSVRecordReader this]
    (-> this (.nextRecord))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^CSVRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^CSVRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^CSVRecordReader this]
    (-> this (.reset))))

