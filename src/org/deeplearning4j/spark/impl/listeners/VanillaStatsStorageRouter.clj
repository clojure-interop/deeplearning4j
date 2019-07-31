(ns org.deeplearning4j.spark.impl.listeners.VanillaStatsStorageRouter
  "Standard router for use in Spark: simply collect the data for later serialization and passing back to the master."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.listeners VanillaStatsStorageRouter]))

(defn ->vanilla-stats-storage-router
  "Constructor."
  (^VanillaStatsStorageRouter []
    (new VanillaStatsStorageRouter )))

(defn put-storage-meta-data
  "Description copied from interface: StatsStorageRouter

  storage-meta-data - Storage metadata to store - `org.deeplearning4j.api.storage.StorageMetaData`"
  ([^VanillaStatsStorageRouter this ^org.deeplearning4j.api.storage.StorageMetaData storage-meta-data]
    (-> this (.putStorageMetaData storage-meta-data))))

(defn put-static-info
  "Description copied from interface: StatsStorageRouter

  static-info - Static info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^VanillaStatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable static-info]
    (-> this (.putStaticInfo static-info))))

(defn put-update
  "Description copied from interface: StatsStorageRouter

  update - Update info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^VanillaStatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable update]
    (-> this (.putUpdate update))))

(defn get-storage-meta-data
  "returns: `java.util.List<org.deeplearning4j.api.storage.StorageMetaData>`"
  (^java.util.List [^VanillaStatsStorageRouter this]
    (-> this (.getStorageMetaData))))

(defn get-static-info
  "returns: `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^VanillaStatsStorageRouter this]
    (-> this (.getStaticInfo))))

(defn get-updates
  "returns: `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^VanillaStatsStorageRouter this]
    (-> this (.getUpdates))))

