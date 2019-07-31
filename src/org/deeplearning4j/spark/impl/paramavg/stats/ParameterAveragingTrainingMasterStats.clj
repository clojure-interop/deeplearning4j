(ns org.deeplearning4j.spark.impl.paramavg.stats.ParameterAveragingTrainingMasterStats
  "Statistics collected by a ParameterAveragingTrainingMaster"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.paramavg.stats ParameterAveragingTrainingMasterStats]))

(defn ->parameter-averaging-training-master-stats
  "Constructor.

  worker-stats - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`
  parameter-averaging-master-export-times-ms - `java.util.List`
  parameter-averaging-master-count-rdd-size-times-ms - `java.util.List`
  parameter-averaging-master-broadcast-create-time-ms - `java.util.List`
  parameter-averaging-master-fit-time-ms - `java.util.List`
  parameter-averaging-master-split-time-ms - `java.util.List`
  parameter-averaging-master-map-partitions-times-ms - `java.util.List`
  parameter-averaging-master-aggregate-times-ms - `java.util.List`
  parameter-averaging-master-process-params-updater-times-ms - `java.util.List`
  parameter-averaging-master-repartition-times-ms - `java.util.List`"
  (^ParameterAveragingTrainingMasterStats [^org.deeplearning4j.spark.api.stats.SparkTrainingStats worker-stats ^java.util.List parameter-averaging-master-export-times-ms ^java.util.List parameter-averaging-master-count-rdd-size-times-ms ^java.util.List parameter-averaging-master-broadcast-create-time-ms ^java.util.List parameter-averaging-master-fit-time-ms ^java.util.List parameter-averaging-master-split-time-ms ^java.util.List parameter-averaging-master-map-partitions-times-ms ^java.util.List parameter-averaging-master-aggregate-times-ms ^java.util.List parameter-averaging-master-process-params-updater-times-ms ^java.util.List parameter-averaging-master-repartition-times-ms]
    (new ParameterAveragingTrainingMasterStats worker-stats parameter-averaging-master-export-times-ms parameter-averaging-master-count-rdd-size-times-ms parameter-averaging-master-broadcast-create-time-ms parameter-averaging-master-fit-time-ms parameter-averaging-master-split-time-ms parameter-averaging-master-map-partitions-times-ms parameter-averaging-master-aggregate-times-ms parameter-averaging-master-process-params-updater-times-ms parameter-averaging-master-repartition-times-ms)))

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/DEFAULT_DELIMITER)

(def *-filename-export-rdd-time
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_EXPORT_RDD_TIME)

(def *-filename-count-rdd-size
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_COUNT_RDD_SIZE)

(def *-filename-broadcast-create
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_BROADCAST_CREATE)

(def *-filename-fit-time
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_FIT_TIME)

(def *-filename-split-time
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_SPLIT_TIME)

(def *-filename-map-partitions-time
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_MAP_PARTITIONS_TIME)

(def *-filename-aggregate-time
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_AGGREGATE_TIME)

(def *-filename-process-params-time
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_PROCESS_PARAMS_TIME)

(def *-filename-repartition-stats
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/FILENAME_REPARTITION_STATS)

(def *-parameter-averaging-master-export-rdd-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_EXPORT_RDD_TIMES_MS)

(def *-parameter-averaging-master-count-rdd-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_COUNT_RDD_TIMES_MS)

(def *-parameter-averaging-master-broadcast-create-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_BROADCAST_CREATE_TIMES_MS)

(def *-parameter-averaging-master-fit-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_FIT_TIMES_MS)

(def *-parameter-averaging-master-split-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_SPLIT_TIMES_MS)

(def *-parameter-averaging-master-map-partitions-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_MAP_PARTITIONS_TIMES_MS)

(def *-parameter-averaging-master-aggregate-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_AGGREGATE_TIMES_MS)

(def *-parameter-averaging-master-process-params-updater-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_PROCESS_PARAMS_UPDATER_TIMES_MS)

(def *-parameter-averaging-master-repartition-times-ms
  "Static Constant.

  type: java.lang.String"
  ParameterAveragingTrainingMasterStats/PARAMETER_AVERAGING_MASTER_REPARTITION_TIMES_MS)

(defn get-key-set
  "returns: Set of keys that can be used with SparkTrainingStats.getValue(String) - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^ParameterAveragingTrainingMasterStats this]
    (-> this (.getKeySet))))

(defn get-value
  "Description copied from interface: SparkTrainingStats

  key - Key to get the value for - `java.lang.String`

  returns: Statistic for this key, or an exception if key is invalid - `java.util.List<org.deeplearning4j.spark.stats.EventStats>`"
  (^java.util.List [^ParameterAveragingTrainingMasterStats this ^java.lang.String key]
    (-> this (.getValue key))))

(defn get-short-name-for-key
  "Description copied from interface: SparkTrainingStats

  key - Key - `java.lang.String`

  returns: Short/display name for key - `java.lang.String`"
  (^java.lang.String [^ParameterAveragingTrainingMasterStats this ^java.lang.String key]
    (-> this (.getShortNameForKey key))))

(defn default-include-in-plots
  "Description copied from interface: SparkTrainingStats

  key - Key to check for default plotting behaviour - `java.lang.String`

  returns: Whether the specified key should be included in plots by default or not - `boolean`"
  (^Boolean [^ParameterAveragingTrainingMasterStats this ^java.lang.String key]
    (-> this (.defaultIncludeInPlots key))))

(defn add-other-training-stats
  "Description copied from interface: SparkTrainingStats

  other - Other training stats to return - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^ParameterAveragingTrainingMasterStats this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats other]
    (-> this (.addOtherTrainingStats other))))

(defn get-nested-training-stats
  "Description copied from interface: SparkTrainingStats

  returns: The nested stats, if present/applicable, or null otherwise - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^ParameterAveragingTrainingMasterStats this]
    (-> this (.getNestedTrainingStats))))

(defn stats-as-string
  "Description copied from interface: SparkTrainingStats

  returns: A String representation of the training statistics - `java.lang.String`"
  (^java.lang.String [^ParameterAveragingTrainingMasterStats this]
    (-> this (.statsAsString))))

(defn export-stat-files
  "Description copied from interface: SparkTrainingStats

  output-path - Base directory to write files to - `java.lang.String`
  sc - `org.apache.spark.SparkContext`

  throws: java.io.IOException"
  ([^ParameterAveragingTrainingMasterStats this ^java.lang.String output-path ^org.apache.spark.SparkContext sc]
    (-> this (.exportStatFiles output-path sc))))

