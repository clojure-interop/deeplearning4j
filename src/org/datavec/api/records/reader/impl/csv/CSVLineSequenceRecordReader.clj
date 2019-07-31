(ns org.datavec.api.records.reader.impl.csv.CSVLineSequenceRecordReader
  "CSVLineSequenceRecordReader: Used for loading univariance (single valued) sequences from a CSV,
 where each line in a CSV represents an independent sequence, and each sequence has exactly 1 value
 per time step.
 For example, a CSV file with content:


  a,b,c
  1,2,3,4
 will produce two sequences, both with one value per time step; one of length 3 (values a, b, then c for the 3 time steps
 respectively) and one of length 4 (values 1, 2, 3, then 4 for each of the 4 time steps respectively)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.records.reader.impl.csv CSVLineSequenceRecordReader]))

(defn ->csv-line-sequence-record-reader
  "Constructor.

  Skip lines, use delimiter, and strip quotes

  skip-num-lines - the number of lines to skip - `int`
  delimiter - the delimiter - `char`
  quote - the quote to strip - `char`"
  (^CSVLineSequenceRecordReader [^Integer skip-num-lines ^Character delimiter ^Character quote]
    (new CSVLineSequenceRecordReader skip-num-lines delimiter quote))
  (^CSVLineSequenceRecordReader [^Integer skip-num-lines ^Character delimiter]
    (new CSVLineSequenceRecordReader skip-num-lines delimiter))
  (^CSVLineSequenceRecordReader []
    (new CSVLineSequenceRecordReader )))

(defn sequence-record
  "Description copied from interface: SequenceRecordReader

  uri - `java.net.URI`
  data-input-stream - `java.io.DataInputStream`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.io.IOException - if error occurs during reading from the input stream"
  (^java.util.List [^CSVLineSequenceRecordReader this ^java.net.URI uri ^java.io.DataInputStream data-input-stream]
    (-> this (.sequenceRecord uri data-input-stream)))
  (^java.util.List [^CSVLineSequenceRecordReader this]
    (-> this (.sequenceRecord))))

(defn next-sequence
  "Description copied from interface: SequenceRecordReader

  returns: next sequence record - `org.datavec.api.records.SequenceRecord`"
  (^org.datavec.api.records.SequenceRecord [^CSVLineSequenceRecordReader this]
    (-> this (.nextSequence))))

(defn load-sequence-from-meta-data
  "Description copied from interface: SequenceRecordReader

  record-meta-data - Metadata for the sequence record that we want to load from - `org.datavec.api.records.metadata.RecordMetaData`

  returns: Single sequence record for the given RecordMetaData instance - `org.datavec.api.records.SequenceRecord`

  throws: java.io.IOException - If I/O error occurs during loading"
  (^org.datavec.api.records.SequenceRecord [^CSVLineSequenceRecordReader this ^org.datavec.api.records.metadata.RecordMetaData record-meta-data]
    (-> this (.loadSequenceFromMetaData record-meta-data))))

