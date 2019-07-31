(ns org.deeplearning4j.ui.stats.StatsListener
  "StatsListener: a general purpose listener for collecting and reporting system and model information.

 Stats are collected and passed on to a StatsStorageRouter - for example, for storage and/or displaying in the UI,
 use InMemoryStatsStorage or FileStatsStorage."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats StatsListener]))

(defn ->stats-listener
  "Constructor.

  Create a StatsListener with network information collected every n >= 1 time steps

  router - Where/how to store the calculated stats. For example, InMemoryStatsStorage orFileStatsStorage - `org.deeplearning4j.api.storage.StatsStorageRouter`
  listener-frequency - Frequency with which to collect stats information - `int`"
  (^StatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router ^Integer listener-frequency]
    (new StatsListener router listener-frequency))
  (^StatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router]
    (new StatsListener router))
  (^StatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router ^org.deeplearning4j.ui.stats.api.StatsInitializationConfiguration init-config ^org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration update-config ^java.lang.String session-id ^java.lang.String worker-id]
    (new StatsListener router init-config update-config session-id worker-id)))

(defn clone
  "returns: `org.deeplearning4j.ui.stats.StatsListener`"
  (^org.deeplearning4j.ui.stats.StatsListener [^StatsListener this]
    (-> this (.clone))))

(defn get-new-initialization-report
  "returns: `org.deeplearning4j.ui.stats.api.StatsInitializationReport`"
  (^org.deeplearning4j.ui.stats.api.StatsInitializationReport [^StatsListener this]
    (-> this (.getNewInitializationReport))))

(defn get-new-stats-report
  "returns: `org.deeplearning4j.ui.stats.api.StatsReport`"
  (^org.deeplearning4j.ui.stats.api.StatsReport [^StatsListener this]
    (-> this (.getNewStatsReport))))

(defn get-new-storage-meta-data
  "init-time - `long`
  session-id - `java.lang.String`
  worker-id - `java.lang.String`

  returns: `org.deeplearning4j.api.storage.StorageMetaData`"
  (^org.deeplearning4j.api.storage.StorageMetaData [^StatsListener this ^Long init-time ^java.lang.String session-id ^java.lang.String worker-id]
    (-> this (.getNewStorageMetaData init-time session-id worker-id))))

