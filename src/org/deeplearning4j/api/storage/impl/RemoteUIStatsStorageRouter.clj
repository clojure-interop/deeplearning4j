(ns org.deeplearning4j.api.storage.impl.RemoteUIStatsStorageRouter
  "Asynchronously post all updates to a remote UI that has remote listening enabled.
 Typically used with UIServer (don't forget to enable remote listener support - UIServer.getInstance().enableRemoteListener()"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage.impl RemoteUIStatsStorageRouter]))

(defn ->remote-ui-stats-storage-router
  "Constructor.

  Create remote UI with defaults for all values except address

  address - Address of the remote UI: for example, \"http://localhost:9000\" - `java.lang.String`"
  (^RemoteUIStatsStorageRouter [^java.lang.String address]
    (new RemoteUIStatsStorageRouter address))
  (^RemoteUIStatsStorageRouter [^java.lang.String address ^java.lang.String path ^Integer max-retry-count ^Long retry-delay-ms ^Double retry-backoff-factor]
    (new RemoteUIStatsStorageRouter address path max-retry-count retry-delay-ms retry-backoff-factor))
  (^RemoteUIStatsStorageRouter [^java.lang.String address ^Integer max-retry-count ^Long retry-delay-ms ^Double retry-backoff-factor]
    (new RemoteUIStatsStorageRouter address max-retry-count retry-delay-ms retry-backoff-factor)))

(def *-default-path
  "Static Constant.

  Default path for posting data to the UI - i.e., http://localhost:9000/remoteReceive or similar

  type: java.lang.String"
  RemoteUIStatsStorageRouter/DEFAULT_PATH)

(def *-default-max-retries
  "Static Constant.

  Default maximum number of (consecutive) retries on failure

  type: int"
  RemoteUIStatsStorageRouter/DEFAULT_MAX_RETRIES)

(def *-default-base-retr-delay-ms
  "Static Constant.

  Base delay for retries

  type: long"
  RemoteUIStatsStorageRouter/DEFAULT_BASE_RETR_DELAY_MS)

(def *-default-retry-backoff-factor
  "Static Constant.

  Default backoff multiplicative factor for retrying

  type: double"
  RemoteUIStatsStorageRouter/DEFAULT_RETRY_BACKOFF_FACTOR)

(defn put-storage-meta-data
  "Description copied from interface: StatsStorageRouter

  storage-meta-data - Storage metadata to store - `org.deeplearning4j.api.storage.StorageMetaData`"
  ([^RemoteUIStatsStorageRouter this ^org.deeplearning4j.api.storage.StorageMetaData storage-meta-data]
    (-> this (.putStorageMetaData storage-meta-data))))

(defn put-static-info
  "Description copied from interface: StatsStorageRouter

  static-info - Static info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^RemoteUIStatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable static-info]
    (-> this (.putStaticInfo static-info))))

(defn put-update
  "Description copied from interface: StatsStorageRouter

  update - Update info to store - `org.deeplearning4j.api.storage.Persistable`"
  ([^RemoteUIStatsStorageRouter this ^org.deeplearning4j.api.storage.Persistable update]
    (-> this (.putUpdate update))))

