(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder]))

(defn ->histograms-decoder
  "Constructor."
  (^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder []
    (new UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder )))

(defn *max-value-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/maxValueId )))

(defn *n-bins-min-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/nBinsMinValue )))

(defn *max-value-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/maxValueMetaAttribute meta-attribute)))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/sbeBlockLength )))

(defn *max-value-null-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/maxValueNullValue )))

(defn *max-value-max-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/maxValueMaxValue )))

(defn *n-bins-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/nBinsId )))

(defn *n-bins-max-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/nBinsMaxValue )))

(defn *max-value-min-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/maxValueMinValue )))

(defn *histogram-counts-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/histogramCountsDecoderId )))

(defn *min-value-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/minValueMetaAttribute meta-attribute)))

(defn *min-value-min-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/minValueMinValue )))

(defn *n-bins-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/nBinsMetaAttribute meta-attribute)))

(defn *n-bins-null-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/nBinsNullValue )))

(defn *min-value-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/minValueId )))

(defn *min-value-max-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/minValueMaxValue )))

(defn *min-value-null-value
  "returns: `double`"
  (^Double []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/minValueNullValue )))

(defn *stat-type-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/statTypeId )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/sbeHeaderSize )))

(defn *stat-type-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder/statTypeMetaAttribute meta-attribute)))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn max-value
  "returns: `double`"
  (^Double [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.maxValue))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.actingBlockLength))))

(defn histogram-counts
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder$HistogramCountsDecoder [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.histogramCounts))))

(defn min-value
  "returns: `double`"
  (^Double [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.minValue))))

(defn n-bins
  "returns: `int`"
  (^Integer [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.nBins))))

(defn stat-type
  "returns: `org.deeplearning4j.ui.stats.sbe.StatsType`"
  (^org.deeplearning4j.ui.stats.sbe.StatsType [^UpdateDecoder$PerParameterStatsDecoder$HistogramsDecoder this]
    (-> this (.statType))))

