(ns org.datavec.spark.functions.pairdata.PairSequenceRecordReaderBytesFunction
  "SequenceRecordReaderBytesFunction: Converts two sets of binary data (in the form of a BytesPairWritable) to DataVec format data
 (Tuple2<List<List<<Writable>>,List<List<Writable>>) using two SequenceRecordReaders.
 Used for example when network input and output data comes from different files"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.functions.pairdata PairSequenceRecordReaderBytesFunction]))

(defn ->pair-sequence-record-reader-bytes-function
  "Constructor.

  record-reader-first - `org.datavec.api.records.reader.SequenceRecordReader`
  record-reader-second - `org.datavec.api.records.reader.SequenceRecordReader`"
  (^PairSequenceRecordReaderBytesFunction [^org.datavec.api.records.reader.SequenceRecordReader record-reader-first ^org.datavec.api.records.reader.SequenceRecordReader record-reader-second]
    (new PairSequenceRecordReaderBytesFunction record-reader-first record-reader-second)))

(defn call
  "v-1 - `scala.Tuple2`

  returns: `scala.Tuple2<java.util.List<java.util.List<org.datavec.api.writable.Writable>>,java.util.List<java.util.List<org.datavec.api.writable.Writable>>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^PairSequenceRecordReaderBytesFunction this ^scala.Tuple2 v-1]
    (-> this (.call v-1))))

