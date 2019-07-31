(ns org.deeplearning4j.spark.data.MultiDataSetProvider
  "A provider for an MultiDataSet
 rdd."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.data MultiDataSetProvider]))

(defn data
  "Return an rdd of type dataset

  spark-context - `org.apache.spark.SparkContext`

  returns: `org.apache.spark.rdd.RDD<org.nd4j.linalg.dataset.api.MultiDataSet>`"
  (^org.apache.spark.rdd.RDD [^MultiDataSetProvider this ^org.apache.spark.SparkContext spark-context]
    (-> this (.data spark-context))))

(defn transform-process
  "(Optional) The transform process
  for the dataset provider.

  returns: `org.datavec.api.transform.TransformProcess`"
  (^org.datavec.api.transform.TransformProcess [^MultiDataSetProvider this]
    (-> this (.transformProcess))))

