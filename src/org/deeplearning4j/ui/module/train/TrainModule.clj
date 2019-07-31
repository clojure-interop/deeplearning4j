(ns org.deeplearning4j.ui.module.train.TrainModule
  "Main DL4J Training UI"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.module.train TrainModule]))

(defn ->train-module
  "Constructor."
  (^TrainModule []
    (new TrainModule )))

(def *-nan-replacement-value
  "Static Constant.

  type: double"
  TrainModule/NAN_REPLACEMENT_VALUE)

(def *-default-max-chart-points
  "Static Constant.

  type: int"
  TrainModule/DEFAULT_MAX_CHART_POINTS)

(def *-chart-max-points-property
  "Static Constant.

  Deprecated. Use DL4JSystemProperties.CHART_MAX_POINTS_PROPERTY

  type: java.lang.String"
  TrainModule/CHART_MAX_POINTS_PROPERTY)

(defn get-callback-type-i-ds
  "Description copied from interface: UIModule

  returns: List of relevant Type IDs - `java.util.List<java.lang.String>`"
  (^java.util.List [^TrainModule this]
    (-> this (.getCallbackTypeIDs))))

(defn get-routes
  "Description copied from interface: UIModule

  returns: List of routes - `java.util.List<org.deeplearning4j.ui.api.Route>`"
  (^java.util.List [^TrainModule this]
    (-> this (.getRoutes))))

(defn report-storage-events
  "Description copied from interface: UIModule

  events - List of relevant events (type IDs match one of those from UIModule.getCallbackTypeIDs() - `java.util.Collection`"
  ([^TrainModule this ^java.util.Collection events]
    (-> this (.reportStorageEvents events))))

(defn on-attach
  "Description copied from interface: UIModule

  stats-storage - Stats storage that has been attached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^TrainModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onAttach stats-storage))))

(defn on-detach
  "Description copied from interface: UIModule

  stats-storage - Stats storage that has been detached - `org.deeplearning4j.api.storage.StatsStorage`"
  ([^TrainModule this ^org.deeplearning4j.api.storage.StatsStorage stats-storage]
    (-> this (.onDetach stats-storage))))

(defn get-system-data
  "returns: `play.mvc.Result`"
  (^play.mvc.Result [^TrainModule this]
    (-> this (.getSystemData))))

(defn get-internationalization-resources
  "returns: `java.util.List<org.deeplearning4j.ui.i18n.I18NResource>`"
  (^java.util.List [^TrainModule this]
    (-> this (.getInternationalizationResources))))

