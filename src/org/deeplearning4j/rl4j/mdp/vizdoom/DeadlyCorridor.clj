(ns org.deeplearning4j.rl4j.mdp.vizdoom.DeadlyCorridor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.vizdoom DeadlyCorridor]))

(defn ->deadly-corridor
  "Constructor.

  render - `boolean`"
  (^DeadlyCorridor [^Boolean render]
    (new DeadlyCorridor render)))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration [^DeadlyCorridor this]
    (-> this (.getConfiguration))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.DeadlyCorridor`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.DeadlyCorridor [^DeadlyCorridor this]
    (-> this (.newInstance))))

