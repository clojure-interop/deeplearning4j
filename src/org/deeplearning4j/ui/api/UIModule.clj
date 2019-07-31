(ns org.deeplearning4j.ui.api.UIModule
  "UIModule encapsulates the user interface functionality for a page or group of pages that rely on data coming
 from a StatsStorage instance.
 When a StatsStorage object is attached to a UIServer, the UI server will
 start receiving StatsStorageEvent instances; some of these (only the appropriate ones based on the specified
 TypeIDs from the getCallbackTypeIDs() method) will be routed to the UIModule, via reportStorageEvents(Collection).
 Each UIModule will generally handle one (or at most a few) different types of data (Type IDs); note however that events
 for a single Type ID can be routed to multiple UI modules, if required.

 The UIModule also encapsulates the relevant routing information: i.e., what GET/PUT (etc) methods are available for this
 module, and how those methods should be handled."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.api UIModule]))

(defn get-callback-type-i-ds
  "Get the list of Type IDs that should be collected from the registered StatsStorage instances, and
  passed on to the reportStorageEvents(Collection) method.

  returns: List of relevant Type IDs - `java.util.List<java.lang.String>`"
  (^java.util.List [^UIModule this]
    (-> this (.getCallbackTypeIDs))))

(defn get-routes
  "Get a list of Route objects, that specify GET/SET etc methods, and how these should be handled.

  returns: List of routes - `java.util.List<org.deeplearning4j.ui.api.Route>`"
  (^java.util.List [^UIModule this]
    (-> this (.getRoutes))))

(defn report-storage-events
  "Whenever the UIServer receives some StatsStorageEvents from one of the registered StatsStorage
  instances, it will filter these and pass on to the UI module those ones that match one of the Type IDs from
  getCallbackTypeIDs().
  Typically, these will be batched together at least somewhat, rather than being reported individually.

  events - List of relevant events (type IDs match one of those from getCallbackTypeIDs() - `java.util.Collection`"
  ([^UIModule this ^java.util.Collection events]
    (-> this (.reportStorageEvents events))))

(defn on-attach
  "Notify the UI module that the given StatsStorage instance has been attached to the UI

  stats-storage - Stats storage that has been attached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^UIModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onAttach stats-storage))))

(defn on-detach
  "Notify the UI module that the given StatsStorage instance has been detached from the UI

  stats-storage - Stats storage that has been detached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^UIModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onDetach stats-storage))))

(defn get-internationalization-resources
  "returns: `java.util.List<org.deeplearning4j.ui.i18n.I18NResource>`"
  (^java.util.List [^UIModule this]
    (-> this (.getInternationalizationResources))))

