(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder]))

(defn ->meta-data-bytes-decoder
  "Constructor."
  (^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder []
    (new UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder/sbeBlockLength )))

(defn *bytes-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder/bytesId )))

(defn *bytes-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder/bytesMetaAttribute meta-attribute)))

(defn *bytes-null-value
  "returns: `byte`"
  (^Byte []
    (UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder/bytesNullValue )))

(defn *bytes-min-value
  "returns: `byte`"
  (^Byte []
    (UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder/bytesMinValue )))

(defn *bytes-max-value
  "returns: `byte`"
  (^Byte []
    (UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder/bytesMaxValue )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.hasNext))))

(defn bytes
  "returns: `byte`"
  (^Byte [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.bytes))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder this]
    (-> this (.actingBlockLength))))

