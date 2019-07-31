(ns org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder]))

(defn ->meta-data-bytes-encoder
  "Constructor."
  (^UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder []
    (new UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder/sbeBlockLength )))

(defn *bytes-null-value
  "returns: `byte`"
  (^Byte []
    (UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder/bytesNullValue )))

(defn *bytes-min-value
  "returns: `byte`"
  (^Byte []
    (UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder/bytesMinValue )))

(defn *bytes-max-value
  "returns: `byte`"
  (^Byte []
    (UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder/bytesMaxValue )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.UpdateEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder this ^org.deeplearning4j.ui.stats.sbe.UpdateEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder [^UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder this]
    (-> this (.next))))

(defn bytes
  "value - `byte`

  returns: `org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder [^UpdateEncoder$DataSetMetaDataBytesEncoder$MetaDataBytesEncoder this ^Byte value]
    (-> this (.bytes value))))

