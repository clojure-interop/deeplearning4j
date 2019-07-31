(ns org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoEncoder$HwDeviceInfoGroupEncoder]))

(defn ->hw-device-info-group-encoder
  "Constructor."
  (^StaticInfoEncoder$HwDeviceInfoGroupEncoder []
    (new StaticInfoEncoder$HwDeviceInfoGroupEncoder )))

(defn *device-description-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/deviceDescriptionId )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/sbeBlockLength )))

(defn *device-memory-max-max-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/deviceMemoryMaxMaxValue )))

(defn *device-memory-max-null-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/deviceMemoryMaxNullValue )))

(defn *device-description-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/deviceDescriptionCharacterEncoding )))

(defn *device-memory-max-min-value
  "returns: `long`"
  (^Long []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/deviceMemoryMaxMinValue )))

(defn *device-description-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/deviceDescriptionHeaderLength )))

(defn *device-description-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/deviceDescriptionMetaAttribute meta-attribute)))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$HwDeviceInfoGroupEncoder/sbeHeaderSize )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^StaticInfoEncoder$HwDeviceInfoGroupEncoder this ^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder [^StaticInfoEncoder$HwDeviceInfoGroupEncoder this]
    (-> this (.next))))

(defn device-memory-max
  "value - `long`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder [^StaticInfoEncoder$HwDeviceInfoGroupEncoder this ^Long value]
    (-> this (.deviceMemoryMax value))))

(defn put-device-description
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder [^StaticInfoEncoder$HwDeviceInfoGroupEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putDeviceDescription src src-offset length))))

(defn device-description
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$HwDeviceInfoGroupEncoder [^StaticInfoEncoder$HwDeviceInfoGroupEncoder this ^java.lang.String value]
    (-> this (.deviceDescription value))))

