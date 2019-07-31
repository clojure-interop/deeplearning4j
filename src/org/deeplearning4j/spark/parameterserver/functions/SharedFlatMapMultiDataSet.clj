(ns org.deeplearning4j.spark.parameterserver.functions.SharedFlatMapMultiDataSet
  "Created by raver119 on 13.06.17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.functions SharedFlatMapMultiDataSet]))

(defn ->shared-flat-map-multi-data-set
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`"
  (^SharedFlatMapMultiDataSet [^org.deeplearning4j.spark.api.TrainingWorker worker]
    (new SharedFlatMapMultiDataSet worker)))

