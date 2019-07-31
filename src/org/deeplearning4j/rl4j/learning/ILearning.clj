(ns org.deeplearning4j.rl4j.learning.ILearning
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning ILearning]))

(defn get-policy
  "returns: `org.deeplearning4j.rl4j.policy.Policy<O,A>`"
  (^org.deeplearning4j.rl4j.policy.Policy [^ILearning this]
    (-> this (.getPolicy))))

(defn train
  ""
  ([^ILearning this]
    (-> this (.train))))

(defn get-step-counter
  "returns: `int`"
  (^Integer [^ILearning this]
    (-> this (.getStepCounter))))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.learning.ILearning$LConfiguration`"
  (^org.deeplearning4j.rl4j.learning.ILearning$LConfiguration [^ILearning this]
    (-> this (.getConfiguration))))

(defn get-mdp
  "returns: `org.deeplearning4j.rl4j.mdp.MDP<O,A,AS>`"
  (^org.deeplearning4j.rl4j.mdp.MDP [^ILearning this]
    (-> this (.getMdp))))

