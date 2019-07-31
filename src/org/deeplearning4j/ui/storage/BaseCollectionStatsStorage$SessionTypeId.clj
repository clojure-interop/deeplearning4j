(ns org.deeplearning4j.ui.storage.BaseCollectionStatsStorage$SessionTypeId
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.ui.storage BaseCollectionStatsStorage$SessionTypeId]))

(defn ->session-type-id
  "Constructor."
  (^BaseCollectionStatsStorage$SessionTypeId []
    (new BaseCollectionStatsStorage$SessionTypeId )))

(defn compare-to
  "o - `org.deeplearning4j.ui.storage.BaseCollectionStatsStorage$SessionTypeId`

  returns: `int`"
  (^Integer [^BaseCollectionStatsStorage$SessionTypeId this ^org.deeplearning4j.ui.storage.BaseCollectionStatsStorage$SessionTypeId o]
    (-> this (.compareTo o))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseCollectionStatsStorage$SessionTypeId this]
    (-> this (.toString))))

