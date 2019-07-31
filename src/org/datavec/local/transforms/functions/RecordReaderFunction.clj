(ns org.datavec.local.transforms.functions.RecordReaderFunction
  "RecordReaderFunction: Given a RecordReader and a file (via InputStream), load and parse the
 data into a Collection.
 NOTE: This is only useful for \"one record per file\" type situations (ImageRecordReader, etc)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.functions RecordReaderFunction]))

(defn ->record-reader-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.RecordReader`"
  (^RecordReaderFunction [^org.datavec.api.records.reader.RecordReader record-reader]
    (new RecordReaderFunction record-reader)))

(defn apply
  "Description copied from interface: Function

  value - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^RecordReaderFunction this ^org.nd4j.linalg.primitives.Pair value]
    (-> this (.apply value))))

