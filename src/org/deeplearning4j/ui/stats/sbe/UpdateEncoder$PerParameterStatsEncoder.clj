(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$PerParameterStatsEncoder]))

(defn ->per-parameter-stats-encoder
  "Constructor."
  (^UpdateEncoder$PerParameterStatsEncoder []
    (new UpdateEncoder$PerParameterStatsEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder/sbeBlockLength )))

(defn *learning-rate-null-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerParameterStatsEncoder/learningRateNullValue )))

(defn *learning-rate-min-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerParameterStatsEncoder/learningRateMinValue )))

(defn *learning-rate-max-value
  "returns: `float`"
  (^Float []
    (UpdateEncoder$PerParameterStatsEncoder/learningRateMaxValue )))

(defn *summary-stat-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerParameterStatsEncoder/summaryStatId )))

(defn *histograms-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerParameterStatsEncoder/histogramsId )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$PerParameterStatsEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder [^UpdateEncoder$PerParameterStatsEncoder this]
    (-> this (.next))))

(defn learning-rate
  "value - `float`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder [^UpdateEncoder$PerParameterStatsEncoder this ^Float value]
    (-> this (.learningRate value))))

(defn summary-stat-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder [^UpdateEncoder$PerParameterStatsEncoder this ^Integer count]
    (-> this (.summaryStatCount count))))

(defn histograms-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder [^UpdateEncoder$PerParameterStatsEncoder this ^Integer count]
    (-> this (.histogramsCount count))))

