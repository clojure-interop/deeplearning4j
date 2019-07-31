(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder]))

(defn ->histogram-counts-encoder
  "Constructor."
  (^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder []
    (new UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder/sbeBlockLength )))

(defn *bin-count-null-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder/binCountNullValue )))

(defn *bin-count-min-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder/binCountMinValue )))

(defn *bin-count-max-value
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder/binCountMaxValue )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder this]
    (-> this (.next))))

(defn bin-count
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder this ^Long value]
    (-> this (.binCount value))))

