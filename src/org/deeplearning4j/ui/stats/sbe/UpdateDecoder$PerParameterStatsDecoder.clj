(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$PerParameterStatsDecoder]))

(defn ->per-parameter-stats-decoder
  "Constructor."
  (^UpdateDecoder$PerParameterStatsDecoder []
    (new UpdateDecoder$PerParameterStatsDecoder )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder/sbeBlockLength )))

(defn *summary-stat-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerParameterStatsDecoder/summaryStatDecoderId )))

(defn *learning-rate-max-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerParameterStatsDecoder/learningRateMaxValue )))

(defn *learning-rate-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder/learningRateId )))

(defn *learning-rate-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder/learningRateMetaAttribute meta-attribute)))

(defn *histograms-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerParameterStatsDecoder/histogramsDecoderId )))

(defn *learning-rate-null-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerParameterStatsDecoder/learningRateNullValue )))

(defn *learning-rate-min-value
  "returns: `float`"
  (^Float []
    (UpdateDecoder$PerParameterStatsDecoder/learningRateMinValue )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder/sbeHeaderSize )))

(defn learning-rate
  "returns: `float`"
  (^Float [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.learningRate))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$PerParameterStatsDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$PerParameterStatsDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.remove))))

(defn summary-stat
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$SummaryStatDecoder [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.summaryStat))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.hasNext))))

(defn histograms
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.histograms))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder this]
    (-> this (.actingBlockLength))))

