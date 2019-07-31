(ns org.deeplearning4j.ui.storage.BaseCollectionStatsStorage$SessionTypeWorkerId
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage BaseCollectionStatsStorage$SessionTypeWorkerId]))

(defn ->session-type-worker-id
  "Constructor.

  session-id - `java.lang.String`
  type-id - `java.lang.String`
  worker-id - `java.lang.String`"
  (^BaseCollectionStatsStorage$SessionTypeWorkerId [^java.lang.String session-id ^java.lang.String type-id ^java.lang.String worker-id]
    (new BaseCollectionStatsStorage$SessionTypeWorkerId session-id type-id worker-id)))

(defn compare-to
  "o - `org.deeplearning4j.ui.storage.BaseCollectionStatsStorage$SessionTypeWorkerId`

  returns: `int`"
  (^Integer [^BaseCollectionStatsStorage$SessionTypeWorkerId this ^org.deeplearning4j.ui.storage.BaseCollectionStatsStorage$SessionTypeWorkerId o]
    (-> this (.compareTo o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseCollectionStatsStorage$SessionTypeWorkerId this]
    (-> this (.toString))))

