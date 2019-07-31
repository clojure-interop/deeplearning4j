(ns org.deeplearning4j.api.storage.StorageMetaData
  "StorageMetaData: contains metadata (such at types, and arbitrary custom serializable data) for storage"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StorageMetaData]))

(defn get-time-stamp
  "Timestamp for the metadata

  returns: `long`"
  (^Long [^StorageMetaData this]
    (-> this (.getTimeStamp))))

(defn get-session-id
  "Session ID for the metadata

  returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaData this]
    (-> this (.getSessionID))))

(defn get-type-id
  "Type ID for the metadata

  returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaData this]
    (-> this (.getTypeID))))

(defn get-worker-id
  "Worker ID for the metadata

  returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaData this]
    (-> this (.getWorkerID))))

(defn get-init-type-class
  "Full class name for the initialization information that will be posted. Is expected to implement Persistable.

  returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaData this]
    (-> this (.getInitTypeClass))))

(defn get-update-type-class
  "Full class name for the update information that will be posted. Is expected to implement Persistable.

  returns: `java.lang.String`"
  (^java.lang.String [^StorageMetaData this]
    (-> this (.getUpdateTypeClass))))

(defn get-extra-meta-data
  "Get extra metadata, if any

  returns: `java.io.Serializable`"
  (^java.io.Serializable [^StorageMetaData this]
    (-> this (.getExtraMetaData))))

