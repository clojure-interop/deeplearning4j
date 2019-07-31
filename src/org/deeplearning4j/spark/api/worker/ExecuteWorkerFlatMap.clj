(ns org.deeplearning4j.spark.api.worker.ExecuteWorkerFlatMap
  "A FlatMapFunction for executing training on DataSets.
 Used in both SparkDl4jMultiLayer and SparkComputationGraph implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.worker ExecuteWorkerFlatMap]))

(defn ->execute-worker-flat-map
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`"
  (^ExecuteWorkerFlatMap [^org.deeplearning4j.spark.api.TrainingWorker worker]
    (new ExecuteWorkerFlatMap worker)))

