(ns org.deeplearning4j.malmo.MalmoDescretePositionPolicy
  "A Malmo consistency policy that ensures the both there is a reward and next observation has a different position that the previous one.
 This will only work for your mission if you require that every action moves to a new location."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoDescretePositionPolicy]))

(defn ->malmo-descrete-position-policy
  "Constructor."
  (^MalmoDescretePositionPolicy []
    (new MalmoDescretePositionPolicy )))

(defn observation-consistant?
  "world-state - `com.microsoft.msr.malmo.WorldState`
  original-world-state - `com.microsoft.msr.malmo.WorldState`

  returns: `boolean`"
  (^Boolean [^MalmoDescretePositionPolicy this ^com.microsoft.msr.malmo.WorldState world-state ^com.microsoft.msr.malmo.WorldState original-world-state]
    (-> this (.isObservationConsistant world-state original-world-state))))

