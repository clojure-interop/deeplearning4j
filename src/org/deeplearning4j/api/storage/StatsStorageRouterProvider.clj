(ns org.deeplearning4j.api.storage.StatsStorageRouterProvider
  "Simple interface to provide a StatsStorageRouter. Typically used for distributed training such as Spark."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage StatsStorageRouterProvider]))

(defn get-router
  "returns: `org.deeplearning4j.api.storage.StatsStorageRouter`"
  (^org.deeplearning4j.api.storage.StatsStorageRouter [^StatsStorageRouterProvider this]
    (-> this (.getRouter))))

