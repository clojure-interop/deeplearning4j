(ns org.deeplearning4j.rl4j.space.GymObservationSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space GymObservationSpace]))

(defn ->gym-observation-space
  "Constructor.

  json-object - `org.json.JSONObject`"
  (^GymObservationSpace [^org.json.JSONObject json-object]
    (new GymObservationSpace json-object)))

(defn get-value
  "o - `org.json.JSONObject`
  key - `java.lang.String`

  returns: `O`"
  ([^GymObservationSpace this ^org.json.JSONObject o ^java.lang.String key]
    (-> this (.getValue o key))))

