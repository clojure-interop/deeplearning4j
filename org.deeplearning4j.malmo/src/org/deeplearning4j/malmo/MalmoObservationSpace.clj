(ns org.deeplearning4j.malmo.MalmoObservationSpace
  "Abstract base class for all Malmo-specific observation spaces"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoObservationSpace]))

(defn ->malmo-observation-space
  "Constructor."
  (^MalmoObservationSpace []
    (new MalmoObservationSpace )))

(defn get-observation
  "world-state - `com.microsoft.msr.malmo.WorldState`

  returns: `org.deeplearning4j.malmo.MalmoBox`"
  (^org.deeplearning4j.malmo.MalmoBox [^MalmoObservationSpace this ^com.microsoft.msr.malmo.WorldState world-state]
    (-> this (.getObservation world-state))))

