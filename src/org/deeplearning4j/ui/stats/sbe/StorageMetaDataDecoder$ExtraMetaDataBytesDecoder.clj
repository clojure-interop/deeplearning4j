(ns org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder$ExtraMetaDataBytesDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StorageMetaDataDecoder$ExtraMetaDataBytesDecoder]))

(defn ->extra-meta-data-bytes-decoder
  "Constructor."
  (^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder []
    (new StorageMetaDataDecoder$ExtraMetaDataBytesDecoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder$ExtraMetaDataBytesDecoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder$ExtraMetaDataBytesDecoder/sbeBlockLength )))

(defn *bytes-id
  "returns: `int`"
  (^Integer []
    (StorageMetaDataDecoder$ExtraMetaDataBytesDecoder/bytesId )))

(defn *bytes-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StorageMetaDataDecoder$ExtraMetaDataBytesDecoder/bytesMetaAttribute meta-attribute)))

(defn *bytes-null-value
  "returns: `byte`"
  (^Byte []
    (StorageMetaDataDecoder$ExtraMetaDataBytesDecoder/bytesNullValue )))

(defn *bytes-min-value
  "returns: `byte`"
  (^Byte []
    (StorageMetaDataDecoder$ExtraMetaDataBytesDecoder/bytesMinValue )))

(defn *bytes-max-value
  "returns: `byte`"
  (^Byte []
    (StorageMetaDataDecoder$ExtraMetaDataBytesDecoder/bytesMaxValue )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder$ExtraMetaDataBytesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder$ExtraMetaDataBytesDecoder [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder$ExtraMetaDataBytesDecoder>`"
  (^java.util.Iterator [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this ^org.deeplearning4j.ui.stats.sbe.StorageMetaDataDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.hasNext))))

(defn bytes
  "returns: `byte`"
  (^Byte [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.bytes))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^StorageMetaDataDecoder$ExtraMetaDataBytesDecoder this]
    (-> this (.actingBlockLength))))

