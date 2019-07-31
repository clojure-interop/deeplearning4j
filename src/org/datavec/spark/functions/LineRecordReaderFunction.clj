(ns org.datavec.spark.functions.LineRecordReaderFunction
  "LineRecordReaderFunction: Used to map a JavaRDD<String> to a JavaRDD<Collection<Writable>>
 Note that this is most useful with LineRecordReader instances (CSVRecordReader, SVMLightRecordReader, etc)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions LineRecordReaderFunction]))

(defn ->line-record-reader-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.RecordReader`"
  (^LineRecordReaderFunction [^org.datavec.api.records.reader.RecordReader record-reader]
    (new LineRecordReaderFunction record-reader)))

(defn call
  "s - `java.lang.String`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^LineRecordReaderFunction this ^java.lang.String s]
    (-> this (.call s))))

