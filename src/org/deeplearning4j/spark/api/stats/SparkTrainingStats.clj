(ns org.deeplearning4j.spark.api.stats.SparkTrainingStats
  "SparkTrainingStats is an interface that is used for accessing training statistics, for multiple TrainingMaster
 implementations.

 The idea is that for debugging purposes, we want to collect a number of statistics related to the training. However, these
 statistics will vary, depending on which the type of training we are doing. Specifically, both the keys (number/names of stats)
 and their actual values (types/classes) can vary.

 The interface here operates essentially as a Map<String,Object>. Note however that SparkTrainingStats instances
 may be nested: for example a ParameterAveragingTrainingMasterStats may have a
 CommonSparkTrainingStats instance which may in turn have a ParameterAveragingTrainingWorkerStats
 instance."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.api.stats SparkTrainingStats]))

(defn get-key-set
  "returns: Set of keys that can be used with getValue(String) - `java.util.Set<java.lang.String>`"
  (^java.util.Set [^SparkTrainingStats this]
    (-> this (.getKeySet))))

(defn get-value
  "Get the statistic value for this key

  key - Key to get the value for - `java.lang.String`

  returns: Statistic for this key, or an exception if key is invalid - `java.util.List<org.deeplearning4j.spark.stats.EventStats>`"
  (^java.util.List [^SparkTrainingStats this ^java.lang.String key]
    (-> this (.getValue key))))

(defn get-short-name-for-key
  "Return a short (display) name for the given key.

  key - Key - `java.lang.String`

  returns: Short/display name for key - `java.lang.String`"
  (^java.lang.String [^SparkTrainingStats this ^java.lang.String key]
    (-> this (.getShortNameForKey key))))

(defn default-include-in-plots
  "When plotting statistics, we don't necessarily want to plot everything.
  For example, some statistics/measurements are made up multiple smaller components; it does not always make sense
  to plot both the larger stat, and the components that make it up

  key - Key to check for default plotting behaviour - `java.lang.String`

  returns: Whether the specified key should be included in plots by default or not - `boolean`"
  (^Boolean [^SparkTrainingStats this ^java.lang.String key]
    (-> this (.defaultIncludeInPlots key))))

(defn add-other-training-stats
  "Combine the two training stats instances. Usually, the two objects must be of the same type

  other - Other training stats to return - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  ([^SparkTrainingStats this ^org.deeplearning4j.spark.api.stats.SparkTrainingStats other]
    (-> this (.addOtherTrainingStats other))))

(defn get-nested-training-stats
  "Return the nested training stats - if any.

  returns: The nested stats, if present/applicable, or null otherwise - `org.deeplearning4j.spark.api.stats.SparkTrainingStats`"
  (^org.deeplearning4j.spark.api.stats.SparkTrainingStats [^SparkTrainingStats this]
    (-> this (.getNestedTrainingStats))))

(defn stats-as-string
  "Get a String representation of the stats. This functionality is implemented as a separate method (as opposed to toString())
  as the resulting String can be very large.
  NOTE: The String representation typically includes only duration information. To get full statistics (including
  machine IDs, etc) use getValue(String) or export full data via exportStatFiles(String, SparkContext)

  returns: A String representation of the training statistics - `java.lang.String`"
  (^java.lang.String [^SparkTrainingStats this]
    (-> this (.statsAsString))))

(defn export-stat-files
  "Export the stats as a collection of files. Stats are comma-delimited (CSV) with 1 header line

  output-path - Base directory to write files to - `java.lang.String`
  sc - `org.apache.spark.SparkContext`

  throws: java.io.IOException"
  ([^SparkTrainingStats this ^java.lang.String output-path ^org.apache.spark.SparkContext sc]
    (-> this (.exportStatFiles output-path sc))))

