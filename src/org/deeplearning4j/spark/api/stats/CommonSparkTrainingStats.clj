(ns org.deeplearning4j.spark.api.stats.CommonSparkTrainingStats
  "A SparkTrainingStats implementation for common stats functionality used by most workers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.stats CommonSparkTrainingStats]))

(defn ->common-spark-training-stats
  "Constructor."
  (^CommonSparkTrainingStats []
    (new CommonSparkTrainingStats )))

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/DEFAULT_DELIMITER)

(def *-filename-total-time-stats
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/FILENAME_TOTAL_TIME_STATS)

(def *-filename-get-initial-model-stats
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/FILENAME_GET_INITIAL_MODEL_STATS)

(def *-filename-dataset-get-time-stats
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/FILENAME_DATASET_GET_TIME_STATS)

(def *-filename-process-minibatch-time-stats
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/FILENAME_PROCESS_MINIBATCH_TIME_STATS)

(def *-worker-flat-map-total-time-ms
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/WORKER_FLAT_MAP_TOTAL_TIME_MS)

(def *-worker-flat-map-get-initial-model-time-ms
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/WORKER_FLAT_MAP_GET_INITIAL_MODEL_TIME_MS)

(def *-worker-flat-map-data-set-get-times-ms
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/WORKER_FLAT_MAP_DATA_SET_GET_TIMES_MS)

(def *-worker-flat-map-process-mini-batch-times-ms
  "Static Constant.

  type: java.lang.String"
  CommonSparkTrainingStats/WORKER_FLAT_MAP_PROCESS_MINI_BATCH_TIMES_MS)

(defn get-key-set
  "returns: Set of keys that can be used with SparkTrainingStats.getValue(String) - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^CommonSparkTrainingStats this]
    (-> this (.getKeySet))))

(defn get-value
  "Description copied from interface: SparkTrainingStats

  key - Key to get the value for - `java.lang.String`

  returns: Statistic for this key, or an exception if key is invalid - `java.util.List<org.deeplearning4j.spark.stats.EventStats>`"
  (^java.util.List [^CommonSparkTrainingStats this ^java.lang.String key]
    (-> this (.getValue key))))

(defn get-short-name-for-key
  "Description copied from interface: SparkTrainingStats

  key - Key - `java.lang.String`

  returns: Short/display name for key - `java.lang.String`"
  (^java.lang.String [^CommonSparkTrainingStats this ^java.lang.String key]
    (-> this (.getShortNameForKey key))))

(defn default-include-in-plots
  "Description copied from interface: SparkTrainingStats

  key - Key to check for default plotting behaviour - `java.lang.String`

  returns: Whether the specified key should be included in plots by default or not - `boolean`"
  (^Boolean [^CommonSparkTrainingStats this ^java.lang.String key]
    (-> this (.defaultIncludeInPlots key))))

(defn add-other-training-stats
  "Description copied from interface: SparkTrainingStats

  other - Other training stats to return - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^CommonSparkTrainingStats this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats other]
    (-> this (.addOtherTrainingStats other))))

(defn get-nested-training-stats
  "Description copied from interface: SparkTrainingStats

  returns: The nested stats, if present/applicable, or null otherwise - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^CommonSparkTrainingStats this]
    (-> this (.getNestedTrainingStats))))

(defn stats-as-string
  "Description copied from interface: SparkTrainingStats

  returns: A String representation of the training statistics - `java.lang.String`"
  (^java.lang.String [^CommonSparkTrainingStats this]
    (-> this (.statsAsString))))

(defn export-stat-files
  "Description copied from interface: SparkTrainingStats

  output-path - Base directory to write files to - `java.lang.String`
  sc - `org.apache.spark.SparkContext`

  throws: java.io.IOException"
  ([^CommonSparkTrainingStats this ^java.lang.String output-path ^org.apache.spark.SparkContext sc]
    (-> this (.exportStatFiles output-path sc))))

