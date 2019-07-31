(ns org.deeplearning4j.spark.api.worker.ExecuteWorkerPathFlatMap
  "A FlatMapFunction for executing training on serialized DataSet objects, that can be loaded from a path (local or HDFS)
 that is specified as a String
 Used in both SparkDl4jMultiLayer and SparkComputationGraph implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.worker ExecuteWorkerPathFlatMap]))

(defn ->execute-worker-path-flat-map
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`
  loader - `org.deeplearning4j.api.loader.DataSetLoader`"
  (^ExecuteWorkerPathFlatMap [^org.deeplearning4j.spark.api.TrainingWorker worker ^org.deeplearning4j.api.loader.DataSetLoader loader]
    (new ExecuteWorkerPathFlatMap worker loader)))

