(ns org.datavec.local.transforms.functions.SequenceRecordReaderFunction
  "RecordReaderFunction: Given a SequenceRecordReader and a file(via InputStream), load and parse the
 sequence data into a List<List<Writable>>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.functions SequenceRecordReaderFunction]))

(defn ->sequence-record-reader-function
  "Constructor.

  sequence-record-reader - `org.datavec.api.records.reader.SequenceRecordReader`"
  (^SequenceRecordReaderFunction [^org.datavec.api.records.reader.SequenceRecordReader sequence-record-reader]
    (new SequenceRecordReaderFunction sequence-record-reader)))

(defn apply
  "Description copied from interface: Function

  value - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceRecordReaderFunction this ^org.nd4j.linalg.primitives.Pair value]
    (-> this (.apply value))))

