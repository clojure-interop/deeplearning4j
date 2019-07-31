(ns org.nd4j.parameterserver.status.play.StatusStorage
  "An interface for storing information
 about the status of a ParameterServerSubscriber"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.parameterserver.status.play StatusStorage]))

(defn ids
  "The list of state ids
  for the given SubscriberState

  returns: the list of ids for the given state - `java.util.List<java.lang.Integer>`"
  (^java.util.List [^StatusStorage this]
    (-> this (.ids))))

(defn num-states
  "Returns the number of states
  held by this storage

  returns: `int`"
  (^Integer [^StatusStorage this]
    (-> this (.numStates))))

(defn get-state
  "Get the state given an id.
  The integer represents a stream id
  for a given ParameterServerSubscriber.
  A SubscriberState is supposed to be 1 to 1 mapping
  for a stream and a MediaDriver.

  id - the id of the state to get - `int`

  returns: the subscriber state for the given id or none
  if it doesn't exist - `org.nd4j.parameterserver.model.SubscriberState`"
  (^org.nd4j.parameterserver.model.SubscriberState [^StatusStorage this ^Integer id]
    (-> this (.getState id))))

(defn update-state
  "Update the state for storage

  subscriber-state - the subscriber state to update - `org.nd4j.parameterserver.model.SubscriberState`"
  ([^StatusStorage this ^org.nd4j.parameterserver.model.SubscriberState subscriber-state]
    (-> this (.updateState subscriber-state))))

