(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$ParamNamesEncoder]))

(defn ->param-names-encoder
  "Constructor."
  (^UpdateEncoder$ParamNamesEncoder []
    (new UpdateEncoder$ParamNamesEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$ParamNamesEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$ParamNamesEncoder/sbeBlockLength )))

(defn *param-name-id
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$ParamNamesEncoder/paramNameId )))

(defn *param-name-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (UpdateEncoder$ParamNamesEncoder/paramNameCharacterEncoding )))

(defn *param-name-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (UpdateEncoder$ParamNamesEncoder/paramNameMetaAttribute meta-attribute)))

(defn *param-name-header-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$ParamNamesEncoder/paramNameHeaderLength )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$ParamNamesEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder [^UpdateEncoder$ParamNamesEncoder this]
    (-> this (.next))))

(defn put-param-name
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder [^UpdateEncoder$ParamNamesEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putParamName src src-offset length))))

(defn param-name
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$ParamNamesEncoder [^UpdateEncoder$ParamNamesEncoder this ^java.lang.String value]
    (-> this (.paramName value))))

