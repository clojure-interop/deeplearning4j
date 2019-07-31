(ns org.deeplearning4j.rl4j.mdp.vizdoom.TakeCover
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.vizdoom TakeCover]))

(defn ->take-cover
  "Constructor.

  render - `boolean`"
  (^TakeCover [^Boolean render]
    (new TakeCover render)))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration [^TakeCover this]
    (-> this (.getConfiguration))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.TakeCover`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.TakeCover [^TakeCover this]
    (-> this (.newInstance))))

