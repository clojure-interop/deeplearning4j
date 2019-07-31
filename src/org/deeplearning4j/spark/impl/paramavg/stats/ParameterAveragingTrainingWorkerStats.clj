(ns org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingWorkerStats
  "Statistics collected by ParameterAveragingTrainingWorker instances"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.stats ParameterAveragingTrainingWorkerStats]))

(defn ->parameter-averaging-training-worker-stats
  "Constructor.

  parameter-averaging-worker-broadcast-get-value-time-ms - `java.util.List`
  parameter-averaging-worker-init-time-ms - `java.util.List`
  parameter-averaging-worker-fit-times-ms - `java.util.List`"
  (^ParameterAveragingTrainingWorkerStats [^java.util.List parameter-averaging-worker-broadcast-get-value-time-ms ^java.util.List parameter-averaging-worker-init-time-ms ^java.util.List parameter-averaging-worker-fit-times-ms]
    (new ParameterAveragingTrainingWorkerStats parameter-averaging-worker-broadcast-get-value-time-ms parameter-averaging-worker-init-time-ms parameter-averaging-worker-fit-times-ms)))

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingWorkerStats/DEFAULT_DELIMITER)

(def *-filename-broadcast-get-stats
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingWorkerStats/FILENAME_BROADCAST_GET_STATS)

(def *-filename-init-stats
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingWorkerStats/FILENAME_INIT_STATS)

(def *-filename-fit-stats
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingWorkerStats/FILENAME_FIT_STATS)

(def *-parameter-averaging-worker-broadcast-get-value-time-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingWorkerStats/PARAMETER_AVERAGING_WORKER_BROADCAST_GET_VALUE_TIME_MS)

(def *-parameter-averaging-worker-init-time-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingWorkerStats/PARAMETER_AVERAGING_WORKER_INIT_TIME_MS)

(def *-parameter-averaging-worker-fit-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingWorkerStats/PARAMETER_AVERAGING_WORKER_FIT_TIMES_MS)

(defn get-key-set
  "returns: Set of keys that can be used with SparkTrainingStats.getValue(String) - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^ParameterAveragingTrainingWorkerStats this]
    (-> this (.getKeySet))))

(defn get-value
  "Description copied from interface: SparkTrainingStats

  key - Key to get the value for - `java.lang.String`

  returns: Statistic for this key, or an exception if key is invalid - `java.util.List<org.deeplearning4j.spark.stats.EventStats>`"
  (^java.util.List [^ParameterAveragingTrainingWorkerStats this ^java.lang.String key]
    (-> this (.getValue key))))

(defn get-short-name-for-key
  "Description copied from interface: SparkTrainingStats

  key - Key - `java.lang.String`

  returns: Short/display name for key - `java.lang.String`"
  (^java.lang.String [^ParameterAveragingTrainingWorkerStats this ^java.lang.String key]
    (-> this (.getShortNameForKey key))))

(defn default-include-in-plots
  "Description copied from interface: SparkTrainingStats

  key - Key to check for default plotting behaviour - `java.lang.String`

  returns: Whether the specified key should be included in plots by default or not - `boolean`"
  (^Boolean [^ParameterAveragingTrainingWorkerStats this ^java.lang.String key]
    (-> this (.defaultIncludeInPlots key))))

(defn add-other-training-stats
  "Description copied from interface: SparkTrainingStats

  other - Other training stats to return - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^ParameterAveragingTrainingWorkerStats this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats other]
    (-> this (.addOtherTrainingStats other))))

(defn get-nested-training-stats
  "Description copied from interface: SparkTrainingStats

  returns: The nested stats, if present/applicable, or null otherwise - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^ParameterAveragingTrainingWorkerStats this]
    (-> this (.getNestedTrainingStats))))

(defn stats-as-string
  "Description copied from interface: SparkTrainingStats

  returns: A String representation of the training statistics - `java.lang.String`"
  (^java.lang.String [^ParameterAveragingTrainingWorkerStats this]
    (-> this (.statsAsString))))

(defn export-stat-files
  "Description copied from interface: SparkTrainingStats

  output-path - Base directory to write files to - `java.lang.String`
  sc - `org.apache.spark.SparkContext`

  throws: java.io.IOException"
  ([^ParameterAveragingTrainingWorkerStats this ^java.lang.String output-path ^org.apache.spark.SparkContext sc]
    (-> this (.exportStatFiles output-path sc))))

