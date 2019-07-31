(ns org.datavec.spark.transform.sequence.SparkSequenceTransformFunction
  "Spark function for transforming sequences using a Transform"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sequence SparkSequenceTransformFunction]))

(defn ->spark-sequence-transform-function
  "Constructor."
  (^SparkSequenceTransformFunction []
    (new SparkSequenceTransformFunction )))

(defn call
  "v-1 - `java.util.List`

  returns: `java.util.List<java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^java.util.List [^SparkSequenceTransformFunction this ^java.util.List v-1]
    (-> this (.call v-1))))

