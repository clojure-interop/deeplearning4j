(ns org.deeplearning4j.rl4j.mdp.vizdoom.Basic
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.vizdoom Basic]))

(defn ->basic
  "Constructor.

  render - `boolean`"
  (^Basic [^Boolean render]
    (new Basic render)))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration [^Basic this]
    (-> this (.getConfiguration))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.Basic`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.Basic [^Basic this]
    (-> this (.newInstance))))

