(ns org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.stats CommonSparkTrainingStats$Builder]))

(defn ->builder
  "Constructor."
  (^CommonSparkTrainingStats$Builder []
    (new CommonSparkTrainingStats$Builder )))

(defn training-master-specific-stats
  "training-master-specific-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`

  returns: `org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder`"
  (^org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder [^CommonSparkTrainingStats$Builder this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats training-master-specific-stats]
    (-> this (.trainingMasterSpecificStats training-master-specific-stats))))

(defn worker-flat-map-total-time-ms
  "worker-flat-map-total-time-ms - `java.util.List`

  returns: `org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder`"
  (^org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder [^CommonSparkTrainingStats$Builder this ^java.util.List worker-flat-map-total-time-ms]
    (-> this (.workerFlatMapTotalTimeMs worker-flat-map-total-time-ms))))

(defn worker-flat-map-get-initial-model-time-ms
  "worker-flat-map-get-initial-model-time-ms - `java.util.List`

  returns: `org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder`"
  (^org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder [^CommonSparkTrainingStats$Builder this ^java.util.List worker-flat-map-get-initial-model-time-ms]
    (-> this (.workerFlatMapGetInitialModelTimeMs worker-flat-map-get-initial-model-time-ms))))

(defn worker-flat-map-data-set-get-times-ms
  "worker-flat-map-data-set-get-times-ms - `java.util.List`

  returns: `org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder`"
  (^org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder [^CommonSparkTrainingStats$Builder this ^java.util.List worker-flat-map-data-set-get-times-ms]
    (-> this (.workerFlatMapDataSetGetTimesMs worker-flat-map-data-set-get-times-ms))))

(defn worker-flat-map-process-mini-batch-times-ms
  "worker-flat-map-process-mini-batch-times-ms - `java.util.List`

  returns: `org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder`"
  (^org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats$Builder [^CommonSparkTrainingStats$Builder this ^java.util.List worker-flat-map-process-mini-batch-times-ms]
    (-> this (.workerFlatMapProcessMiniBatchTimesMs worker-flat-map-process-mini-batch-times-ms))))

(defn build
  "returns: `org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats [^CommonSparkTrainingStats$Builder this]
    (-> this (.build))))

