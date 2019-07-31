(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$GcStatsDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$GcStatsDecoder]))

(defn ->gc-stats-decoder
  "Constructor."
  (^UpdateDecoder$GcStatsDecoder []
    (new UpdateDecoder$GcStatsDecoder )))

(defn *delta-gc-count-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$GcStatsDecoder/deltaGCCountMetaAttribute meta-attribute)))

(defn *delta-gc-count-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCCountId )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/sbeBlockLength )))

(defn *delta-gc-count-null-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCCountNullValue )))

(defn *delta-gc-time-ms-min-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCTimeMsMinValue )))

(defn *gc-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/gcNameHeaderLength )))

(defn *delta-gc-time-ms-null-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCTimeMsNullValue )))

(defn *delta-gc-count-min-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCCountMinValue )))

(defn *gc-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateDecoder$GcStatsDecoder/gcNameCharacterEncoding )))

(defn *delta-gc-count-max-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCCountMaxValue )))

(defn *gc-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$GcStatsDecoder/gcNameMetaAttribute meta-attribute)))

(defn *gc-name-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/gcNameId )))

(defn *delta-gc-time-ms-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCTimeMsId )))

(defn *delta-gc-time-ms-max-value
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/deltaGCTimeMsMaxValue )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$GcStatsDecoder/sbeHeaderSize )))

(defn *delta-gc-time-ms-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$GcStatsDecoder/deltaGCTimeMsMetaAttribute meta-attribute)))

(defn delta-gc-count
  "returns: `int`"
  (^Integer [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.deltaGCCount))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$GcStatsDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$GcStatsDecoder [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.next))))

(defn gc-name-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.gcNameLength))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$GcStatsDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn delta-gc-time-ms
  "returns: `int`"
  (^Integer [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.deltaGCTimeMs))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$GcStatsDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$GcStatsDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$GcStatsDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.actingBlockLength))))

(defn get-gc-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^UpdateDecoder$GcStatsDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getGcName dst dst-offset length))))

(defn gc-name
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$GcStatsDecoder this]
    (-> this (.gcName))))

