(ns org.datavec.api.records.reader.SequenceRecordReader
  "A sequence of records.
 sequenceRecord() is used locally. sequenceRecord(URI uri, DataInputStream dataInputStream) is used for spark etc."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader SequenceRecordReader]))

(defn sequence-record
  "Load a sequence record from the given DataInputStream
  Unlike RecordReader.next() the internal state of the RecordReader is not modified
  Implementations of this method should not close the DataInputStream

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^SequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^SequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Similar to sequenceRecord(), but returns a Record object, that may include metadata such as the source
  of the data

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^SequenceRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Load a single sequence record from the given RecordMetaData instance
  Note: that for data that isn't splittable (i.e., text data that needs to be scanned/split), it is more efficient to
  load multiple records at once using loadSequenceFromMetaData(List)

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^SequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

