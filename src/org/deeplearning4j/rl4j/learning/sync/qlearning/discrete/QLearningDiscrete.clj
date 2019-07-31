(ns org.deeplearning4j.rl4j.learning.sync.qlearning.discrete.QLearningDiscrete
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync.qlearning.discrete QLearningDiscrete]))

(defn ->q-learning-discrete
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  dqn - `org.deeplearning4j.rl4j.network.dqn.IDQN`
  conf - `org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`
  epsilon-nb-step - `int`"
  (^QLearningDiscrete [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.dqn.IDQN dqn ^org.deeplearning4j.rl4j.learning.sync.qlearning.QLearning$QLConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager ^Integer epsilon-nb-step]
    (new QLearningDiscrete mdp dqn conf data-manager epsilon-nb-step)))

(defn post-epoch
  ""
  ([^QLearningDiscrete this]
    (-> this (.postEpoch))))

(defn pre-epoch
  ""
  ([^QLearningDiscrete this]
    (-> this (.preEpoch))))

