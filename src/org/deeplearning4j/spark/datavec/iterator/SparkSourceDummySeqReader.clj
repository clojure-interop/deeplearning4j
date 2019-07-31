(ns org.deeplearning4j.spark.datavec.iterator.SparkSourceDummySeqReader
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec.iterator SparkSourceDummySeqReader]))

(defn ->spark-source-dummy-seq-reader
  "Constructor.

  reader-idx - Index of the reader, in terms of the sequence RDD that it should use. For a single sequence RDDas input, this is always 0; for 2 sequence RDDs used as input, this would be 0 or 1, dependingon whether it should pull values from the first or second sequence RDD. Note that the indexingfor sequence RDDs doesn't depend on the presence of non-sequence RDDs - they are indexed separately. - `int`"
  (^SparkSourceDummySeqReader [^Integer reader-idx]
    (new SparkSourceDummySeqReader reader-idx)))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^SparkSourceDummySeqReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^SparkSourceDummySeqReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^SparkSourceDummySeqReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^SparkSourceDummySeqReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

