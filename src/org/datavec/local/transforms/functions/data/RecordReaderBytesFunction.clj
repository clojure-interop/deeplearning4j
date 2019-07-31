(ns org.datavec.local.transforms.functions.data.RecordReaderBytesFunction
  "RecordReaderBytesFunction: Converts binary data (in the form of a BytesWritable) to DataVec format data
 (Collection<Writable>) using a RecordReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.functions.data RecordReaderBytesFunction]))

(defn ->record-reader-bytes-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.RecordReader`"
  (^RecordReaderBytesFunction [^org.datavec.api.records.reader.RecordReader record-reader]
    (new RecordReaderBytesFunction record-reader)))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `java.util.List<org.datavec.api.writable.Writable>`"
  (^java.util.List [^RecordReaderBytesFunction this ^org.nd4j.linalg.primitives.Pair v-1]
    (-> this (.apply v-1))))

