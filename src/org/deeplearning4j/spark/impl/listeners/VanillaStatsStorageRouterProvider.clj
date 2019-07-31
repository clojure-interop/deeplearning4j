(ns org.deeplearning4j.spark.impl.listeners.VanillaStatsStorageRouterProvider
  "Returns a new instance of a VanillaStatsStorageRouter"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.spark.impl.listeners VanillaStatsStorageRouterProvider]))

(defn ->vanilla-stats-storage-router-provider
  "Constructor."
  (^VanillaStatsStorageRouterProvider []
    (new VanillaStatsStorageRouterProvider )))

(defn get-router
  "returns: `org.deeplearning4j.api.storage.StatsStorageRouter`"
  (^org.deeplearning4j.api.storage.StatsStorageRouter [^VanillaStatsStorageRouterProvider this]
    (-> this (.getRouter))))

