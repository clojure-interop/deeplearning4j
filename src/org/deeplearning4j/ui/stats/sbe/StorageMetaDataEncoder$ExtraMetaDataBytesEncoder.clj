(ns org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder$ExtraMetaDataBytesEncoder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats.sbe StorageMetaDataEncoder$ExtraMetaDataBytesEncoder]))

(defn ->extra-meta-data-bytes-encoder
  "Constructor."
  (^StorageMetaDataEncoder$ExtraMetaDataBytesEncoder []
    (new StorageMetaDataEncoder$ExtraMetaDataBytesEncoder )))

(defn *sbe-header-size
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder$ExtraMetaDataBytesEncoder/sbeHeaderSize )))

(defn *sbe-block-length
  "returns: `int`"
  (^Integer []
    (StorageMetaDataEncoder$ExtraMetaDataBytesEncoder/sbeBlockLength )))

(defn *bytes-null-value
  "returns: `byte`"
  (^Byte []
    (StorageMetaDataEncoder$ExtraMetaDataBytesEncoder/bytesNullValue )))

(defn *bytes-min-value
  "returns: `byte`"
  (^Byte []
    (StorageMetaDataEncoder$ExtraMetaDataBytesEncoder/bytesMinValue )))

(defn *bytes-max-value
  "returns: `byte`"
  (^Byte []
    (StorageMetaDataEncoder$ExtraMetaDataBytesEncoder/bytesMaxValue )))

(defn wrap
  "parent-message - `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder`
  buffer - `org.agrona.MutableDirectBuffer`
  count - `int`"
  ([^StorageMetaDataEncoder$ExtraMetaDataBytesEncoder this ^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder parent-message ^org.agrona.MutableDirectBuffer buffer ^Integer count]
    (-> this (.wrap parent-message buffer count))))

(defn next
  "returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder$ExtraMetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder$ExtraMetaDataBytesEncoder [^StorageMetaDataEncoder$ExtraMetaDataBytesEncoder this]
    (-> this (.next))))

(defn bytes
  "value - `byte`

  returns: `org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder$ExtraMetaDataBytesEncoder`"
  (^org.deeplearning4j.ui.stats.sbe.StorageMetaDataEncoder$ExtraMetaDataBytesEncoder [^StorageMetaDataEncoder$ExtraMetaDataBytesEncoder this ^Byte value]
    (-> this (.bytes value))))

