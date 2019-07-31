(ns org.datavec.spark.transform.transform.SparkTransformFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.transform SparkTransformFunction]))

(defn ->spark-transform-function
  "Constructor."
  (^SparkTransformFunction []
    (new SparkTransformFunction )))

(defn call
  "v-1 - `java.util.List`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^SparkTransformFunction this ^java.util.List v-1]
    (-> this (.call v-1))))

