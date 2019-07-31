(ns org.deeplearning4j.rl4j.space.Box
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space Box]))

(defn ->box
  "Constructor.

  arr - `org.json.JSONArray`"
  (^Box [^org.json.JSONArray arr]
    (new Box arr)))

(defn to-array
  "Description copied from interface: Encodable

  returns: the encoded informations - `double[]`"
  ([^Box this]
    (-> this (.toArray))))

