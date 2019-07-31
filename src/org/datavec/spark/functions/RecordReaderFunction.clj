(ns org.datavec.spark.functions.RecordReaderFunction
  "RecordReaderFunction: Given a RecordReader and a file (via Spark PortableDataStream), load and parse the
 data into a Collection.
 NOTE: This is only useful for \"one record per file\" type situations (ImageRecordReader, etc)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions RecordReaderFunction]))

(defn ->record-reader-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.RecordReader`"
  (^RecordReaderFunction [^org.datavec.api.records.reader.RecordReader record-reader]
    (new RecordReaderFunction record-reader)))

(defn call
  "value - `scala.Tuple2`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^RecordReaderFunction this ^scala.Tuple2 value]
    (-> this (.call value))))

