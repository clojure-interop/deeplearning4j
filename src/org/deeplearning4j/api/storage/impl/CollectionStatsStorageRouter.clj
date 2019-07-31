(ns org.deeplearning4j.api.storage.impl.CollectionStatsStorageRouter
  "A simple StatsStorageRouter that simply stores the metadata, static info and updates in the specified
 collections. Typically used for testing."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage.impl CollectionStatsStorageRouter]))

(defn ->collection-stats-storage-router
  "Constructor."
  (^CollectionStatsStorageRouter []
    (new CollectionStatsStorageRouter )))

(defn put-storage-meta-data
  "Description copied from interface: StatsStorageRouter

  storage-meta-data - Storage metadata to store - `org.deeplearning4j.api.storage.StorageMetaData`"
  ([^CollectionStatsStorageRouter this ^org.deeplearning4j.api.storage.StorageMetaData storage-meta-data]
    (-> this (.putStorageMetaData storage-meta-data))))

(defn put-static-info
  "Description copied from interface: StatsStorageRouter

  static-info - Static info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^CollectionStatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable static-info]
    (-> this (.putStaticInfo static-info))))

(defn put-update
  "Description copied from interface: StatsStorageRouter

  update - Update info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^CollectionStatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable update]
    (-> this (.putUpdate update))))

