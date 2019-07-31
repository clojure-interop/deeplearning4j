(ns org.deeplearning4j.api.storage.StatsStorage
  "A general-purpose stats storage mechanism, for storing stats information (mainly used for iteration listeners).

 Key design ideas:
 (a) Two types of storable objects:
 i. Persistable objects, for once per session objects (\"static info\") and also for periodically reported data (\"updates\")
 ii. StorageMetaData objects, for
 (b) There are 4 types of things used to uniquely identify these Persistable objects:
 i. SessionID: A unique identifier for a single session
 ii. TypeID: A unique identifier for the listener or type of data
 For example, we might have stats from 2 (or more) listeners with identical session and worker IDs
 This is typically hard-coded, per listener class
 iii. WorkerID: A unique identifier for workers, within a session
 iv. Timestamp: time at which the record was created
 For example, single machine training (with 1 listener) would have 1 session ID, 1 type ID, 1 worker ID, and multiple timestamps.
 Distributed training multiple listeres could have 1 session ID, multiple type IDs, and multiple worker IDs, and multiple timestamps for each
 A hyperparameter optimization job could have multiple session IDs on top of that.

 Note that the StatsStorage interface extends StatsStorageRouter"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StatsStorage]))

(defn list-worker-i-ds-for-session-and-type
  "For a given session ID and type ID, list all of the known worker IDs

  session-id - Session ID - `java.lang.String`
  type-id - Type ID - `java.lang.String`

  returns: List of worker IDs, or possibly null if session ID is unknown - `java.util.List<java.lang.String>`"
  (^java.util.List [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.listWorkerIDsForSessionAndType session-id type-id))))

(defn get-num-update-records-for
  "Return the number of update records for the given session ID and worker ID

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - Worker ID - `java.lang.String`

  returns: number of update records - `int`"
  (^Integer [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getNumUpdateRecordsFor session-id type-id worker-id)))
  (^Integer [^StatsStorage this ^java.lang.String session-id]
    (-> this (.getNumUpdateRecordsFor session-id))))

(defn get-all-update-times
  "List the times of all updates for the specified sessionID, typeID and workerID

  session-id - Session ID to get update times for - `java.lang.String`
  type-id - Type ID to get update times for - `java.lang.String`
  worker-id - Worker ID to get update times for - `java.lang.String`

  returns: Times of all updates - `long[]`"
  ([^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getAllUpdateTimes session-id type-id worker-id))))

(defn register-stats-storage-listener
  "Add a new StatsStorageListener. The given listener will called whenever a state change occurs for the stats
  storage instance

  listener - Listener to add - `org.deeplearning4j.api.storage.StatsStorageListener`"
  ([^StatsStorage this ^org.deeplearning4j.api.storage.StatsStorageListener listener]
    (-> this (.registerStatsStorageListener listener))))

