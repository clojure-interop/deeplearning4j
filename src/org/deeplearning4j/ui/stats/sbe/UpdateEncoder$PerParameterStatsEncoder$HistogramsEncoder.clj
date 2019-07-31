(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder]))

(defn ->histograms-encoder
  "Constructor."
  (^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder []
    (new UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder )))

(defn *n-bins-min-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/nBinsMinValue )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/sbeBlockLength )))

(defn *max-value-null-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/maxValueNullValue )))

(defn *max-value-max-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/maxValueMaxValue )))

(defn *n-bins-max-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/nBinsMaxValue )))

(defn *max-value-min-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/maxValueMinValue )))

(defn *histogram-counts-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/histogramCountsId )))

(defn *min-value-min-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/minValueMinValue )))

(defn *n-bins-null-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/nBinsNullValue )))

(defn *min-value-max-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/minValueMaxValue )))

(defn *min-value-null-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/minValueNullValue )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder/sbeHeaderSize )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder this]
    (-> this (.next))))

(defn stat-type
  "value - `org.deeplearning4j.ui.stats.sbe.StatsType`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder this ^org.deeplearning4j.ui.stats.sbe.StatsType value]
    (-> this (.statType value))))

(defn min-value
  "value - `double`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder this ^Double value]
    (-> this (.minValue value))))

(defn max-value
  "value - `double`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder this ^Double value]
    (-> this (.maxValue value))))

(defn n-bins
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder this ^Integer value]
    (-> this (.nBins value))))

(defn histogram-counts-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder$HistogramCountsEncoder [^UpdateEncoder$PerParameterStatsEncoder$HistogramsEncoder this ^Integer count]
    (-> this (.histogramCountsCount count))))

