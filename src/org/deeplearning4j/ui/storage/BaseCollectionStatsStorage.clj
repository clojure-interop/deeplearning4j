(ns org.deeplearning4j.ui.storage.BaseCollectionStatsStorage
  "An implementation of the StatsStorage interface, backed by MapDB"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage BaseCollectionStatsStorage]))

(defn list-worker-i-ds-for-session-and-type
  "Description copied from interface: StatsStorage

  session-id - Session ID - `java.lang.String`
  type-id - Type ID - `java.lang.String`

  returns: List of worker IDs, or possibly null if session ID is unknown - `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.listWorkerIDsForSessionAndType session-id type-id))))

(defn put-static-info
  "Description copied from interface: StatsStorageRouter

  static-info - Static info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^BaseCollectionStatsStorage this ^org.deeplearning4j.api.storage.Persistable static-info]
    (-> this (.putStaticInfo static-info))))

(defn get-num-update-records-for
  "Description copied from interface: StatsStorage

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - Worker ID - `java.lang.String`

  returns: number of update records - `int`"
  (^Integer [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getNumUpdateRecordsFor session-id type-id worker-id)))
  (^Integer [^BaseCollectionStatsStorage this ^java.lang.String session-id]
    (-> this (.getNumUpdateRecordsFor session-id))))

(defn get-all-update-times
  "Description copied from interface: StatsStorage

  session-id - Session ID to get update times for - `java.lang.String`
  type-id - Type ID to get update times for - `java.lang.String`
  worker-id - Worker ID to get update times for - `java.lang.String`

  returns: Times of all updates - `long[]`"
  ([^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getAllUpdateTimes session-id type-id worker-id))))

(defn register-stats-storage-listener
  "Description copied from interface: StatsStorage

  listener - Listener to add - `org.deeplearning4j.api.storage.StatsStorageListener`"
  ([^BaseCollectionStatsStorage this ^org.deeplearning4j.api.storage.StatsStorageListener listener]
    (-> this (.registerStatsStorageListener listener))))

(defn get-latest-update-all-workers
  "Description copied from interface: StatsStorage

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`

  returns: List of updates for the given Session ID - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.getLatestUpdateAllWorkers session-id type-id))))

(defn list-type-i-ds-for-session
  "Description copied from interface: StatsStorage

  session-id - Session ID to query - `java.lang.String`

  returns: List of type IDs - `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id]
    (-> this (.listTypeIDsForSession session-id))))

(defn remove-all-listeners
  "Description copied from interface: StatsStorage"
  ([^BaseCollectionStatsStorage this]
    (-> this (.removeAllListeners))))

(defn get-latest-update
  "Description copied from interface: StatsStorage

  session-id - session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - worker ID - `java.lang.String`

  returns: UpdateRecord containing the session/worker IDs, timestamp and content for the most recent update - `org.deeplearning4j.api.storage.Persistable`"
  (^org.deeplearning4j.api.storage.Persistable [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getLatestUpdate session-id type-id worker-id))))

(defn put-storage-meta-data
  "Description copied from interface: StatsStorageRouter

  storage-meta-data - Storage metadata to store - `org.deeplearning4j.api.storage.StorageMetaData`"
  ([^BaseCollectionStatsStorage this ^org.deeplearning4j.api.storage.StorageMetaData storage-meta-data]
    (-> this (.putStorageMetaData storage-meta-data))))

(defn get-all-updates-after
  "Description copied from interface: StatsStorage

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - Worker Id - `java.lang.String`
  timestamp - Timestamp - `long`

  returns: List of records occurring after the given timestamp - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long timestamp]
    (-> this (.getAllUpdatesAfter session-id type-id worker-id timestamp)))
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^Long timestamp]
    (-> this (.getAllUpdatesAfter session-id type-id timestamp))))

(defn get-all-static-infos
  "Description copied from interface: StatsStorage

  session-id - Session ID to get static info for - `java.lang.String`
  type-id - Type ID to get static info for - `java.lang.String`

  returns: All static info instances matching both the session and type IDs - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.getAllStaticInfos session-id type-id))))

(defn get-update
  "Description copied from interface: StatsStorage

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - Worker ID - `java.lang.String`
  timestamp - Timestamp - `long`

  returns: Update - `org.deeplearning4j.api.storage.Persistable`"
  (^org.deeplearning4j.api.storage.Persistable [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long timestamp]
    (-> this (.getUpdate session-id type-id worker-id timestamp))))

(defn list-session-i-ds
  "Description copied from interface: StatsStorage

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseCollectionStatsStorage this]
    (-> this (.listSessionIDs))))

(defn get-listeners
  "Description copied from interface: StatsStorage

  returns: List of listeners - `java.util.List<org.deeplearning4j.api.storage.StatsStorageListener>`"
  (^java.util.List [^BaseCollectionStatsStorage this]
    (-> this (.getListeners))))

(defn session-exists
  "Description copied from interface: StatsStorage

  session-id - Session ID to check - `java.lang.String`

  returns: true if session exists, false otherwise - `boolean`"
  (^Boolean [^BaseCollectionStatsStorage this ^java.lang.String session-id]
    (-> this (.sessionExists session-id))))

(defn deregister-stats-storage-listener
  "Description copied from interface: StatsStorage

  listener - Listener to remove - `org.deeplearning4j.api.storage.StatsStorageListener`"
  ([^BaseCollectionStatsStorage this ^org.deeplearning4j.api.storage.StatsStorageListener listener]
    (-> this (.deregisterStatsStorageListener listener))))

(defn list-worker-i-ds-for-session
  "Description copied from interface: StatsStorage

  session-id - Session ID - `java.lang.String`

  returns: List of worker IDs, or possibly null if session ID is unknown - `java.util.List<java.lang.String>`"
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id]
    (-> this (.listWorkerIDsForSession session-id))))

(defn put-update
  "Description copied from interface: StatsStorageRouter

  update - Update info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^BaseCollectionStatsStorage this ^org.deeplearning4j.api.storage.Persistable update]
    (-> this (.putUpdate update))))

(defn get-static-info
  "Description copied from interface: StatsStorage

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - worker ID - `java.lang.String`

  returns: Static info, or null if none has been reported - `org.deeplearning4j.api.storage.Persistable`"
  (^org.deeplearning4j.api.storage.Persistable [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getStaticInfo session-id type-id worker-id))))

(defn get-storage-meta-data
  "Description copied from interface: StatsStorage

  session-id - Session ID to get metadat - `java.lang.String`
  type-id - `java.lang.String`

  returns: Session metadata, or null if none is available - `org.deeplearning4j.api.storage.StorageMetaData`"
  (^org.deeplearning4j.api.storage.StorageMetaData [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.getStorageMetaData session-id type-id))))

(defn get-updates
  "Description copied from interface: StatsStorage

  session-id - Session ID to get update times for - `java.lang.String`
  type-id - Type ID to get update times for - `java.lang.String`
  worker-id - Worker ID to get update times for - `java.lang.String`
  timestamps - Timestamps to get the updates for. Note that if one of the specified times does not exist,it will be ommitted from the returned results list. - `long[]`

  returns: List of updates at the specified times - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^BaseCollectionStatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id timestamps]
    (-> this (.getUpdates session-id type-id worker-id timestamps))))

