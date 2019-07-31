(ns org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage
  "An implementation of the StatsStorage interface, backed by MapDB (in-memory or file).
 See also InMemoryStatsStorage and FileStatsStorage"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage.mapdb MapDBStatsStorage]))

(defn ->map-db-stats-storage
  "Constructor.

  f - `java.io.File`"
  (^MapDBStatsStorage [^java.io.File f]
    (new MapDBStatsStorage f))
  (^MapDBStatsStorage []
    (new MapDBStatsStorage )))

(defn close
  "Description copied from interface: StatsStorage"
  ([^MapDBStatsStorage this]
    (-> this (.close))))

(defn closed?
  "returns: Whether the StatsStorage implementation has been closed or not - `boolean`"
  (^Boolean [^MapDBStatsStorage this]
    (-> this (.isClosed))))

(defn put-static-info
  "Description copied from interface: StatsStorageRouter

  static-info - Static info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^MapDBStatsStorage this ^org.deeplearning4j.api.storage.Persistable static-info]
    (-> this (.putStaticInfo static-info))))

(defn put-update
  "Description copied from interface: StatsStorageRouter

  update - Update info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^MapDBStatsStorage this ^org.deeplearning4j.api.storage.Persistable update]
    (-> this (.putUpdate update))))

(defn put-storage-meta-data
  "Description copied from interface: StatsStorageRouter

  storage-meta-data - Storage metadata to store - `org.deeplearning4j.api.storage.StorageMetaData`"
  ([^MapDBStatsStorage this ^org.deeplearning4j.api.storage.StorageMetaData storage-meta-data]
    (-> this (.putStorageMetaData storage-meta-data))))

