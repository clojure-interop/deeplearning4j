(ns org.datavec.api.records.reader.impl.jackson.JacksonLineSequenceRecordReader
  "The sequence record reader version of JacksonLineRecordReader.
 Assumptions here:
 1. Each file is a separate record
 2. Each line of a file is one step within a sequence
 See JacksonLineRecordReader for more details"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.jackson JacksonLineSequenceRecordReader]))

(defn ->jackson-line-sequence-record-reader
  "Constructor.

  selection - Fields to return - `org.datavec.api.records.reader.impl.jackson.FieldSelection`
  mapper - Object mapper to use. For example, new ObjectMapper(new JsonFactory()) for JSON - `org.nd4j.shade.jackson.databind.ObjectMapper`"
  (^JacksonLineSequenceRecordReader [^org.datavec.api.records.reader.impl.jackson.FieldSelection selection ^org.nd4j.shade.jackson.databind.ObjectMapper mapper]
    (new JacksonLineSequenceRecordReader selection mapper)))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^JacksonLineSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^JacksonLineSequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^JacksonLineSequenceRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^JacksonLineSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

