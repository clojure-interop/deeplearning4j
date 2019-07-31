(ns org.deeplearning4j.rl4j.learning.sync.qlearning.discrete.QLearningDiscreteDense
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync.qlearning.discrete QLearningDiscreteDense]))

(defn ->q-learning-discrete-dense
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  dqn - `org.deeplearning4j.rl4j.network.dqn.IDQN`
  conf - `org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^QLearningDiscreteDense [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.dqn.IDQN dqn ^org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new QLearningDiscreteDense mdp dqn conf data-manager)))

