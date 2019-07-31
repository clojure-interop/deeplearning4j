(ns org.deeplearning4j.ui.storage.impl.JavaStorageMetaData
  "Created by Alex on 14/12/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage.impl JavaStorageMetaData]))

(defn ->java-storage-meta-data
  "Constructor.

  time-stamp - `long`
  session-id - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - `java.lang.String`
  init-type-class - `java.lang.String`
  update-type-class - `java.lang.String`
  extra-meta-data - `java.io.Serializable`"
  (^JavaStorageMetaData [^Long time-stamp ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^java.lang.String init-type-class ^java.lang.String update-type-class ^java.io.Serializable extra-meta-data]
    (new JavaStorageMetaData time-stamp session-id type-id worker-id init-type-class update-type-class extra-meta-data))
  (^JavaStorageMetaData [^Long time-stamp ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^java.lang.Class init-type ^java.lang.Class update-type]
    (new JavaStorageMetaData time-stamp session-id type-id worker-id init-type update-type))
  (^JavaStorageMetaData []
    (new JavaStorageMetaData )))

(defn encoding-length-bytes
  "Description copied from interface: Persistable

  returns: `int`"
  (^Integer [^JavaStorageMetaData this]
    (-> this (.encodingLengthBytes))))

(defn encode
  "Description copied from interface: Persistable

  buffer - `java.nio.ByteBuffer`"
  ([^JavaStorageMetaData this ^java.nio.ByteBuffer buffer]
    (-> this (.encode buffer)))
  ([^JavaStorageMetaData this]
    (-> this (.encode))))

(defn decode
  "Description copied from interface: Persistable

  decode - `byte[]`"
  ([^JavaStorageMetaData this decode]
    (-> this (.decode decode))))

(defn get-extra-meta-data
  "Description copied from interface: StorageMetaData

  returns: `java.io.Serializable`"
  (^java.io.Serializable [^JavaStorageMetaData this]
    (-> this (.getExtraMetaData))))