(defn get-latest-update-all-workers
  "Get the latest update for all workers, for the given session ID

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`

  returns: List of updates for the given Session ID - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.getLatestUpdateAllWorkers session-id type-id))))

(defn list-type-i-ds-for-session
  "Get the list of type IDs for the given session ID

  session-id - Session ID to query - `java.lang.String`

  returns: List of type IDs - `java.util.List<java.lang.String>`"
  (^java.util.List [^StatsStorage this ^java.lang.String session-id]
    (-> this (.listTypeIDsForSession session-id))))

(defn remove-all-listeners
  "Remove all listeners from the StatsStorage instance"
  ([^StatsStorage this]
    (-> this (.removeAllListeners))))

(defn closed?
  "returns: Whether the StatsStorage implementation has been closed or not - `boolean`"
  (^Boolean [^StatsStorage this]
    (-> this (.isClosed))))

(defn get-latest-update
  "Get the latest update record (i.e., update record with the largest timestamp value) for the specified
  session and worker IDs

  session-id - session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - worker ID - `java.lang.String`

  returns: UpdateRecord containing the session/worker IDs, timestamp and content for the most recent update - `org.deeplearning4j.api.storage.Persistable`"
  (^org.deeplearning4j.api.storage.Persistable [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getLatestUpdate session-id type-id worker-id))))

(defn close
  "Close any open resources (files, etc)

  throws: java.io.IOException"
  ([^StatsStorage this]
    (-> this (.close))))

(defn get-all-updates-after
  "Get all updates for the given session and worker ID, that occur after (not including) the given timestamp.
  Results should be sorted by time.

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - Worker Id - `java.lang.String`
  timestamp - Timestamp - `long`

  returns: List of records occurring after the given timestamp - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long timestamp]
    (-> this (.getAllUpdatesAfter session-id type-id worker-id timestamp)))
  (^java.util.List [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^Long timestamp]
    (-> this (.getAllUpdatesAfter session-id type-id timestamp))))

(defn get-all-static-infos
  "Get all static informations for the given session and type ID

  session-id - Session ID to get static info for - `java.lang.String`
  type-id - Type ID to get static info for - `java.lang.String`

  returns: All static info instances matching both the session and type IDs - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.getAllStaticInfos session-id type-id))))

(defn get-update
  "Get the specified update (or null, if none exists for the given session/worker ids and timestamp)

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - Worker ID - `java.lang.String`
  timestamp - Timestamp - `long`

  returns: Update - `org.deeplearning4j.api.storage.Persistable`"
  (^org.deeplearning4j.api.storage.Persistable [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id ^Long timestamp]
    (-> this (.getUpdate session-id type-id worker-id timestamp))))

(defn list-session-i-ds
  "Get a list of all sessions stored by this storage backend

  returns: `java.util.List<java.lang.String>`"
  (^java.util.List [^StatsStorage this]
    (-> this (.listSessionIDs))))

(defn get-listeners
  "Get a list (shallow copy) of all listeners currently present

  returns: List of listeners - `java.util.List<org.deeplearning4j.api.storage.StatsStorageListener>`"
  (^java.util.List [^StatsStorage this]
    (-> this (.getListeners))))

(defn session-exists
  "Check if the specified session ID exists or not

  session-id - Session ID to check - `java.lang.String`

  returns: true if session exists, false otherwise - `boolean`"
  (^Boolean [^StatsStorage this ^java.lang.String session-id]
    (-> this (.sessionExists session-id))))

(defn deregister-stats-storage-listener
  "Remove the specified listener, if it is present.

  listener - Listener to remove - `org.deeplearning4j.api.storage.StatsStorageListener`"
  ([^StatsStorage this ^org.deeplearning4j.api.storage.StatsStorageListener listener]
    (-> this (.deregisterStatsStorageListener listener))))

(defn list-worker-i-ds-for-session
  "For a given session ID, list all of the known worker IDs

  session-id - Session ID - `java.lang.String`

  returns: List of worker IDs, or possibly null if session ID is unknown - `java.util.List<java.lang.String>`"
  (^java.util.List [^StatsStorage this ^java.lang.String session-id]
    (-> this (.listWorkerIDsForSession session-id))))

(defn get-static-info
  "Get the static info for the given session and worker IDs, or null if no such static info has been reported

  session-id - Session ID - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - worker ID - `java.lang.String`

  returns: Static info, or null if none has been reported - `org.deeplearning4j.api.storage.Persistable`"
  (^org.deeplearning4j.api.storage.Persistable [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (-> this (.getStaticInfo session-id type-id worker-id))))

(defn get-storage-meta-data
  "Get the session metadata, if any has been registered via StatsStorageRouter.putStorageMetaData(StorageMetaData)

  session-id - Session ID to get metadat - `java.lang.String`
  type-id - `java.lang.String`

  returns: Session metadata, or null if none is available - `org.deeplearning4j.api.storage.StorageMetaData`"
  (^org.deeplearning4j.api.storage.StorageMetaData [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id]
    (-> this (.getStorageMetaData session-id type-id))))

(defn get-updates
  "Get updates for the specified times only

  session-id - Session ID to get update times for - `java.lang.String`
  type-id - Type ID to get update times for - `java.lang.String`
  worker-id - Worker ID to get update times for - `java.lang.String`
  timestamps - Timestamps to get the updates for. Note that if one of the specified times does not exist,it will be ommitted from the returned results list. - `long[]`

  returns: List of updates at the specified times - `java.util.List<org.deeplearning4j.api.storage.Persistable>`"
  (^java.util.List [^StatsStorage this ^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id timestamps]
    (-> this (.getUpdates session-id type-id worker-id timestamps))))

