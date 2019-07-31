(ns org.deeplearning4j.ui.module.remote.RemoteReceiverModule
  "Used to receive UI updates remotely.
 Used in conjunction with RemoteUIStatsStorageRouter, which posts to the UI.
 UI information is then deserialized and routed to the specified StatsStorageRouter, which may (or may not)
 be attached to the UI"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.module.remote RemoteReceiverModule]))

(defn ->remote-receiver-module
  "Constructor."
  (^RemoteReceiverModule []
    (new RemoteReceiverModule )))

(defn set-stats-storage
  "stats-storage - `org.deeplearning4j.api.storage.StatsStorageRouter`"
  ([^RemoteReceiverModule this ^org.deeplearning4j.api.storage.StatsStorageRouter stats-storage]
    (-> this (.setStatsStorage stats-storage))))

(defn get-callback-type-i-ds
  "Description copied from interface: UIModule

  returns: List of relevant Type IDs - `java.util.List<java.lang.String>`"
  (^java.util.List [^RemoteReceiverModule this]
    (-> this (.getCallbackTypeIDs))))

(defn on-attach
  "Description copied from interface: UIModule

  stats-storage - Stats storage that has been attached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^RemoteReceiverModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onAttach stats-storage))))

(defn on-detach
  "Description copied from interface: UIModule

  stats-storage - Stats storage that has been detached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^RemoteReceiverModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onDetach stats-storage))))

(defn set-enabled
  "enabled - `boolean`"
  ([^RemoteReceiverModule this ^Boolean enabled]
    (-> this (.setEnabled enabled))))

(defn report-storage-events
  "Description copied from interface: UIModule

  events - List of relevant events (type IDs match one of those from UIModule.getCallbackTypeIDs() - `java.util.Collection`"
  ([^RemoteReceiverModule this ^java.util.Collection events]
    (-> this (.reportStorageEvents events))))

(defn get-routes
  "Description copied from interface: UIModule

  returns: List of routes - `java.util.List<org.deeplearning4j.ui.api.Route>`"
  (^java.util.List [^RemoteReceiverModule this]
    (-> this (.getRoutes))))

(defn enabled?
  "returns: `boolean`"
  (^Boolean [^RemoteReceiverModule this]
    (-> this (.isEnabled))))

(defn get-internationalization-resources
  "returns: `java.util.List<org.deeplearning4j.ui.i18n.I18NResource>`"
  (^java.util.List [^RemoteReceiverModule this]
    (-> this (.getInternationalizationResources))))

