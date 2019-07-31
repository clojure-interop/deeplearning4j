(ns org.datavec.spark.storage.functions.RecordLoadPairFunction
  "A simple function to prepare data during loading via SparkStorageUtils"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.storage.functions RecordLoadPairFunction]))

(defn ->record-load-pair-function
  "Constructor."
  (^RecordLoadPairFunction []
    (new RecordLoadPairFunction )))

(defn call
  "t-2 - `scala.Tuple2`

  returns: `scala.Tuple2<java.lang.Long,java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^RecordLoadPairFunction this ^scala.Tuple2 t-2]
    (-> this (.call t-2))))

