(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$DataSetMetaDataBytesEncoder]))

(defn ->data-set-meta-data-bytes-encoder
  "Constructor."
  (^UpdateEncoder$DataSetMetaDataBytesEncoder []
    (new UpdateEncoder$DataSetMetaDataBytesEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$DataSetMetaDataBytesEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$DataSetMetaDataBytesEncoder/sbeBlockLength )))

(defn *meta-data-bytes-id
  "returns: `long`"
  (^Long []
    (UpdateEncoder$DataSetMetaDataBytesEncoder/metaDataBytesId )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$DataSetMetaDataBytesEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder [^UpdateEncoder$DataSetMetaDataBytesEncoder this]
    (-> this (.next))))

(defn meta-data-bytes-count
  "count - `int`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder [^UpdateEncoder$DataSetMetaDataBytesEncoder this ^Integer count]
    (-> this (.metaDataBytesCount count))))

