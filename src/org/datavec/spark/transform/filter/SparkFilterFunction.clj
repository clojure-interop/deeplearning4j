(ns org.datavec.spark.transform.filter.SparkFilterFunction
  "Spark function for executing filter operations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.filter SparkFilterFunction]))

(defn ->spark-filter-function
  "Constructor."
  (^SparkFilterFunction []
    (new SparkFilterFunction )))

(defn call
  "v-1 - `java.util.List`

  returns: `java.lang.Boolean`

  throws: java.lang.Exception"
  (^java.lang.Boolean [^SparkFilterFunction this ^java.util.List v-1]
    (-> this (.call v-1))))

