(ns org.deeplearning4j.rl4j.mdp.toy.SimpleToyState
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.toy SimpleToyState]))

(defn ->simple-toy-state
  "Constructor."
  (^SimpleToyState []
    (new SimpleToyState )))

(defn to-array
  "Description copied from interface: Encodable

  returns: the encoded informations - `double[]`"
  ([^SimpleToyState this]
    (-> this (.toArray))))

