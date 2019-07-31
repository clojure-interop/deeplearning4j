(ns org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage.mapdb MapDBStatsStorage$Builder]))

(defn ->builder
  "Constructor.

  file - `java.io.File`"
  (^MapDBStatsStorage$Builder [^java.io.File file]
    (new MapDBStatsStorage$Builder file))
  (^MapDBStatsStorage$Builder []
    (new MapDBStatsStorage$Builder )))

(defn file
  "file - `java.io.File`

  returns: `org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage$Builder`"
  (^org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage$Builder [^MapDBStatsStorage$Builder this ^java.io.File file]
    (-> this (.file file))))

(defn use-write-ahead-log
  "use-write-ahead-log - `boolean`

  returns: `org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage$Builder`"
  (^org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage$Builder [^MapDBStatsStorage$Builder this ^Boolean use-write-ahead-log]
    (-> this (.useWriteAheadLog use-write-ahead-log))))

(defn build
  "returns: `org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage`"
  (^org.deeplearning4j.ui.storage.mapdb.MapDBStatsStorage [^MapDBStatsStorage$Builder this]
    (-> this (.build))))

