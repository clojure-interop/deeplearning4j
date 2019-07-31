(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$DataSetMetaDataBytesDecoder]))

(defn ->data-set-meta-data-bytes-decoder
  "Constructor."
  (^UpdateDecoder$DataSetMetaDataBytesDecoder []
    (new UpdateDecoder$DataSetMetaDataBytesDecoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$DataSetMetaDataBytesDecoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$DataSetMetaDataBytesDecoder/sbeBlockLength )))

(defn *meta-data-bytes-decoder-id
  "returns: `long`"
  (^Long []
    (UpdateDecoder$DataSetMetaDataBytesDecoder/metaDataBytesDecoderId )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder [^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$DataSetMetaDataBytesDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn meta-data-bytes
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder$MetaDataBytesDecoder [^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.metaDataBytes))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$DataSetMetaDataBytesDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$DataSetMetaDataBytesDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$DataSetMetaDataBytesDecoder this]
    (-> this (.actingBlockLength))))

