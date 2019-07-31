(ns org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoEncoder$SwEnvironmentInfoEncoder]))

(defn ->sw-environment-info-encoder
  "Constructor."
  (^StaticInfoEncoder$SwEnvironmentInfoEncoder []
    (new StaticInfoEncoder$SwEnvironmentInfoEncoder )))

(defn *env-value-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envValueHeaderLength )))

(defn *env-key-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envKeyCharacterEncoding )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/sbeBlockLength )))

(defn *env-value-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envValueCharacterEncoding )))

(defn *env-key-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envKeyId )))

(defn *env-value-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envValueMetaAttribute meta-attribute)))

(defn *env-key-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envKeyHeaderLength )))

(defn *env-key-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envKeyMetaAttribute meta-attribute)))

(defn *env-value-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/envValueId )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$SwEnvironmentInfoEncoder/sbeHeaderSize )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^StaticInfoEncoder$SwEnvironmentInfoEncoder this ^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder [^StaticInfoEncoder$SwEnvironmentInfoEncoder this]
    (-> this (.next))))

(defn put-env-key
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder [^StaticInfoEncoder$SwEnvironmentInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putEnvKey src src-offset length))))

(defn env-key
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder [^StaticInfoEncoder$SwEnvironmentInfoEncoder this ^java.lang.String value]
    (-> this (.envKey value))))

(defn put-env-value
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder [^StaticInfoEncoder$SwEnvironmentInfoEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putEnvValue src src-offset length))))

(defn env-value
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$SwEnvironmentInfoEncoder [^StaticInfoEncoder$SwEnvironmentInfoEncoder this ^java.lang.String value]
    (-> this (.envValue value))))

