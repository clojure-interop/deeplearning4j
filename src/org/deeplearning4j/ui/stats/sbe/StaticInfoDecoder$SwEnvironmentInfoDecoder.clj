(ns org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$SwEnvironmentInfoDecoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoDecoder$SwEnvironmentInfoDecoder]))

(defn ->sw-environment-info-decoder
  "Constructor."
  (^StaticInfoDecoder$SwEnvironmentInfoDecoder []
    (new StaticInfoDecoder$SwEnvironmentInfoDecoder )))

(defn *env-value-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envValueHeaderLength )))

(defn *env-key-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envKeyCharacterEncoding )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/sbeBlockLength )))

(defn *env-value-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envValueCharacterEncoding )))

(defn *env-key-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envKeyId )))

(defn *env-value-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envValueMetaAttribute meta-attribute)))

(defn *env-key-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envKeyHeaderLength )))

(defn *env-key-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envKeyMetaAttribute meta-attribute)))

(defn *env-value-id
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/envValueId )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StaticInfoDecoder$SwEnvironmentInfoDecoder/sbeHeaderSize )))

(defn get-env-key
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder$SwEnvironmentInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getEnvKey dst dst-offset length))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$SwEnvironmentInfoDecoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$SwEnvironmentInfoDecoder [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.next))))

(defn append-to
  "builder - `java.lang.StringBuilder`

  returns: `java.lang.StringBuilder`"
  (^java.lang.StringBuilder [^StaticInfoDecoder$SwEnvironmentInfoDecoder this ^java.lang.StringBuilder builder]
    (-> this (.appendTo builder))))

(defn env-value-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.envValueLength))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.toString))))

(defn count
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.count))))

(defn iterator
  "returns: `java.util.Iterator<org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder$SwEnvironmentInfoDecoder>`"
  (^java.util.Iterator [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.iterator))))

(defn get-env-value
  "dst - `org.agrona.MutableDirectBuffer`
  dst-offset - `int`
  length - `int`

  returns: `int`"
  (^Integer [^StaticInfoDecoder$SwEnvironmentInfoDecoder this ^org.agrona.MutableDirectBuffer dst ^Integer dst-offset ^Integer length]
    (-> this (.getEnvValue dst dst-offset length))))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder`
  buffer - `org.agrona.DirectBuffer`"
  ([^StaticInfoDecoder$SwEnvironmentInfoDecoder this ^org.deeplearning4j.ui.stats.sbe.StaticInfoDecoder parent-message ^org.agrona.DirectBuffer buffer]
    (-> this (.wrap parent-message buffer))))

(defn remove
  ""
  ([^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.remove))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.hasNext))))

(defn acting-block-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.actingBlockLength))))

(defn env-key-length
  "returns: `int`"
  (^Integer [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.envKeyLength))))

(defn env-value
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.envValue))))

(defn env-key
  "returns: `java.lang.String`"
  (^java.lang.String [^StaticInfoDecoder$SwEnvironmentInfoDecoder this]
    (-> this (.envKey))))

