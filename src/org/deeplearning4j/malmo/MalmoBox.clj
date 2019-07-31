(ns org.deeplearning4j.malmo.MalmoBox
  "Encodable state as a simple value array similar to Gym Box model, but without a JSON constructor"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoBox]))

(defn ->malmo-box
  "Constructor.

  Construct state from an array of doubles

  value - state values - `double`"
  (^MalmoBox [^Double value]
    (new MalmoBox value)))

(defn to-array
  "Description copied from interface: Encodable

  returns: the encoded informations - `double[]`"
  ([^MalmoBox this]
    (-> this (.toArray))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MalmoBox this]
    (-> this (.toString))))

