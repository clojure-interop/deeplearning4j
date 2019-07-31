(ns org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$HwDeviceInfoGroupDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoDecoder$HwDeviceInfoGroupDecoder]))

(defn ->hw-device-info-group-decoder
  "Constructor."
  (^StaticInfoDecoder$HwDeviceInfoGroupDecoder []
    (new StaticInfoDecoder$HwDeviceInfoGroupDecoder )))

(defn *device-description-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceDescriptionId )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/sbeBlockLength )))

(defn *device-memory-max-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceMemoryMaxMaxValue )))

(defn *device-memory-max-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceMemoryMaxId )))

(defn *device-memory-max-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceMemoryMaxNullValue )))

(defn *device-description-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceDescriptionCharacterEncoding )))

(defn *device-memory-max-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceMemoryMaxMinValue )))

(defn *device-memory-max-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceMemoryMaxMetaAttribute meta-attribute)))

(defn *device-description-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceDescriptionHeaderLength )))

(defn *device-description-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/deviceDescriptionMetaAttribute meta-attribute)))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$HwDeviceInfoGroupDecoder/sbeHeaderSize )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$HwDeviceInfoGroupDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$HwDeviceInfoGroupDecoder [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn device-memory-max
  "returns: `long`"
  (^Long [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.deviceMemoryMax))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$HwDeviceInfoGroupDecoder>`"
  (^java.util.Iterator [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^StaticInfoDecoder$HwDeviceInfoGroupDecoder this ^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn device-description
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.deviceDescription))))

(defn remove
  ""
  ([^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.actingBlockLength))))

(defn get-device-description
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getDeviceDescription dst dst-offset length))))

(defn device-description-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$HwDeviceInfoGroupDecoder this]
    (-> this (.deviceDescriptionLength))))

