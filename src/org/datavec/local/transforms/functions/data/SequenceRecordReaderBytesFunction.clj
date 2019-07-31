(ns org.datavec.local.transforms.functions.data.SequenceRecordReaderBytesFunction
  "SequenceRecordReaderBytesFunction: Converts binary data (in the form of a BytesWritable) to DataVec format data
 (List<List<<Writable>>) using a SequenceRecordReader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.functions.data SequenceRecordReaderBytesFunction]))

(defn ->sequence-record-reader-bytes-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.SequenceRecordReader`"
  (^SequenceRecordReaderBytesFunction [^org.datavec.api.records.reader.SequenceRecordReader record-reader]
    (new SequenceRecordReaderBytesFunction record-reader)))

(defn apply
  "Description copied from interface: Function

  v-1 - Input - `org.nd4j.linalg.primitives.Pair`

  returns: Result - `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`"
  (^java.util.List [^SequenceRecordReaderBytesFunction this ^org.nd4j.linalg.primitives.Pair v-1]
    (-> this (.apply v-1))))

