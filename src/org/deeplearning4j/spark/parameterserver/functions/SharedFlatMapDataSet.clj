(ns org.deeplearning4j.spark.parameterserver.functions.SharedFlatMapDataSet
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.functions SharedFlatMapDataSet]))

(defn ->shared-flat-map-data-set
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`"
  (^SharedFlatMapDataSet [^org.deeplearning4j.spark.api.TrainingWorker worker]
    (new SharedFlatMapDataSet worker)))

