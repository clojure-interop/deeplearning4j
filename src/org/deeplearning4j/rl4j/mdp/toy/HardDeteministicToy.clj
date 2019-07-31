(ns org.deeplearning4j.rl4j.mdp.toy.HardDeteministicToy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.toy HardDeteministicToy]))

(defn ->hard-deteministic-toy
  "Constructor."
  (^HardDeteministicToy []
    (new HardDeteministicToy )))

(defn *print-test
  "idqn - `org.deeplearning4j.rl4j.network.dqn.IDQN`"
  ([^org.deeplearning4j.rl4j.network.dqn.IDQN idqn]
    (HardDeteministicToy/printTest idqn)))

(defn *max-index
  "values - `double[]`

  returns: `int`"
  (^Integer [values]
    (HardDeteministicToy/maxIndex values)))

(defn *gen-toy-states
  "size - `int`
  seed - `int`

  returns: `org.deeplearning4j.rl4j.mdp.toy.HardToyState[]`"
  ([^Integer size ^Integer seed]
    (HardDeteministicToy/genToyStates size seed)))

(defn close
  ""
  ([^HardDeteministicToy this]
    (-> this (.close))))

(defn done?
  "returns: `boolean`"
  (^Boolean [^HardDeteministicToy this]
    (-> this (.isDone))))

(defn reset
  "returns: `org.deeplearning4j.rl4j.mdp.toy.HardToyState`"
  (^org.deeplearning4j.rl4j.mdp.toy.HardToyState [^HardDeteministicToy this]
    (-> this (.reset))))

(defn step
  "a - `java.lang.Integer`

  returns: `org.deeplearning4j.gym.StepReply<org.deeplearning4j.rl4j.mdp.toy.HardToyState>`"
  (^org.deeplearning4j.gym.StepReply [^HardDeteministicToy this ^java.lang.Integer a]
    (-> this (.step a))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.toy.HardDeteministicToy`"
  (^org.deeplearning4j.rl4j.mdp.toy.HardDeteministicToy [^HardDeteministicToy this]
    (-> this (.newInstance))))

