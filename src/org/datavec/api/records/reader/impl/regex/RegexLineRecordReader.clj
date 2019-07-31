(ns org.datavec.api.records.reader.impl.regex.RegexLineRecordReader
  "RegexLineRecordReader: Read a file, one line at a time, and split it into fields using a regex.
 Specifically, we are using Pattern and Matcher.
 To load an entire file using a
 Example: Data in format \"2016-01-01 23:59:59.001 1 DEBUG First entry message!\"
 using regex String \"(\\\\d{4}-\\\\d{2}-\\\\d{2} \\\\d{2}:\\\\d{2}:\\\\d{2}\\\\.\\\\d{3}) (\\\\d+) ([A-Z]+) (.*)\"
 would be split into 4 Text writables: [\"2016-01-01 23:59:59.001\", \"1\", \"DEBUG\", \"First entry message!\"]"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.regex RegexLineRecordReader]))

(defn ->regex-line-record-reader
  "Constructor.

  regex - `java.lang.String`
  skip-num-lines - `int`"
  (^RegexLineRecordReader [^java.lang.String regex ^Integer skip-num-lines]
    (new RegexLineRecordReader regex skip-num-lines)))

(def *-skip-num-lines
  "Static Constant.

  type: java.lang.String"
  RegexLineRecordReader/SKIP_NUM_LINES)

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^RegexLineRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn next
  "Description copied from interface: RecordReader

  returns: `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^RegexLineRecordReader this]
    (-> this (.next))))

(defn record
  "Description copied from interface: RecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^RegexLineRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.record uri data-input-stream))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^RegexLineRecordReader this]
    (-> this (.reset))))

(defn next-record
  "Description copied from interface: RecordReader

  returns: next record - `org.datavec.api.records.Record`"
  (^org.datavec.api.records.Record [^RegexLineRecordReader this]
    (-> this (.nextRecord))))

(defn load-from-meta-data
  "Description copied from interface: RecordReader

  record-meta-data - Metadata for the record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single record for the given RecordMetaData instance - `org.datavec.api.records.Record`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.Record [^RegexLineRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadFromMetaData record-meta-data))))

