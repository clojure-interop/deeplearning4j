(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$LayerNamesDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$LayerNamesDecoder]))

(defn ->layer-names-decoder
  "Constructor."
  (^UpdateDecoder$LayerNamesDecoder []
    (new UpdateDecoder$LayerNamesDecoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$LayerNamesDecoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$LayerNamesDecoder/sbeBlockLength )))

(defn *layer-name-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$LayerNamesDecoder/layerNameId )))

(defn *layer-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateDecoder$LayerNamesDecoder/layerNameCharacterEncoding )))

(defn *layer-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$LayerNamesDecoder/layerNameMetaAttribute meta-attribute)))

(defn *layer-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$LayerNamesDecoder/layerNameHeaderLength )))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$LayerNamesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$LayerNamesDecoder [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$LayerNamesDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$LayerNamesDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$LayerNamesDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn get-layer-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^UpdateDecoder$LayerNamesDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getLayerName dst dst-offset length))))

(defn layer-name-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.layerNameLength))))

(defn remove
  ""
  ([^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.actingBlockLength))))

(defn layer-name
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$LayerNamesDecoder this]
    (-> this (.layerName))))

