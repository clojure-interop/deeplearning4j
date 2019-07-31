(ns org.deeplearning4j.ui.storage.FileStatsStorage
  "A StatsStorage implementation that stores UI data in a file for persistence.
 Can be used for multiple instances, and across multiple independent runs. Data can be loaded later in a separate
 JVM instance by passing the same file location to both.
 Internally, uses MapDBStatsStorage"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage FileStatsStorage]))

(defn ->file-stats-storage
  "Constructor.

  f - `java.io.File`"
  (^FileStatsStorage [^java.io.File f]
    (new FileStatsStorage f)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FileStatsStorage this]
    (-> this (.toString))))

