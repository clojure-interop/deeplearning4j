(ns org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.impl DefaultStatsUpdateConfiguration$Builder]))

(defn ->builder
  "Constructor."
  (^DefaultStatsUpdateConfiguration$Builder []
    (new DefaultStatsUpdateConfiguration$Builder )))

(defn collect-stdev-updates
  "collect-stdev-updates - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-stdev-updates]
    (-> this (.collectStdevUpdates collect-stdev-updates))))

(defn collect-performance-stats
  "collect-performance-stats - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-performance-stats]
    (-> this (.collectPerformanceStats collect-performance-stats))))

(defn collect-mean-gradients
  "collect-mean-gradients - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-gradients]
    (-> this (.collectMeanGradients collect-mean-gradients))))

(defn collect-garbage-collection-stats
  "collect-garbage-collection-stats - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-garbage-collection-stats]
    (-> this (.collectGarbageCollectionStats collect-garbage-collection-stats))))

(defn collect-mean-updates
  "collect-mean-updates - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-updates]
    (-> this (.collectMeanUpdates collect-mean-updates))))

(defn collect-histograms-gradients
  "collect-histograms-gradients - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-histograms-gradients]
    (-> this (.collectHistogramsGradients collect-histograms-gradients))))

(defn collect-mean-parameters
  "collect-mean-parameters - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-parameters]
    (-> this (.collectMeanParameters collect-mean-parameters))))

(defn collect-stdev-gradients
  "collect-stdev-gradients - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-stdev-gradients]
    (-> this (.collectStdevGradients collect-stdev-gradients))))

(defn collect-memory-stats
  "collect-memory-stats - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-memory-stats]
    (-> this (.collectMemoryStats collect-memory-stats))))

(defn collect-histograms-updates
  "collect-histograms-updates - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-histograms-updates]
    (-> this (.collectHistogramsUpdates collect-histograms-updates))))

(defn collect-mean-magnitudes-gradients
  "collect-mean-magnitudes-gradients - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-magnitudes-gradients]
    (-> this (.collectMeanMagnitudesGradients collect-mean-magnitudes-gradients))))

(defn build
  "returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration [^DefaultStatsUpdateConfiguration$Builder this]
    (-> this (.build))))

(defn collect-mean-activations
  "collect-mean-activations - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-activations]
    (-> this (.collectMeanActivations collect-mean-activations))))

(defn collect-mean-magnitudes-parameters
  "collect-mean-magnitudes-parameters - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-magnitudes-parameters]
    (-> this (.collectMeanMagnitudesParameters collect-mean-magnitudes-parameters))))

(defn num-histogram-bins
  "num-histogram-bins - `int`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Integer num-histogram-bins]
    (-> this (.numHistogramBins num-histogram-bins))))

(defn reporting-frequency
  "reporting-frequency - `int`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Integer reporting-frequency]
    (-> this (.reportingFrequency reporting-frequency))))

(defn collect-histograms-activations
  "is-collect-histograms-activations - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean is-collect-histograms-activations]
    (-> this (.collectHistogramsActivations is-collect-histograms-activations))))

(defn collect-learning-rates
  "collect-learning-rates - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-learning-rates]
    (-> this (.collectLearningRates collect-learning-rates))))

(defn collect-mean-magnitudes-activations
  "collect-mean-magnitudes-activations - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-magnitudes-activations]
    (-> this (.collectMeanMagnitudesActivations collect-mean-magnitudes-activations))))

(defn collect-stdev-parameters
  "collect-stdev-parameters - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-stdev-parameters]
    (-> this (.collectStdevParameters collect-stdev-parameters))))

(defn collect-stdev-activations
  "collect-stdev-activations - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-stdev-activations]
    (-> this (.collectStdevActivations collect-stdev-activations))))

(defn collect-mean-magnitudes-updates
  "collect-mean-magnitudes-updates - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-mean-magnitudes-updates]
    (-> this (.collectMeanMagnitudesUpdates collect-mean-magnitudes-updates))))

(defn collect-histograms-parameters
  "collect-histograms-parameters - `boolean`

  returns: `org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder`"
  (^org.deeplearning4j.ui.stats.impl.DefaultStatsUpdateConfiguration$Builder [^DefaultStatsUpdateConfiguration$Builder this ^Boolean collect-histograms-parameters]
    (-> this (.collectHistogramsParameters collect-histograms-parameters))))

