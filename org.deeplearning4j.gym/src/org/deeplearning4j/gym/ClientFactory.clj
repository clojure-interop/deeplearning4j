(ns org.deeplearning4j.gym.ClientFactory
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.gym ClientFactory]))

(defn ->client-factory
  "Constructor."
  (^ClientFactory []
    (new ClientFactory )))

(defn *build
  "url - `java.lang.String`
  env-id - `java.lang.String`
  render - `boolean`

  returns: `<O,A,AS extends org.deeplearning4j.rl4j.space.ActionSpace<A>> org.deeplearning4j.gym.Client<O,A,AS>`"
  ([^java.lang.String url ^java.lang.String env-id ^Boolean render]
    (ClientFactory/build url env-id render))
  ([^java.lang.String env-id ^Boolean render]
    (ClientFactory/build env-id render)))

(defn *fetch-action-space
  "url - `java.lang.String`
  instance-id - `java.lang.String`

  returns: `<AS extends org.deeplearning4j.rl4j.space.ActionSpace> AS`"
  ([^java.lang.String url ^java.lang.String instance-id]
    (ClientFactory/fetchActionSpace url instance-id)))

(defn *fetch-observation-space
  "url - `java.lang.String`
  instance-id - `java.lang.String`

  returns: `<O> org.deeplearning4j.rl4j.space.GymObservationSpace<O>`"
  ([^java.lang.String url ^java.lang.String instance-id]
    (ClientFactory/fetchObservationSpace url instance-id)))

