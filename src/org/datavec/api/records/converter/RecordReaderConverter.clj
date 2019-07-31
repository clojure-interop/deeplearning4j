(ns org.datavec.api.records.converter.RecordReaderConverter
  "A utility class to aid in the conversion of data from one RecordReader to one RecordWriter,
 or from one SequenceRecordReader to one SequenceRecordWriter"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.converter RecordReaderConverter]))

(defn *convert
  "Write all values from the specified record reader to the specified record writer.
  Optionally, close the record writer on completion

  reader - Record reader (source of data) - `org.datavec.api.records.reader.RecordReader`
  writer - Record writer (location to write data) - `org.datavec.api.records.writer.RecordWriter`
  close-on-completion - if true: close the record writer once complete, via RecordWriter.close() - `boolean`

  throws: java.io.IOException - If underlying reader/writer throws an exception"
  ([^org.datavec.api.records.reader.RecordReader reader ^org.datavec.api.records.writer.RecordWriter writer ^Boolean close-on-completion]
    (RecordReaderConverter/convert reader writer close-on-completion))
  ([^org.datavec.api.records.reader.RecordReader reader ^org.datavec.api.records.writer.RecordWriter writer]
    (RecordReaderConverter/convert reader writer)))

