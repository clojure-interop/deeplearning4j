(ns org.deeplearning4j.spark.parameterserver.functions.SharedFlatMapPaths
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.functions SharedFlatMapPaths]))

(defn ->shared-flat-map-paths
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`
  loader - `org.deeplearning4j.api.loader.DataSetLoader`"
  (^SharedFlatMapPaths [^org.deeplearning4j.spark.api.TrainingWorker worker ^org.deeplearning4j.api.loader.DataSetLoader loader]
    (new SharedFlatMapPaths worker loader)))

