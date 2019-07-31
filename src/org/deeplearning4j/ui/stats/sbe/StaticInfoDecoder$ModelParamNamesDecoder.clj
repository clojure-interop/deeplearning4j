(ns org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$ModelParamNamesDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoDecoder$ModelParamNamesDecoder]))

(defn ->model-param-names-decoder
  "Constructor."
  (^StaticInfoDecoder$ModelParamNamesDecoder []
    (new StaticInfoDecoder$ModelParamNamesDecoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$ModelParamNamesDecoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$ModelParamNamesDecoder/sbeBlockLength )))

(defn *model-param-names-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$ModelParamNamesDecoder/modelParamNamesId )))

(defn *model-param-names-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder$ModelParamNamesDecoder/modelParamNamesCharacterEncoding )))

(defn *model-param-names-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder$ModelParamNamesDecoder/modelParamNamesMetaAttribute meta-attribute)))

(defn *model-param-names-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$ModelParamNamesDecoder/modelParamNamesHeaderLength )))

(defn model-param-names
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.modelParamNames))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$ModelParamNamesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$ModelParamNamesDecoder [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StaticInfoDecoder$ModelParamNamesDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.toString))))

(defn get-model-param-names
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder$ModelParamNamesDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getModelParamNames dst dst-offset length))))

(defn count
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$ModelParamNamesDecoder>`"
  (^java.util.Iterator [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^StaticInfoDecoder$ModelParamNamesDecoder this ^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.actingBlockLength))))

(defn model-param-names-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$ModelParamNamesDecoder this]
    (-> this (.modelParamNamesLength))))

