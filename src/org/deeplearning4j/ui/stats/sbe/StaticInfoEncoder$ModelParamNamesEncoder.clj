(ns org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StaticInfoEncoder$ModelParamNamesEncoder]))

(defn ->model-param-names-encoder
  "Constructor."
  (^StaticInfoEncoder$ModelParamNamesEncoder []
    (new StaticInfoEncoder$ModelParamNamesEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$ModelParamNamesEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$ModelParamNamesEncoder/sbeBlockLength )))

(defn *model-param-names-id
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$ModelParamNamesEncoder/modelParamNamesId )))

(defn *model-param-names-character-encoding
  "returns: `java.lang.String`"
  (^java.lang.String []
    (StaticInfoEncoder$ModelParamNamesEncoder/modelParamNamesCharacterEncoding )))

(defn *model-param-names-meta-attribute
  "meta-attribute - `org.deeplearning4j.ui.stats.sbe.MetaAttribute`

  returns: `java.lang.String`"
  (^java.lang.String [^org.deeplearning4j.ui.stats.sbe.MetaAttribute meta-attribute]
    (StaticInfoEncoder$ModelParamNamesEncoder/modelParamNamesMetaAttribute meta-attribute)))

(defn *model-param-names-header-length
  "returns: `int`"
  (^Integer []
    (StaticInfoEncoder$ModelParamNamesEncoder/modelParamNamesHeaderLength )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^StaticInfoEncoder$ModelParamNamesEncoder this ^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder [^StaticInfoEncoder$ModelParamNamesEncoder this]
    (-> this (.next))))

(defn put-model-param-names
  "src - `org.agrona.DirectBuffer`
  src-offset - `int`
  length - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder [^StaticInfoEncoder$ModelParamNamesEncoder this ^org.agrona.DirectBuffer src ^Integer src-offset ^Integer length]
    (-> this (.putModelParamNames src src-offset length))))

(defn model-param-names
  "value - `java.lang.String`

  returns: `org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StaticInfoEncoder$ModelParamNamesEncoder [^StaticInfoEncoder$ModelParamNamesEncoder this ^java.lang.String value]
    (-> this (.modelParamNames value))))

