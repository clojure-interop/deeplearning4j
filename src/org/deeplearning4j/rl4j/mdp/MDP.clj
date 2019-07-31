(ns org.deeplearning4j.rl4j.mdp.MDP
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp MDP]))

(defn get-observation-space
  "returns: `org.deeplearning4j.rl4j.space.ObservationSpace<O>`"
  (^org.deeplearning4j.rl4j.space.ObservationSpace [^MDP this]
    (-> this (.getObservationSpace))))

(defn get-action-space
  "returns: `AS`"
  ([^MDP this]
    (-> this (.getActionSpace))))

(defn reset
  "returns: `O`"
  ([^MDP this]
    (-> this (.reset))))

(defn close
  ""
  ([^MDP this]
    (-> this (.close))))

(defn step
  "action - `A`

  returns: `org.deeplearning4j.gym.StepReply<O>`"
  (^org.deeplearning4j.gym.StepReply [^MDP this action]
    (-> this (.step action))))

(defn done?
  "returns: `boolean`"
  (^Boolean [^MDP this]
    (-> this (.isDone))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.MDP<O,A,AS>`"
  (^org.deeplearning4j.rl4j.mdp.MDP [^MDP this]
    (-> this (.newInstance))))

