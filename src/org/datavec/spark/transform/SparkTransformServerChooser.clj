(ns org.datavec.spark.transform.SparkTransformServerChooser
  "Created by kepricon on 17. 6. 20."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform SparkTransformServerChooser]))

(defn ->spark-transform-server-chooser
  "Constructor."
  (^SparkTransformServerChooser []
    (new SparkTransformServerChooser )))

(defn *main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([args]
    (SparkTransformServerChooser/main args)))

(defn run-main
  "args - `java.lang.String[]`

  throws: java.lang.Exception"
  ([^SparkTransformServerChooser this args]
    (-> this (.runMain args))))

