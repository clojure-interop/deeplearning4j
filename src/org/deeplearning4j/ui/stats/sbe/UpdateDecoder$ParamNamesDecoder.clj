(ns org.deeplearning4j.ui.stats.sbe.UpdateDecoder$ParamNamesDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateDecoder$ParamNamesDecoder]))

(defn ->param-names-decoder
  "Constructor."
  (^UpdateDecoder$ParamNamesDecoder []
    (new UpdateDecoder$ParamNamesDecoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$ParamNamesDecoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$ParamNamesDecoder/sbeBlockLength )))

(defn *param-name-id
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$ParamNamesDecoder/paramNameId )))

(defn *param-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateDecoder$ParamNamesDecoder/paramNameCharacterEncoding )))

(defn *param-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateDecoder$ParamNamesDecoder/paramNameMetaAttribute meta-attribute)))

(defn *param-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateDecoder$ParamNamesDecoder/paramNameHeaderLength )))

(defn param-name
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.paramName))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateDecoder$ParamNamesDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateDecoder$ParamNamesDecoder [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^UpdateDecoder$ParamNamesDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.UpdateDecoder$ParamNamesDecoder>`"
  (^java.util.Iterator [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.iterator))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^UpdateDecoder$ParamNamesDecoder this ^org.deeplearning4j.ui.stats.sbe.UpdateDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.actingBlockLength))))

(defn get-param-name
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^UpdateDecoder$ParamNamesDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getParamName dst dst-offset length))))

(defn param-name-length
  "returns: `int`"
  (^Integer [^UpdateDecoder$ParamNamesDecoder this]
    (-> this (.paramNameLength))))

