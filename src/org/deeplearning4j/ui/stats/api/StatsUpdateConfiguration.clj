(ns org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration
  "Similar to StatsInitializationConfiguration, StatsUpdateConfiguration is an interface defining the stats
 that should be collected and reported periodically.
 In some implementations, this configuration may vary over time (i.e., stats may in principle be reconfigured by the user)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.api StatsUpdateConfiguration]))

(defn collect-mean-magnitudes
  "Should the mean magnitude values (per parameter type, or per layer for activations) be collected?

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectMeanMagnitudes type))))

(defn collect-performance-stats
  "Should performance stats be collected/reported?
  Total time, total examples, total batches, Minibatches/second, examples/second

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this]
    (-> this (.collectPerformanceStats))))

(defn collect-garbage-collection-stats
  "Should garbage collection stats be collected and reported?

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this]
    (-> this (.collectGarbageCollectionStats))))

(defn collect-stdev
  "Should the standard devication values (per parameter type, or per layer for activations) be collected?

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectStdev type))))

(defn collect-memory-stats
  "Should JVM, off-heap and memory stats be collected/reported?

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this]
    (-> this (.collectMemoryStats))))

(defn num-histogram-bins
  "Get the number of histogram bins to use for the given type (for use with collectHistograms(StatsType)

  type - Stats type: Parameters, Updates, Activatinos - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `int`"
  (^Integer [^StatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.numHistogramBins type))))

(defn reporting-frequency
  "Get the reporting frequency, in terms of listener calls

  returns: `int`"
  (^Integer [^StatsUpdateConfiguration this]
    (-> this (.reportingFrequency))))

(defn collect-mean
  "Should the mean values (per parameter type, or per layer for activations) be collected?

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectMean type))))

(defn collect-learning-rates
  "Should per-parameter type learning rates be collected and reported?

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this]
    (-> this (.collectLearningRates))))

(defn collect-histograms
  "Should histograms (per parameter type, or per layer for activations) of the given type be collected?

  type - Stats type: Parameters, Updates, Activations - `org.deeplearning4j.ui.stats.api.StatsType`

  returns: `boolean`"
  (^Boolean [^StatsUpdateConfiguration this ^org.deeplearning4j.ui.stats.api.StatsType type]
    (-> this (.collectHistograms type))))

