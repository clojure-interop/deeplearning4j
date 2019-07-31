(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder]))

(defn ->summary-stat-encoder
  "Constructor."
  (^UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder []
    (new UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder/sbeBlockLength )))

(defn *value-null-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder/valueNullValue )))

(defn *value-min-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder/valueMinValue )))

(defn *value-max-value
  "returns: `double`"
  (^Double []
    (UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder/valueMaxValue )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder [^UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder this]
    (-> this (.next))))

(defn stat-type
  "value - `org.deeplearning4j.ui.stats.sbe.StatsType`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder [^UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder this ^org.deeplearning4j.ui.stats.sbe.StatsType value]
    (-> this (.statType value))))

(defn summary-type
  "value - `org.deeplearning4j.ui.stats.sbe.SummaryType`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder [^UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder this ^org.deeplearning4j.ui.stats.sbe.SummaryType value]
    (-> this (.summaryType value))))

(defn value
  "value - `double`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder [^UpdateEncoder$PerParameterStatsEncoder$SummaryStatEncoder this ^Double value]
    (-> this (.value value))))

