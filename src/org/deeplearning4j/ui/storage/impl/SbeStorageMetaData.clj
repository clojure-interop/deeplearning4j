(ns org.deeplearning4j.ui.storage.impl.SbeStorageMetaData
  "SbeStorageMetaData: stores information about a given session: for example, the types of the static and update information."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage.impl SbeStorageMetaData]))

(defn ->sbe-storage-meta-data
  "Constructor.

  time-stamp - `long`
  session-id - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - `java.lang.String`
  init-type-class - `java.lang.String`
  update-type-class - `java.lang.String`
  extra-meta-data - `java.io.Serializable`"
  (^SbeStorageMetaData [^Long time-stamp ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^java.lang.String init-type-class ^java.lang.String update-type-class ^java.io.Serializable extra-meta-data]
    (new SbeStorageMetaData time-stamp session-id type-id worker-id init-type-class update-type-class extra-meta-data))
  (^SbeStorageMetaData [^Long time-stamp ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^java.lang.Class init-type ^java.lang.Class update-type]
    (new SbeStorageMetaData time-stamp session-id type-id worker-id init-type update-type))
  (^SbeStorageMetaData []
    (new SbeStorageMetaData )))

(defn get-extra-meta-data
  "Description copied from interface: StorageMetaData

  returns: `java.io.Serializable`"
  (^java.io.Serializable [^SbeStorageMetaData this]
    (-> this (.getExtraMetaData))))

(defn encoding-length-bytes
  "Description copied from interface: Persistable

  returns: `int`"
  (^Integer [^SbeStorageMetaData this]
    (-> this (.encodingLengthBytes))))

(defn encode
  "Description copied from interface: Persistable

  buffer - `java.nio.ByteBuffer`"
  ([^SbeStorageMetaData this ^java.nio.ByteBuffer buffer]
    (-> this (.encode buffer)))
  ([^SbeStorageMetaData this]
    (-> this (.encode))))

(defn decode
  "Description copied from interface: Persistable

  decode - `byte[]`"
  ([^SbeStorageMetaData this decode]
    (-> this (.decode decode))))

