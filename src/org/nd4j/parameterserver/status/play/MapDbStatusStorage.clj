(ns org.nd4j.parameterserver.status.play.MapDbStatusStorage
  "MapDB status storage"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.status.play MapDbStatusStorage]))

(defn ->map-db-status-storage
  "Constructor.

  heart-beat-ejection-milli-seconds - the amount of time beforeejecting a given subscriber as failed - `long`
  check-interval - the interval to check for - `long`"
  (^MapDbStatusStorage [^Long heart-beat-ejection-milli-seconds ^Long check-interval]
    (new MapDbStatusStorage heart-beat-ejection-milli-seconds check-interval))
  (^MapDbStatusStorage []
    (new MapDbStatusStorage )))

(defn create-updated-map
  "Create the storage map

  returns: `java.util.Map<java.lang.Integer,java.lang.Long>`"
  (^java.util.Map [^MapDbStatusStorage this]
    (-> this (.createUpdatedMap))))

(defn create-map
  "Description copied from class: BaseStatusStorage

  returns: `java.util.Map<java.lang.Integer,org.nd4j.parameterserver.model.SubscriberState>`"
  (^java.util.Map [^MapDbStatusStorage this]
    (-> this (.createMap))))

(defn get-state
  "Get the state given an id.
  The integer represents a stream id
  for a given ParameterServerSubscriber.

  A SubscriberState is supposed to be 1 to 1 mapping
  for a stream and a MediaDriver.

  id - the id of the state to get - `int`

  returns: the subscriber state for the given id or none
  if it doesn't exist - `org.nd4j.parameterserver.model.SubscriberState`"
  (^org.nd4j.parameterserver.model.SubscriberState [^MapDbStatusStorage this ^Integer id]
    (-> this (.getState id))))

