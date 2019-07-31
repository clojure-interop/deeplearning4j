(ns org.deeplearning4j.rl4j.mdp.vizdoom.PredictPosition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.vizdoom PredictPosition]))

(defn ->predict-position
  "Constructor.

  render - `boolean`"
  (^PredictPosition [^Boolean render]
    (new PredictPosition render)))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration [^PredictPosition this]
    (-> this (.getConfiguration))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.PredictPosition`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.PredictPosition [^PredictPosition this]
    (-> this (.newInstance))))

