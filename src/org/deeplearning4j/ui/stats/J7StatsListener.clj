(ns org.deeplearning4j.ui.stats.J7StatsListener
  "J7StatsListener: a version of the StatsListener but with Java 7 compatibility

 Stats are collected and passed on to a StatsStorageRouter - for example, for storage and/or displaying in the UI,
 use InMemoryStatsStorage or FileStatsStorage."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.stats J7StatsListener]))

(defn ->j-7-stats-listener
  "Constructor.

  Create a StatsListener with network information collected every n >= 1 time steps

  router - Where/how to store the calculated stats. For example, InMemoryStatsStorage orFileStatsStorage - `org.deeplearning4j.api.storage.StatsStorageRouter`
  listener-frequency - Frequency with which to collect stats information - `int`"
  (^J7StatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router ^Integer listener-frequency]
    (new J7StatsListener router listener-frequency))
  (^J7StatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router]
    (new J7StatsListener router))
  (^J7StatsListener [^org.deeplearning4j.api.storage.StatsStorageRouter router ^org.deeplearning4j.ui.stats.api.StatsInitializationConfiguration init-config ^org.deeplearning4j.ui.stats.api.StatsUpdateConfiguration update-config ^java.lang.String session-id ^java.lang.String worker-id]
    (new J7StatsListener router init-config update-config session-id worker-id)))

(defn get-new-initialization-report
  "returns: `org.deeplearning4j.ui.stats.api.StatsInitializationReport`"
  (^org.deeplearning4j.ui.stats.api.StatsInitializationReport [^J7StatsListener this]
    (-> this (.getNewInitializationReport))))

(defn get-new-stats-report
  "returns: `org.deeplearning4j.ui.stats.api.StatsReport`"
  (^org.deeplearning4j.ui.stats.api.StatsReport [^J7StatsListener this]
    (-> this (.getNewStatsReport))))

(defn get-new-storage-meta-data
  "init-time - `long`
  session-id - `java.lang.String`
  worker-id - `java.lang.String`

  returns: `org.deeplearning4j.api.storage.StorageMetaData`"
  (^org.deeplearning4j.api.storage.StorageMetaData [^J7StatsListener this ^Long init-time ^java.lang.String session-id ^java.lang.String worker-id]
    (-> this (.getNewStorageMetaData init-time session-id worker-id))))

(defn clone
  "returns: `org.deeplearning4j.ui.stats.J7StatsListener`"
  (^org.deeplearning4j.ui.stats.J7StatsListener [^J7StatsListener this]
    (-> this (.clone))))

