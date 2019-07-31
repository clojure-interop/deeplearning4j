(ns org.datavec.spark.transform.transform.SparkTransformProcessFunctionAdapter
  "Spark function for executing a transform process"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.transform SparkTransformProcessFunctionAdapter]))

(defn ->spark-transform-process-function-adapter
  "Constructor.

  transform-process - `org.datavec.api.transform.TransformProcess`"
  (^SparkTransformProcessFunctionAdapter [^org.datavec.api.transform.TransformProcess transform-process]
    (new SparkTransformProcessFunctionAdapter transform-process)))

(defn call
  "v-1 - `java.util.List`

  returns: `java.lang.Iterable<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.lang.Iterable [^SparkTransformProcessFunctionAdapter this ^java.util.List v-1]
    (-> this (.call v-1))))

