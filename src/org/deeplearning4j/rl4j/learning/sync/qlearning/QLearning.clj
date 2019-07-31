(ns org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync.qlearning QLearning]))

(defn ->q-learning
  "Constructor.

  conf - `org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration`"
  (^QLearning [^org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration conf]
    (new QLearning conf)))

(defn get-mdp
  "returns: `org.deeplearning4j.rl4j.mdp.MDP<O,A,AS>`"
  (^org.deeplearning4j.rl4j.mdp.MDP [^QLearning this]
    (-> this (.getMdp))))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.dqn.IDQN`"
  (^org.deeplearning4j.rl4j.network.dqn.IDQN [^QLearning this]
    (-> this (.getNeuralNet))))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration`"
  (^org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration [^QLearning this]
    (-> this (.getConfiguration))))

