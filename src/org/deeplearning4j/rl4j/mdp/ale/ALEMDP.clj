(ns org.deeplearning4j.rl4j.mdp.ale.ALEMDP
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.ale ALEMDP]))

(defn ->alemdp
  "Constructor.

  rom-file - `java.lang.String`
  render - `boolean`
  configuration - `org.deeplearning4j.rl4j.mdp.ale.ALEMDP$Configuration`"
  (^ALEMDP [^java.lang.String rom-file ^Boolean render ^org.deeplearning4j.rl4j.mdp.ale.ALEMDP$Configuration configuration]
    (new ALEMDP rom-file render configuration))
  (^ALEMDP [^java.lang.String rom-file ^Boolean render]
    (new ALEMDP rom-file render))
  (^ALEMDP [^java.lang.String rom-file]
    (new ALEMDP rom-file)))

(defn setup-game
  ""
  ([^ALEMDP this]
    (-> this (.setupGame))))

(defn done?
  "returns: `boolean`"
  (^Boolean [^ALEMDP this]
    (-> this (.isDone))))

(defn reset
  "returns: `org.deeplearning4j.rl4j.mdp.ale.ALEMDP$GameScreen`"
  (^org.deeplearning4j.rl4j.mdp.ale.ALEMDP$GameScreen [^ALEMDP this]
    (-> this (.reset))))

(defn close
  ""
  ([^ALEMDP this]
    (-> this (.close))))

(defn step
  "action - `java.lang.Integer`

  returns: `org.deeplearning4j.gym.StepReply<org.deeplearning4j.rl4j.mdp.ale.ALEMDP$GameScreen>`"
  (^org.deeplearning4j.gym.StepReply [^ALEMDP this ^java.lang.Integer action]
    (-> this (.step action))))

(defn get-observation-space
  "returns: `org.deeplearning4j.rl4j.space.ObservationSpace<org.deeplearning4j.rl4j.mdp.ale.ALEMDP$GameScreen>`"
  (^org.deeplearning4j.rl4j.space.ObservationSpace [^ALEMDP this]
    (-> this (.getObservationSpace))))

(defn get-action-space
  "returns: `org.deeplearning4j.rl4j.space.DiscreteSpace`"
  (^org.deeplearning4j.rl4j.space.DiscreteSpace [^ALEMDP this]
    (-> this (.getActionSpace))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.ale.ALEMDP`"
  (^org.deeplearning4j.rl4j.mdp.ale.ALEMDP [^ALEMDP this]
    (-> this (.newInstance))))

