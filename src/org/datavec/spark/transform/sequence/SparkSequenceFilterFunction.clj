(ns org.datavec.spark.transform.sequence.SparkSequenceFilterFunction
  "Created by Alex on 5/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.sequence SparkSequenceFilterFunction]))

(defn ->spark-sequence-filter-function
  "Constructor."
  (^SparkSequenceFilterFunction []
    (new SparkSequenceFilterFunction )))

(defn call
  "v-1 - `java.util.List`

  returns: `java.lang.Boolean`

  throws: java.lang.Exception"
  (^java.lang.Boolean [^SparkSequenceFilterFunction this ^java.util.List v-1]
    (-> this (.call v-1))))

