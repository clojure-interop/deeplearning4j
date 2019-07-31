(ns org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$GameScreen
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.vizdoom VizDoom$GameScreen]))

(defn ->game-screen
  "Constructor.

  screen - `byte[]`"
  (^VizDoom$GameScreen [screen]
    (new VizDoom$GameScreen screen)))

(defn to-array
  "Description copied from interface: Encodable

  returns: the encoded informations - `double[]`"
  ([^VizDoom$GameScreen this]
    (-> this (.toArray))))

