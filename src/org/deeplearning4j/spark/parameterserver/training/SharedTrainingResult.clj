(ns org.deeplearning4j.spark.parameterserver.training.SharedTrainingResult
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.parameterserver.training SharedTrainingResult]))

(defn ->shared-training-result
  "Constructor."
  (^SharedTrainingResult []
    (new SharedTrainingResult )))

(defn set-stats
  "spark-training-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^SharedTrainingResult this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats]
    (-> this (.setStats spark-training-stats))))

