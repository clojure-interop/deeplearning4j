(ns org.nd4j.parameterserver.status.play.InMemoryStatusStorage
  "In memory status storage
 for parameter server subscribers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.status.play InMemoryStatusStorage]))

(defn ->in-memory-status-storage
  "Constructor."
  (^InMemoryStatusStorage []
    (new InMemoryStatusStorage )))

(defn create-updated-map
  "Create the storage map

  returns: `java.util.Map<java.lang.Integer,java.lang.Long>`"
  (^java.util.Map [^InMemoryStatusStorage this]
    (-> this (.createUpdatedMap))))

(defn create-map
  "Description copied from class: BaseStatusStorage

  returns: `java.util.Map<java.lang.Integer,org.nd4j.parameterserver.model.SubscriberState>`"
  (^java.util.Map [^InMemoryStatusStorage this]
    (-> this (.createMap))))

