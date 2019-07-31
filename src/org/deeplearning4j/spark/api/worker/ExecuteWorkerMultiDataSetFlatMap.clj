(ns org.deeplearning4j.spark.api.worker.ExecuteWorkerMultiDataSetFlatMap
  "A FlatMapFunction for executing training on MultiDataSets. Used only in SparkComputationGraph implementation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.worker ExecuteWorkerMultiDataSetFlatMap]))

(defn ->execute-worker-multi-data-set-flat-map
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`"
  (^ExecuteWorkerMultiDataSetFlatMap [^org.deeplearning4j.spark.api.TrainingWorker worker]
    (new ExecuteWorkerMultiDataSetFlatMap worker)))

