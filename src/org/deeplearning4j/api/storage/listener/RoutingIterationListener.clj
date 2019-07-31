(ns org.deeplearning4j.api.storage.listener.RoutingIterationListener
  "An extension of the TrainingListener interface for those listeners that pass data off to a
 StatsStorageRouter instance.
 The most common use case here is in distributed training scenarios: each worker has a set of listeners, that have
 to be serialized and transferred across the network, to some storage mechanism.
 The StatsStorageRouter implementations themselves may not be serializable, or should be shared between multiple workers,
 so instead, we use a StatsStorageRouterProvider"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.api.storage.listener RoutingIterationListener]))

(defn set-storage-router
  "router - `org.deeplearning4j.api.storage.StatsStorageRouter`"
  ([^RoutingIterationListener this ^org.deeplearning4j.api.storage.StatsStorageRouter router]
    (-> this (.setStorageRouter router))))

(defn get-storage-router
  "returns: `org.deeplearning4j.api.storage.StatsStorageRouter`"
  (^org.deeplearning4j.api.storage.StatsStorageRouter [^RoutingIterationListener this]
    (-> this (.getStorageRouter))))

(defn set-worker-id
  "worker-id - `java.lang.String`"
  ([^RoutingIterationListener this ^java.lang.String worker-id]
    (-> this (.setWorkerID worker-id))))

(defn get-worker-id
  "returns: `java.lang.String`"
  (^java.lang.String [^RoutingIterationListener this]
    (-> this (.getWorkerID))))

(defn set-session-id
  "session-id - `java.lang.String`"
  ([^RoutingIterationListener this ^java.lang.String session-id]
    (-> this (.setSessionID session-id))))

(defn get-session-id
  "returns: `java.lang.String`"
  (^java.lang.String [^RoutingIterationListener this]
    (-> this (.getSessionID))))

(defn clone
  "returns: `org.deeplearning4j.api.storage.listener.RoutingIterationListener`"
  (^org.deeplearning4j.api.storage.listener.RoutingIterationListener [^RoutingIterationListener this]
    (-> this (.clone))))

