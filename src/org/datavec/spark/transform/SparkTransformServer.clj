(ns org.datavec.spark.transform.SparkTransformServer
  "Created by kepricon on 17. 6. 20."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform SparkTransformServer]))

(defn ->spark-transform-server
  "Constructor."
  (^SparkTransformServer []
    (new SparkTransformServer )))

(defn run-main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([^SparkTransformServer this args]
    (-> this (.runMain args))))

(defn stop
  "Stop the server"
  ([^SparkTransformServer this]
    (-> this (.stop))))

(defn transform-sequence-array-incremental
  "single-csv-record - `org.datavec.spark.transform.model.BatchCSVRecord`

  returns: `org.datavec.spark.transform.model.Base64NDArrayBody`"
  (^org.datavec.spark.transform.model.Base64NDArrayBody [^SparkTransformServer this ^org.datavec.spark.transform.model.BatchCSVRecord single-csv-record]
    (-> this (.transformSequenceArrayIncremental single-csv-record))))

