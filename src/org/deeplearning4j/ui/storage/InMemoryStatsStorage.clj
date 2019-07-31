(ns org.deeplearning4j.ui.storage.InMemoryStatsStorage
  "A StatsStorage implementation that stores all data in memory. If persistence is required for the UI information,
 use FileStatsStorage or MapDBStatsStorage.
 Internally, this implementation uses MapDBStatsStorage"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage InMemoryStatsStorage]))

(defn ->in-memory-stats-storage
  "Constructor."
  (^InMemoryStatsStorage []
    (new InMemoryStatsStorage )))

(defn put-static-info
  "Description copied from interface: StatsStorageRouter

  static-info - Static info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^InMemoryStatsStorage this ^org.deeplearning4j.api.storage.Persistable static-info]
    (-> this (.putStaticInfo static-info))))

(defn put-update
  "Description copied from interface: StatsStorageRouter

  update - Update info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^InMemoryStatsStorage this ^org.deeplearning4j.api.storage.Persistable update]
    (-> this (.putUpdate update))))

(defn put-storage-meta-data
  "Description copied from interface: StatsStorageRouter

  storage-meta-data - Storage metadata to store - `org.deeplearning4j.api.storage.StorageMetaData`"
  ([^InMemoryStatsStorage this ^org.deeplearning4j.api.storage.StorageMetaData storage-meta-data]
    (-> this (.putStorageMetaData storage-meta-data))))

(defn close
  "Description copied from interface: StatsStorage

  throws: java.io.IOException"
  ([^InMemoryStatsStorage this]
    (-> this (.close))))

(defn closed?
  "returns: Whether the StatsStorage implementation has been closed or not - `boolean`"
  (^Boolean [^InMemoryStatsStorage this]
    (-> this (.isClosed))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InMemoryStatsStorage this]
    (-> this (.toString))))

