(ns org.deeplearning4j.malmo.MalmoResetHandler
  "Callback interface for Malmo MDP reset events"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoResetHandler]))

(defn on-reset
  "malmo-env - `org.deeplearning4j.malmo.MalmoEnv`"
  ([^MalmoResetHandler this ^org.deeplearning4j.malmo.MalmoEnv malmo-env]
    (-> this (.onReset malmo-env))))

