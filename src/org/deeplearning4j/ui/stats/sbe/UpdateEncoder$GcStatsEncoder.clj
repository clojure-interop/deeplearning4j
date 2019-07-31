(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$GcStatsEncoder]))

(defn ->gc-stats-encoder
  "Constructor."
  (^UpdateEncoder$GcStatsEncoder []
    (new UpdateEncoder$GcStatsEncoder )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/sbeBlockLength )))

(defn *delta-gc-count-null-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/deltaGCCountNullValue )))

(defn *delta-gc-time-ms-min-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/deltaGCTimeMsMinValue )))

(defn *gc-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/gcNameHeaderLength )))

(defn *delta-gc-time-ms-null-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/deltaGCTimeMsNullValue )))

(defn *delta-gc-count-min-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/deltaGCCountMinValue )))

(defn *gc-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateEncoder$GcStatsEncoder/gcNameCharacterEncoding )))

(defn *delta-gc-count-max-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/deltaGCCountMaxValue )))

(defn *gc-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateEncoder$GcStatsEncoder/gcNameMetaAttribute meta-attribute)))

(defn *gc-name-id
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/gcNameId )))

(defn *delta-gc-time-ms-max-value
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/deltaGCTimeMsMaxValue )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$GcStatsEncoder/sbeHeaderSize )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$GcStatsEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder [^UpdateEncoder$GcStatsEncoder this]
    (-> this (.next))))

(defn delta-gc-count
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder [^UpdateEncoder$GcStatsEncoder this ^Integer value]
    (-> this (.deltaGCCount value))))

(defn delta-gc-time-ms
  "value - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder [^UpdateEncoder$GcStatsEncoder this ^Integer value]
    (-> this (.deltaGCTimeMs value))))

(defn put-gc-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder [^UpdateEncoder$GcStatsEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putGcName src src-offset length))))

(defn gc-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$GcStatsEncoder [^UpdateEncoder$GcStatsEncoder this ^java.lang.String value]
    (-> this (.gcName value))))

