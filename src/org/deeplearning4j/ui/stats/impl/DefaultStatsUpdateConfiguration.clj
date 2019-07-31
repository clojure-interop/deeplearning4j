(ns org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration
  "Created by Alex on 07/10/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.impl DefaultStatsUpdateConfiguration]))

(def *-default-reporting-frequency
  "Static Constant.

  type: int"
  DefaultStatsUpdateConfiguration/DEFAULT_REPORTING_FREQUENCY)

(defn collect-mean-magnitudes
  "Description copied from interface: StatsUpdateConfiguration

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectMeanMagnitudes type))))

(defn collect-performance-stats
  "Description copied from interface: StatsUpdateConfiguration

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this]
    (-> this (.collectPerformanceStats))))

(defn collect-garbage-collection-stats
  "Description copied from interface: StatsUpdateConfiguration

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this]
    (-> this (.collectGarbageCollectionStats))))

(defn collect-stdev
  "Description copied from interface: StatsUpdateConfiguration

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectStdev type))))

(defn collect-memory-stats
  "Description copied from interface: StatsUpdateConfiguration

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this]
    (-> this (.collectMemoryStats))))

(defn num-histogram-bins
  "Description copied from interface: StatsUpdateConfiguration

  type - Stats type: Parameters, Updates, Activatinos - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `int`"
  (^Integer [^DefaultStatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.numHistogramBins type))))

(defn reporting-frequency
  "Description copied from interface: StatsUpdateConfiguration

  returns: `int`"
  (^Integer [^DefaultStatsUpdateConfiguration this]
    (-> this (.reportingFrequency))))

(defn collect-mean
  "Description copied from interface: StatsUpdateConfiguration

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectMean type))))

(defn collect-learning-rates
  "Description copied from interface: StatsUpdateConfiguration

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this]
    (-> this (.collectLearningRates))))

(defn collect-histograms
  "Description copied from interface: StatsUpdateConfiguration

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^DefaultStatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectHistograms type))))

