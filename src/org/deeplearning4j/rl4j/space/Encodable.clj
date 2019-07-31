(ns org.deeplearning4j.rl4j.space.Encodable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space Encodable]))

(defn to-array
  "$
  encodes all the information of an Observation in an array double and can be used as input of a DQN directly

  returns: the encoded informations - `double[]`"
  ([^Encodable this]
    (-> this (.toArray))))

