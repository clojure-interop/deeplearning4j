(ns org.datavec.spark.transform.sequence.SparkMapToPairByColumnFunction
  "Spark function to map a n example to a pair, by using one of the columns as the key."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sequence SparkMapToPairByColumnFunction]))

(defn ->spark-map-to-pair-by-column-function
  "Constructor."
  (^SparkMapToPairByColumnFunction []
    (new SparkMapToPairByColumnFunction )))

(defn call
  "writables - `java.util.List`

  returns: `scala.Tuple2<org.datavec.api.writable.Writable,java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^SparkMapToPairByColumnFunction this ^java.util.List writables]
    (-> this (.call writables))))

