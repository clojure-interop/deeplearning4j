(ns org.deeplearning4j.api.storage.core
  (:refer-clojure :only [require comment defn ->])
  (:import ))

(require '[org.deeplearning4j.api.storage.Persistable])
(require '[org.deeplearning4j.api.storage.StatsStorage])
(require '[org.deeplearning4j.api.storage.StatsStorageEvent])
(require '[org.deeplearning4j.api.storage.StatsStorageListener$EventType])
(require '[org.deeplearning4j.api.storage.StatsStorageListener])
(require '[org.deeplearning4j.api.storage.StatsStorageRouter])
(require '[org.deeplearning4j.api.storage.StatsStorageRouterProvider])
(require '[org.deeplearning4j.api.storage.StorageMetaData])
(require '[org.deeplearning4j.api.storage.StorageType])
