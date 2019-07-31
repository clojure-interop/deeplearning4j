(ns org.deeplearning4j.rl4j.mdp.toy.SimpleToy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.mdp.toy SimpleToy]))

(defn ->simple-toy
  "Constructor.

  max-step - `int`"
  (^SimpleToy [^Integer max-step]
    (new SimpleToy max-step)))

(defn print-test
  "max-step - `int`"
  ([^SimpleToy this ^Integer max-step]
    (-> this (.printTest max-step))))

(defn close
  ""
  ([^SimpleToy this]
    (-> this (.close))))

(defn done?
  "returns: `boolean`"
  (^Boolean [^SimpleToy this]
    (-> this (.isDone))))

(defn reset
  "returns: `org.deeplearning4j.rl4j.mdp.toy.SimpleToyState`"
  (^org.deeplearning4j.rl4j.mdp.toy.SimpleToyState [^SimpleToy this]
    (-> this (.reset))))

(defn step
  "a - `java.lang.Integer`

  returns: `org.deeplearning4j.gym.StepReply<org.deeplearning4j.rl4j.mdp.toy.SimpleToyState>`"
  (^org.deeplearning4j.gym.StepReply [^SimpleToy this ^java.lang.Integer a]
    (-> this (.step a))))

(defn new-instance
  "returns: `org.deeplearning4j.rl4j.mdp.toy.SimpleToy`"
  (^org.deeplearning4j.rl4j.mdp.toy.SimpleToy [^SimpleToy this]
    (-> this (.newInstance))))

