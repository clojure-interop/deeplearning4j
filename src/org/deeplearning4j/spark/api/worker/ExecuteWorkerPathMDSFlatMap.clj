(ns org.deeplearning4j.spark.api.worker.ExecuteWorkerPathMDSFlatMap
  "A FlatMapFunction for executing training on serialized DataSet objects, that can be loaded from a path (local or HDFS)
 that is specified as a String
 Used in both SparkDl4jMultiLayer and SparkComputationGraph implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.worker ExecuteWorkerPathMDSFlatMap]))

(defn ->execute-worker-path-mds-flat-map
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`
  loader - `org.deeplearning4j.api.loader.MultiDataSetLoader`"
  (^ExecuteWorkerPathMDSFlatMap [^org.deeplearning4j.spark.api.TrainingWorker worker ^org.deeplearning4j.api.loader.MultiDataSetLoader loader]
    (new ExecuteWorkerPathMDSFlatMap worker loader)))

