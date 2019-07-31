(ns org.deeplearning4j.api.storage.StatsStorageRouter
  "StatsStorageRouter is intended to route static info, metadata and updates somewhere - generally to a
 StatsStorage implementation. For example, a StatsStorageRouter might serialize and send objects over a network."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StatsStorageRouter]))

(defn put-storage-meta-data
  "Method to store some additional metadata for each session. Idea: record the classes used to
  serialize and deserialize the static info and updates (as a class name).
  This is mainly used for debugging and validation.

  storage-meta-data - Storage metadata to store - `org.deeplearning4j.api.storage.StorageMetaData`"
  ([^StatsStorageRouter this ^org.deeplearning4j.api.storage.StorageMetaData storage-meta-data]
    (-> this (.putStorageMetaData storage-meta-data))))

(defn put-static-info
  "Static info: reported once per session, upon initialization

  static-info - Static info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^StatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable static-info]
    (-> this (.putStaticInfo static-info))))

(defn put-update
  "Updates: stored multiple times per session (periodically, for example)

  update - Update info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^StatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable update]
    (-> this (.putUpdate update))))

