(ns org.deeplearning4j.ui.api.UIServer
  "Interface for user interface server"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api UIServer]))

(defn ->ui-server
  "Constructor."
  (^UIServer []
    (new UIServer )))

(defn *get-instance
  "Get (and, initialize if necessary) the UI server.
  Singleton pattern - all calls to getInstance() will return the same UI instance.

  returns: UI instance for this JVM - `org.deeplearning4j.ui.api.UIServer`"
  (^org.deeplearning4j.ui.api.UIServer []
    (UIServer/getInstance )))

(defn stop
  "Stop/shut down the UI server."
  ([^UIServer this]
    (-> this (.stop))))

(defn attached?
  "Check whether the specified StatsStorage instance is attached to the UI instance

  stats-storage - StatsStorage instance to attach - `org.deeplearning4j.api.storage.StatsStorage`

  returns: True if attached - `boolean`"
  (^Boolean [^UIServer this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.isAttached stats-storage))))

(defn detach
  "Detach the specified StatsStorage instance from the UI

  stats-storage - StatsStorage instance to detach. If not attached: no op. - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^UIServer this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.detach stats-storage))))

(defn get-address
  "Get the address of the UI

  returns: Address of the UI - `java.lang.String`"
  (^java.lang.String [^UIServer this]
    (-> this (.getAddress))))

(defn remote-listener-enabled?
  "returns: Whether the remote listener functionality is currently enabled - `boolean`"
  (^Boolean [^UIServer this]
    (-> this (.isRemoteListenerEnabled))))

(defn attach
  "Attach the given StatsStorage instance to the UI, so the data can be visualized

  stats-storage - StatsStorage instance to attach to the UI - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^UIServer this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.attach stats-storage))))

(defn disable-remote-listener
  "Disable the remote listener functionality (disabled by default)"
  ([^UIServer this]
    (-> this (.disableRemoteListener))))

(defn get-port
  "Get the current port for the UI

  returns: `int`"
  (^Integer [^UIServer this]
    (-> this (.getPort))))

(defn enable-remote-listener
  "Enable the remote listener functionality, storing the received results in the specified StatsStorageRouter.
  If the StatsStorageRouter is a StatsStorage instance, it may (optionally) be attached to the UI,
  as if attach(StatsStorage) was called on it.

  stats-storage - StatsStorageRouter to post the received results to - `org.deeplearning4j.api.storage.StatsStorageRouter`
  attach - Whether to attach the given StatsStorage instance to the UI server - `boolean`"
  ([^UIServer this ^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage ^Boolean attach]
    (-> this (.enableRemoteListener stats-storage attach)))
  ([^UIServer this]
    (-> this (.enableRemoteListener))))

(defn get-stats-storage-instances
  "returns: A list of all StatsStorage instances currently attached - `java.util.List<org.deeplearning4j.api.storage.StatsStorage>`"
  (^java.util.List [^UIServer this]
    (-> this (.getStatsStorageInstances))))

