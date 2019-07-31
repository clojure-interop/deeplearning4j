(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder]))

(defn ->summary-stat-decoder
  "Constructor."
  (^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder []
    (new UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/sbeBlockLength )))

(defn *value-null-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/valueNullValue )))

(defn *summary-type-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/summaryTypeId )))

(defn *value-max-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/valueMaxValue )))

(defn *value-min-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/valueMinValue )))

(defn *stat-type-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/statTypeId )))

(defn *value-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/valueId )))

(defn *value-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/valueMetaAttribute meta-attribute)))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/sbeHeaderSize )))

(defn *stat-type-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/statTypeMetaAttribute meta-attribute)))

(defn *summary-type-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder/summaryTypeMetaAttribute meta-attribute)))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn value
  "returns: `double`"
  (^Double [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.value))))

(defn remove
  ""
  ([^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.actingBlockLength))))

(defn summary-type
  "returns: `org.deeplearning4j.ui.stats.sbe.SummaryType`"
  (^org.deeplearning4j.ui.stats.sbe.SummaryType [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.summaryType))))

(defn stat-type
  "returns: `org.deeplearning4j.ui.stats.sbe.StatsType`"
  (^org.deeplearning4j.ui.stats.sbe.StatsType [^UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder this]
    (-> this (.statType))))

