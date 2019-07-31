(ns org.deeplearning4j.ui.stats.BaseStatsListener
  "BaseStatsListener: a general purpose listener for collecting and reporting system and model information.

 Serves as a base for different ways of storing the collected data"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats BaseStatsListener]))

(defn ->base-stats-listener
  "Constructor.

  Create a StatsListener with network information collected every n >= 1 time steps

  router - Where/how to store the calculated stats. For example, InMemoryStatsStorage orFileStatsStorage - `org.deeplearning4j.api.storage.StatsStorageRouter`
  listener-frequency - Frequency with which to collect stats information - `int`"
  (^BaseStatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router ^Integer listener-frequency]
    (new BaseStatsListener router listener-frequency))
  (^BaseStatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router]
    (new BaseStatsListener router))
  (^BaseStatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router ^org.deeplearning4j.ui.stats.api.StatsInitializationConfiguration init-config ^org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration update-config ^java.lang.String session-id ^java.lang.String worker-id]
    (new BaseStatsListener router init-config update-config session-id worker-id)))

(def *-type-id
  "Static Constant.

  type: java.lang.String"
  BaseStatsListener/TYPE_ID)

(defn set-update-config
  "new-config - `org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration`"
  ([^BaseStatsListener this ^org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration new-config]
    (-> this (.setUpdateConfig new-config))))

(defn set-session-id
  "session-id - `java.lang.String`"
  ([^BaseStatsListener this ^java.lang.String session-id]
    (-> this (.setSessionID session-id))))

(defn get-worker-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseStatsListener this]
    (-> this (.getWorkerID))))

(defn on-epoch-end
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseStatsListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochEnd model))))

(defn get-storage-router
  "returns: `org.deeplearning4j.api.storage.StatsStorageRouter`"
  (^org.deeplearning4j.api.storage.StatsStorageRouter [^BaseStatsListener this]
    (-> this (.getStorageRouter))))

(defn on-backward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseStatsListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onBackwardPass model))))

(defn on-epoch-start
  "Description copied from interface: TrainingListener

  model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseStatsListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onEpochStart model))))

(defn get-new-initialization-report
  "returns: `org.deeplearning4j.ui.stats.api.StatsInitializationReport`"
  (^org.deeplearning4j.ui.stats.api.StatsInitializationReport [^BaseStatsListener this]
    (-> this (.getNewInitializationReport))))

(defn on-gradient-calculation
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`"
  ([^BaseStatsListener this ^org.deeplearning4j.nn.api.Model model]
    (-> this (.onGradientCalculation model))))

(defn iteration-done
  "Description copied from interface: TrainingListener

  model - the model iterating - `org.deeplearning4j.nn.api.Model`
  iteration - the iteration - `int`
  epoch - `int`"
  ([^BaseStatsListener this ^org.deeplearning4j.nn.api.Model model ^Integer iteration ^Integer epoch]
    (-> this (.iterationDone model iteration epoch))))

(defn get-new-stats-report
  "returns: `org.deeplearning4j.ui.stats.api.StatsReport`"
  (^org.deeplearning4j.ui.stats.api.StatsReport [^BaseStatsListener this]
    (-> this (.getNewStatsReport))))

(defn get-new-storage-meta-data
  "init-time - `long`
  session-id - `java.lang.String`
  worker-id - `java.lang.String`

  returns: `org.deeplearning4j.api.storage.StorageMetaData`"
  (^org.deeplearning4j.api.storage.StorageMetaData [^BaseStatsListener this ^Long init-time ^java.lang.String session-id ^java.lang.String worker-id]
    (-> this (.getNewStorageMetaData init-time session-id worker-id))))

(defn set-storage-router
  "router - `org.deeplearning4j.api.storage.StatsStorageRouter`"
  ([^BaseStatsListener this ^org.deeplearning4j.api.storage.StatsStorageRouter router]
    (-> this (.setStorageRouter router))))

(defn clone
  "returns: `org.deeplearning4j.ui.stats.BaseStatsListener`"
  (^org.deeplearning4j.ui.stats.BaseStatsListener [^BaseStatsListener this]
    (-> this (.clone))))

(defn on-forward-pass
  "Description copied from interface: TrainingListener

  model - Model - `org.deeplearning4j.nn.api.Model`
  activations - Layer activations (including input) - `java.util.List`"
  ([^BaseStatsListener this ^org.deeplearning4j.nn.api.Model model ^java.util.List activations]
    (-> this (.onForwardPass model activations))))

(defn get-update-config
  "returns: `org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration`"
  (^org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration [^BaseStatsListener this]
    (-> this (.getUpdateConfig))))

(defn get-session-id
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseStatsListener this]
    (-> this (.getSessionID))))

(defn get-init-config
  "returns: `org.deeplearning4j.ui.stats.api.StatsInitializationConfiguration`"
  (^org.deeplearning4j.ui.stats.api.StatsInitializationConfiguration [^BaseStatsListener this]
    (-> this (.getInitConfig))))

(defn set-worker-id
  "worker-id - `java.lang.String`"
  ([^BaseStatsListener this ^java.lang.String worker-id]
    (-> this (.setWorkerID worker-id))))

