(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder]))

(defn ->histogram-counts-decoder
  "Constructor."
  (^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder []
    (new UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder/sbeBlockLength )))

(defn *bin-count-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder/binCountId )))

(defn *bin-count-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder/binCountMetaAttribute meta-attribute)))

(defn *bin-count-null-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder/binCountNullValue )))

(defn *bin-count-min-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder/binCountMinValue )))

(defn *bin-count-max-value
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder/binCountMaxValue )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.actingBlockLength))))

(defn bin-count
  "returns: `long`"
  (^Long [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder this]
    (-> this (.binCount))))

