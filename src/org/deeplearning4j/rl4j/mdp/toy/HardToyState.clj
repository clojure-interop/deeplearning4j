(ns org.deeplearning4j.rl4j.mdp.toy.HardToyState
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.toy HardToyState]))

(defn ->hard-toy-state
  "Constructor."
  (^HardToyState []
    (new HardToyState )))

(defn to-array
  "Description copied from interface: Encodable

  returns: the encoded informations - `double[]`"
  ([^HardToyState this]
    (-> this (.toArray))))

