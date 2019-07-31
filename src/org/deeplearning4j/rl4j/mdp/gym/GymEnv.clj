(ns org.deeplearning4j.rl4j.mdp.gym.GymEnv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.gym GymEnv]))

(defn ->gym-env
  "Constructor.

  env-id - `java.lang.String`
  render - `boolean`
  monitor - `boolean`
  actions - `int[]`"
  (^GymEnv [^java.lang.String env-id ^Boolean render ^Boolean monitor actions]
    (new GymEnv env-id render monitor actions))
  (^GymEnv [^java.lang.String env-id ^Boolean render ^Boolean monitor]
    (new GymEnv env-id render monitor)))

(def *-gym-monitor-dir
  "Static Constant.

  type: java.lang.String"
  GymEnv/GYM_MONITOR_DIR)

(defn get-observation-space
  "returns: `org.deeplearning4j.rl4j.space.ObservationSpace<O>`"
  (^org.deeplearning4j.rl4j.space.ObservationSpace [^GymEnv this]
    (-> this (.getObservationSpace))))

(defn get-action-space
  "returns: `AS`"
  ([^GymEnv this]
    (-> this (.getActionSpace))))

(defn step
  "action - `A`

  returns: `org.deeplearning4j.gym.StepReply<O>`"
  (^org.deeplearning4j.gym.StepReply [^GymEnv this action]
    (-> this (.step action))))

(defn done?
  "returns: `boolean`"
  (^Boolean [^GymEnv this]
    (-> this (.isDone))))

(defn reset
  "returns: `O`"
  ([^GymEnv this]
    (-> this (.reset))))

(defn upload
  "api-key - `java.lang.String`"
  ([^GymEnv this ^java.lang.String api-key]
    (-> this (.upload api-key))))

(defn close
  ""
  ([^GymEnv this]
    (-> this (.close))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.gym.GymEnv<O,A,AS>`"
  (^org.deeplearning4j.rl4j.mdp.gym.GymEnv [^GymEnv this]
    (-> this (.newInstance))))

