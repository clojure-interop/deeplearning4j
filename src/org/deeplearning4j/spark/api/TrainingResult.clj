(ns org.deeplearning4j.spark.api.TrainingResult
  "TrainingResult: a class used by TrainingMaster implementations
 Each TrainingMaster will have its own type of training result."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api TrainingResult]))

(defn set-stats
  "spark-training-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^TrainingResult this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats spark-training-stats]
    (-> this (.setStats spark-training-stats))))

