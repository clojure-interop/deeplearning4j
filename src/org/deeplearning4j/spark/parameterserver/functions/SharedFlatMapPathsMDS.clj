(ns org.deeplearning4j.spark.parameterserver.functions.SharedFlatMapPathsMDS
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.functions SharedFlatMapPathsMDS]))

(defn ->shared-flat-map-paths-mds
  "Constructor.

  worker - `org.deeplearning4j.spark.api.TrainingWorker`
  loader - `org.deeplearning4j.api.loader.MultiDataSetLoader`"
  (^SharedFlatMapPathsMDS [^org.deeplearning4j.spark.api.TrainingWorker worker ^org.deeplearning4j.api.loader.MultiDataSetLoader loader]
    (new SharedFlatMapPathsMDS worker loader)))

