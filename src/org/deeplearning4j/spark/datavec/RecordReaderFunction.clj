(ns org.deeplearning4j.spark.datavec.RecordReaderFunction
  "Turn a string in to a dataset based on
 a record reader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.datavec RecordReaderFunction]))

(defn ->record-reader-function
  "Constructor.

  record-reader - `org.datavec.api.records.reader.RecordReader`
  label-index - `int`
  num-possible-labels - `int`
  converter - `org.datavec.api.io.WritableConverter`"
  (^RecordReaderFunction [^org.datavec.api.records.reader.RecordReader record-reader ^Integer label-index ^Integer num-possible-labels ^org.datavec.api.io.WritableConverter converter]
    (new RecordReaderFunction record-reader label-index num-possible-labels converter))
  (^RecordReaderFunction [^org.datavec.api.records.reader.RecordReader record-reader ^Integer label-index ^Integer num-possible-labels]
    (new RecordReaderFunction record-reader label-index num-possible-labels)))

(defn call
  "v-1 - `java.lang.String`

  returns: `org.nd4j.linalg.dataset.DataSet`

  throws: java.lang.Exception"
  (^org.nd4j.linalg.dataset.DataSet [^RecordReaderFunction this ^java.lang.String v-1]
    (-> this (.call v-1))))

