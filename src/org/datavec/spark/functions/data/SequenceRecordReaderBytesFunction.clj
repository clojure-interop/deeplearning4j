(ns org.datavec.spark.functions.data.SequenceRecordReaderBytesFunction
  "SequenceRecordReaderBytesFunction: Converts binary data (in the form of a BytesWritable) to DataVec format data
 (List<List<<Writable>>) using a SequenceRecordReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.data SequenceRecordReaderBytesFunction]))

(defn ->sequence-record-reader-bytes-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.SequenceRecordReader`"
  (^SequenceRecordReaderBytesFunction [^org.datavec.api.records.reader.SequenceRecordReader record-reader]
    (new SequenceRecordReaderBytesFunction record-reader)))

(defn call
  "v-1 - `scala.Tuple2`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^SequenceRecordReaderBytesFunction this ^scala.Tuple2 v-1]
    (-> this (.call v-1))))

