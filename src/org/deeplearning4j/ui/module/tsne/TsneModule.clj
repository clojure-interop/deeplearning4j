(ns org.deeplearning4j.ui.module.tsne.TsneModule
  "Created by Alex on 25/10/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.module.tsne TsneModule]))

(defn ->tsne-module
  "Constructor."
  (^TsneModule []
    (new TsneModule )))

(defn get-callback-type-i-ds
  "Description copied from interface: UIModule

  returns: List of relevant Type IDs - `java.util.List<java.lang.String>`"
  (^java.util.List [^TsneModule this]
    (-> this (.getCallbackTypeIDs))))

(defn get-routes
  "Description copied from interface: UIModule

  returns: List of routes - `java.util.List<org.deeplearning4j.ui.api.Route>`"
  (^java.util.List [^TsneModule this]
    (-> this (.getRoutes))))

(defn report-storage-events
  "Description copied from interface: UIModule

  events - List of relevant events (type IDs match one of those from UIModule.getCallbackTypeIDs() - `java.util.Collection`"
  ([^TsneModule this ^java.util.Collection events]
    (-> this (.reportStorageEvents events))))

(defn on-attach
  "Description copied from interface: UIModule

  stats-storage - Stats storage that has been attached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^TsneModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onAttach stats-storage))))

(defn on-detach
  "Description copied from interface: UIModule

  stats-storage - Stats storage that has been detached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^TsneModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onDetach stats-storage))))

(defn get-internationalization-resources
  "returns: `java.util.List<org.deeplearning4j.ui.i18n.I18NResource>`"
  (^java.util.List [^TsneModule this]
    (-> this (.getInternationalizationResources))))

