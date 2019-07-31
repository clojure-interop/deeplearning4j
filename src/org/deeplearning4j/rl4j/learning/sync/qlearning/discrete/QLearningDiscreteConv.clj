(ns org.deeplearning4j.rl4j.learning.sync.qlearning.discrete.QLearningDiscreteConv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync.qlearning.discrete QLearningDiscreteConv]))

(defn ->q-learning-discrete-conv
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  dqn - `org.deeplearning4j.rl4j.network.dqn.IDQN`
  hpconf - `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`
  conf - `org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^QLearningDiscreteConv [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.dqn.IDQN dqn ^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration hpconf ^org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new QLearningDiscreteConv mdp dqn hpconf conf data-manager)))

