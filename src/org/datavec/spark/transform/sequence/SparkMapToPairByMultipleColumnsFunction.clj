(ns org.datavec.spark.transform.sequence.SparkMapToPairByMultipleColumnsFunction
  "Spark function to map an example to a pair, by using some of the column values as the key."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sequence SparkMapToPairByMultipleColumnsFunction]))

(defn ->spark-map-to-pair-by-multiple-columns-function
  "Constructor."
  (^SparkMapToPairByMultipleColumnsFunction []
    (new SparkMapToPairByMultipleColumnsFunction )))

(defn call
  "writables - `java.util.List`

  returns: `scala.Tuple2<java.util.List<org.datavec.api.writable.Writable>,java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^SparkMapToPairByMultipleColumnsFunction this ^java.util.List writables]
    (-> this (.call writables))))

