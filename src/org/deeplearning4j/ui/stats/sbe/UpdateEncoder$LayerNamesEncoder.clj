(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$LayerNamesEncoder]))

(defn ->layer-names-encoder
  "Constructor."
  (^UpdateEncoder$LayerNamesEncoder []
    (new UpdateEncoder$LayerNamesEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$LayerNamesEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$LayerNamesEncoder/sbeBlockLength )))

(defn *layer-name-id
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$LayerNamesEncoder/layerNameId )))

(defn *layer-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateEncoder$LayerNamesEncoder/layerNameCharacterEncoding )))

(defn *layer-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateEncoder$LayerNamesEncoder/layerNameMetaAttribute meta-attribute)))

(defn *layer-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$LayerNamesEncoder/layerNameHeaderLength )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$LayerNamesEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder [^UpdateEncoder$LayerNamesEncoder this]
    (-> this (.next))))

(defn put-layer-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder [^UpdateEncoder$LayerNamesEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putLayerName src src-offset length))))

(defn layer-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$LayerNamesEncoder [^UpdateEncoder$LayerNamesEncoder this ^java.lang.String value]
    (-> this (.layerName value))))

