(ns org.datavec.spark.functions.data.RecordReaderBytesFunction
  "RecordReaderBytesFunction: Converts binary data (in the form of a BytesWritable) to DataVec format data
 (Collection<Writable>) using a RecordReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.data RecordReaderBytesFunction]))

(defn ->record-reader-bytes-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.RecordReader`"
  (^RecordReaderBytesFunction [^org.datavec.api.records.reader.RecordReader record-reader]
    (new RecordReaderBytesFunction record-reader)))

(defn call
  "v-1 - `scala.Tuple2`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^RecordReaderBytesFunction this ^scala.Tuple2 v-1]
    (-> this (.call v-1))))

