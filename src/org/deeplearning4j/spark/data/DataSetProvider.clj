(ns org.deeplearning4j.spark.data.DataSetProvider
  "A provider for an DataSet
 rdd."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data DataSetProvider]))

(defn data
  "Return an rdd of type dataset

  spark-context - `org.apache.spark.SparkContext`

  returns: `org.apache.spark.rdd.RDD<org.nd4j.linalg.dataset.DataSet>`"
  (^org.apache.spark.rdd.RDD [^DataSetProvider this ^org.apache.spark.SparkContext spark-context]
    (-> this (.data spark-context))))

(defn transform-process
  "(Optional) The transform process
  for the dataset provider.

  returns: `org.datavec.api.transform.TransformProcess`"
  (^org.datavec.api.transform.TransformProcess [^DataSetProvider this]
    (-> this (.transformProcess))))

