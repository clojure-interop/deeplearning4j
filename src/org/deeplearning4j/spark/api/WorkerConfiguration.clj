(ns org.deeplearning4j.spark.api.WorkerConfiguration
  "A simple configuration object (common settings for workers)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api WorkerConfiguration]))

(defn ->worker-configuration
  "Constructor."
  (^WorkerConfiguration []
    (new WorkerConfiguration )))

