(ns org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.stats ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper]))

(defn ->parameter-averaging-training-worker-stats-helper
  "Constructor."
  (^ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper []
    (new ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper )))

(defn log-broadcast-get-value-start
  ""
  ([^ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper this]
    (-> this (.logBroadcastGetValueStart))))

(defn log-broadcast-get-value-end
  ""
  ([^ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper this]
    (-> this (.logBroadcastGetValueEnd))))

(defn log-init-end
  ""
  ([^ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper this]
    (-> this (.logInitEnd))))

(defn log-fit-start
  ""
  ([^ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper this]
    (-> this (.logFitStart))))

(defn log-fit-end
  "num-examples - `int`"
  ([^ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper this ^Integer num-examples]
    (-> this (.logFitEnd num-examples))))

(defn build
  "returns: `org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingWorkerStats`"
  (^org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingWorkerStats [^ParameterAveragingTrainingWorkerStats$ParameterAveragingTrainingWorkerStatsHelper this]
    (-> this (.build))))

