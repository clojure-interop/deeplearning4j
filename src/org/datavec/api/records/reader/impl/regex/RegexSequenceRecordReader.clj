(ns org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader
  "RegexSequenceRecordReader: Read an entire file (as a sequence), one line at a time and
 split each line into fields using a regex.
 Specifically, we are using Pattern and Matcher to do the splitting into groups
 Example: Data in format \"2016-01-01 23:59:59.001 1 DEBUG First entry message!\"
 using regex String \"(\\\\d{4}-\\\\d{2}-\\\\d{2} \\\\d{2}:\\\\d{2}:\\\\d{2}\\\\.\\\\d{3}) (\\\\d+) ([A-Z]+) (.*)\"
 would be split into 4 Text writables: [\"2016-01-01 23:59:59.001\", \"1\", \"DEBUG\", \"First entry message!\"]
 Note: RegexSequenceRecordReader supports multiple error handling modes, via RegexSequenceRecordReader.LineErrorHandling. Invalid
 lines that don't match the provided regex can result in an exception (FailOnInvalid), can be skipped silently (SkipInvalid),
 or skip invalid but log a warning (SkipInvalidWithWarning)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.regex RegexSequenceRecordReader]))

(defn ->regex-sequence-record-reader
  "Constructor.

  regex - `java.lang.String`
  skip-num-lines - `int`
  encoding - `java.nio.charset.Charset`
  error-handling - `org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling`"
  (^RegexSequenceRecordReader [^java.lang.String regex ^Integer skip-num-lines ^java.nio.charset.Charset encoding ^org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling error-handling]
    (new RegexSequenceRecordReader regex skip-num-lines encoding error-handling))
  (^RegexSequenceRecordReader [^java.lang.String regex ^Integer skip-num-lines]
    (new RegexSequenceRecordReader regex skip-num-lines)))

(def *-skip-num-lines
  "Static Constant.

  type: java.lang.String"
  RegexSequenceRecordReader/SKIP_NUM_LINES)

(def *-default-charset
  "Static Constant.

  type: java.nio.charset.Charset"
  RegexSequenceRecordReader/DEFAULT_CHARSET)

(def *-default-error-handling
  "Static Constant.

  type: org.datavec.api.records.reader.impl.regex.RegexSequenceRecordReader$LineErrorHandling"
  RegexSequenceRecordReader/DEFAULT_ERROR_HANDLING)

(def *-log
  "Static Constant.

  type: org.slf4j.Logger"
  RegexSequenceRecordReader/LOG)

(defn initialize
  "Description copied from interface: RecordReader

  conf - a configuration for initialization - `org.datavec.api.conf.Configuration`
  split - the split that defines the range of records to read - `org.datavec.api.split.InputSplit`

  throws: java.io.IOException"
  ([^RegexSequenceRecordReader this ^org.datavec.api.conf.Configuration conf ^org.datavec.api.split.InputSplit split]
    (-> this (.initialize conf split))))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^RegexSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^RegexSequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn reset
  "Description copied from interface: RecordReader"
  ([^RegexSequenceRecordReader this]
    (-> this (.reset))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^RegexSequenceRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^RegexSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

