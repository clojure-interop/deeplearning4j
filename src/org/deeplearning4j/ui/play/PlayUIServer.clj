(ns org.deeplearning4j.ui.play.PlayUIServer
  "A UI server based on the Play framework"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.play PlayUIServer]))

(defn ->play-ui-server
  "Constructor.

  port - `int`"
  (^PlayUIServer [^Integer port]
    (new PlayUIServer port))
  (^PlayUIServer []
    (new PlayUIServer )))

(def *-ui-server-port-property
  "Static Constant.

  Deprecated. Use DL4JSystemProperties.UI_SERVER_PORT_PROPERTY

  type: java.lang.String"
  PlayUIServer/UI_SERVER_PORT_PROPERTY)

(def *-default-ui-port
  "Static Constant.

  type: int"
  PlayUIServer/DEFAULT_UI_PORT)

(def *-assets-root-directory
  "Static Constant.

  type: java.lang.String"
  PlayUIServer/ASSETS_ROOT_DIRECTORY)

(defn *main
  "args - `java.lang.String[]`"
  ([args]
    (PlayUIServer/main args)))

(defn stop
  "Description copied from class: UIServer"
  ([^PlayUIServer this]
    (-> this (.stop))))

(defn attached?
  "Description copied from class: UIServer

  stats-storage - StatsStorage instance to attach - `org.deeplearning4j.api.storage.StatsStorage`

  returns: True if attached - `boolean`"
  (^Boolean [^PlayUIServer this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.isAttached stats-storage))))

(defn detach
  "Description copied from class: UIServer

  stats-storage - StatsStorage instance to detach. If not attached: no op. - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^PlayUIServer this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.detach stats-storage))))

(defn get-address
  "Description copied from class: UIServer

  returns: Address of the UI - `java.lang.String`"
  (^java.lang.String [^PlayUIServer this]
    (-> this (.getAddress))))

(defn remote-listener-enabled?
  "returns: Whether the remote listener functionality is currently enabled - `boolean`"
  (^Boolean [^PlayUIServer this]
    (-> this (.isRemoteListenerEnabled))))

(defn attach
  "Description copied from class: UIServer

  stats-storage - StatsStorage instance to attach to the UI - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^PlayUIServer this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.attach stats-storage))))

(defn disable-remote-listener
  "Description copied from class: UIServer"
  ([^PlayUIServer this]
    (-> this (.disableRemoteListener))))

(defn get-port
  "Description copied from class: UIServer

  returns: `int`"
  (^Integer [^PlayUIServer this]
    (-> this (.getPort))))

(defn enable-remote-listener
  "Description copied from class: UIServer

  stats-storage - StatsStorageRouter to post the received results to - `org.deeplearning4j.api.storage.StatsStorageRouter`
  attach - Whether to attach the given StatsStorage instance to the UI server - `boolean`"
  ([^PlayUIServer this ^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage ^Boolean attach]
    (-> this (.enableRemoteListener stats-storage attach)))
  ([^PlayUIServer this]
    (-> this (.enableRemoteListener))))

(defn get-stats-storage-instances
  "returns: A list of all StatsStorage instances currently attached - `java.util.List<org.deeplearning4j.api.storage.StatsStorage>`"
  (^java.util.List [^PlayUIServer this]
    (-> this (.getStatsStorageInstances))))

(defn run-main
  "args - `java.lang.String[]`"
  ([^PlayUIServer this args]
    (-> this (.runMain args))))

