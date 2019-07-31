(ns org.datavec.spark.functions.SequenceRecordReaderFunction
  "RecordReaderFunction: Given a SequenceRecordReader and a file (via Spark PortableDataStream), load and parse the
 sequence data into a List<List<Writable>>"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions SequenceRecordReaderFunction]))

(defn ->sequence-record-reader-function
  "Constructor.

  sequence-record-reader - `org.datavec.api.records.reader.SequenceRecordReader`"
  (^SequenceRecordReaderFunction [^org.datavec.api.records.reader.SequenceRecordReader sequence-record-reader]
    (new SequenceRecordReaderFunction sequence-record-reader)))

(defn call
  "value - `scala.Tuple2`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^SequenceRecordReaderFunction this ^scala.Tuple2 value]
    (-> this (.call value))))

