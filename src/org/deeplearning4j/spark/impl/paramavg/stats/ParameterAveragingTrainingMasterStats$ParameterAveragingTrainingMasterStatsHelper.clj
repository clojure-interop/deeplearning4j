(ns org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.stats ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper]))

(defn ->parameter-averaging-training-master-stats-helper
  "Constructor."
  (^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper []
    (new ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper )))

(defn add-worker-stats
  "worker-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats worker-stats]
    (-> this (.addWorkerStats worker-stats))))

(defn log-fit-end
  "examples-count - `int`"
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this ^Integer examples-count]
    (-> this (.logFitEnd examples-count))))

(defn log-process-params-updater-end
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logProcessParamsUpdaterEnd))))

(defn log-count-end
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logCountEnd))))

(defn log-broadcast-end
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logBroadcastEnd))))

(defn log-broadcast-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logBroadcastStart))))

(defn log-map-partitions-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logMapPartitionsStart))))

(defn log-map-partitions-end
  "n-partitions - `int`"
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this ^Integer n-partitions]
    (-> this (.logMapPartitionsEnd n-partitions))))

(defn log-export-end
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logExportEnd))))

(defn build
  "returns: `org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingMasterStats`"
  (^org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingMasterStats [^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.build))))

(defn log-repartition-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logRepartitionStart))))

(defn log-repartition-end
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logRepartitionEnd))))

(defn log-split-end
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logSplitEnd))))

(defn log-split-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logSplitStart))))

(defn log-process-params-updater-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logProcessParamsUpdaterStart))))

(defn log-aggregate-start-time
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logAggregateStartTime))))

(defn log-aggregation-end-time
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logAggregationEndTime))))

(defn log-fit-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logFitStart))))

(defn log-count-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logCountStart))))

(defn log-export-start
  ""
  ([^ParameterAveragingTrainingMasterStats$ParameterAveragingTrainingMasterStatsHelper this]
    (-> this (.logExportStart))))

