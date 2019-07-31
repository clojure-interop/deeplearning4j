(ns org.deeplearning4j.malmo.MalmoActionSpaceDiscrete
  "Action space that allows for a fixed set of specific Malmo actions"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoActionSpaceDiscrete]))

(defn ->malmo-action-space-discrete
  "Constructor.

  Construct an actions space from an array of action strings

  actions - Array of action strings - `java.lang.String`"
  (^MalmoActionSpaceDiscrete [^java.lang.String actions]
    (new MalmoActionSpaceDiscrete actions)))

