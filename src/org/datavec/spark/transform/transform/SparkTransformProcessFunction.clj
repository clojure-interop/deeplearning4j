(ns org.datavec.spark.transform.transform.SparkTransformProcessFunction
  "Spark function for executing a transform process"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.transform SparkTransformProcessFunction]))

(defn ->spark-transform-process-function
  "Constructor.

  transform-process - `org.datavec.api.transform.TransformProcess`"
  (^SparkTransformProcessFunction [^org.datavec.api.transform.TransformProcess transform-process]
    (new SparkTransformProcessFunction transform-process)))

