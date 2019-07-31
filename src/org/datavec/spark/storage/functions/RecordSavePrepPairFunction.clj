(ns org.datavec.spark.storage.functions.RecordSavePrepPairFunction
  "A simple function to prepare data for saving via SparkStorageUtils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.storage.functions RecordSavePrepPairFunction]))

(defn ->record-save-prep-pair-function
  "Constructor."
  (^RecordSavePrepPairFunction []
    (new RecordSavePrepPairFunction )))

(defn call
  "t-2 - `scala.Tuple2`

  returns: `scala.Tuple2<org.apache.hadoop.io.LongWritable,org.datavec.hadoop.records.reader.mapfile.record.RecordWritable>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^RecordSavePrepPairFunction this ^scala.Tuple2 t-2]
    (-> this (.call t-2))))

