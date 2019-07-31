(ns org.nd4j.parameterserver.status.play.BaseStatusStorage
  "Base status storage for storage logic
 and scheduling of ejection of
 instances indicating
 failure"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.status.play BaseStatusStorage]))

(defn ->base-status-storage
  "Constructor.

  heart-beat-ejection-milli-seconds - the amount of time beforeejecting a given subscriber as failed - `long`
  check-interval - the interval to check for - `long`"
  (^BaseStatusStorage [^Long heart-beat-ejection-milli-seconds ^Long check-interval]
    (new BaseStatusStorage heart-beat-ejection-milli-seconds check-interval))
  (^BaseStatusStorage []
    (new BaseStatusStorage )))

(defn ids
  "The list of state ids
  for the given SubscriberState

  returns: the list of ids for the given state - `java.util.List<java.lang.Integer>`"
  (^java.util.List [^BaseStatusStorage this]
    (-> this (.ids))))

(defn num-states
  "Returns the number of states
  held by this storage

  returns: `int`"
  (^Integer [^BaseStatusStorage this]
    (-> this (.numStates))))

(defn create-updated-map
  "Create the storage map

  returns: `java.util.Map<java.lang.Integer,java.lang.Long>`"
  (^java.util.Map [^BaseStatusStorage this]
    (-> this (.createUpdatedMap))))

(defn create-map
  "Create the storage map

  returns: `java.util.Map<java.lang.Integer,org.nd4j.parameterserver.model.SubscriberState>`"
  (^java.util.Map [^BaseStatusStorage this]
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
  (^org.nd4j.parameterserver.model.SubscriberState [^BaseStatusStorage this ^Integer id]
    (-> this (.getState id))))

(defn update-state
  "Update the state for storage

  subscriber-state - the subscriber state to update - `org.nd4j.parameterserver.model.SubscriberState`"
  ([^BaseStatusStorage this ^org.nd4j.parameterserver.model.SubscriberState subscriber-state]
    (-> this (.updateState subscriber-state))))

