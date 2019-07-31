(ns org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.vizdoom VizDoom]))

(defn ->viz-doom
  "Constructor.

  render - `boolean`"
  (^VizDoom [^Boolean render]
    (new VizDoom render))
  (^VizDoom []
    (new VizDoom )))

(def *-doom-root
  "Static Constant.

  type: java.lang.String"
  VizDoom/DOOM_ROOT)

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom [^VizDoom this]
    (-> this (.newInstance))))

(defn reset
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$GameScreen`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$GameScreen [^VizDoom this]
    (-> this (.reset))))

(defn get-action-space
  "returns: `org.deeplearning4j.rl4j.space.DiscreteSpace`"
  (^org.deeplearning4j.rl4j.space.DiscreteSpace [^VizDoom this]
    (-> this (.getActionSpace))))

(defn get-observation-space
  "returns: `org.deeplearning4j.rl4j.space.ObservationSpace<org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$GameScreen>`"
  (^org.deeplearning4j.rl4j.space.ObservationSpace [^VizDoom this]
    (-> this (.getObservationSpace))))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration`"
  (^org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$Configuration [^VizDoom this]
    (-> this (.getConfiguration))))

(defn close
  ""
  ([^VizDoom this]
    (-> this (.close))))

(defn setup-game
  ""
  ([^VizDoom this]
    (-> this (.setupGame))))

(defn done?
  "returns: `boolean`"
  (^Boolean [^VizDoom this]
    (-> this (.isDone))))

(defn step
  "action - `java.lang.Integer`

  returns: `org.deeplearning4j.gym.StepReply<org.deeplearning4j.rl4j.mdp.vizdoom.VizDoom$GameScreen>`"
  (^org.deeplearning4j.gym.StepReply [^VizDoom this ^java.lang.Integer action]
    (-> this (.step action))))

