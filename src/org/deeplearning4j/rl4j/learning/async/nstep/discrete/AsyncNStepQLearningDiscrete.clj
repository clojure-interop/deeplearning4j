(ns org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.nstep.discrete AsyncNStepQLearningDiscrete]))

(defn ->async-n-step-q-learning-discrete
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  dqn - `org.deeplearning4j.rl4j.network.dqn.IDQN`
  conf - `org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^AsyncNStepQLearningDiscrete [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.dqn.IDQN dqn ^org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new AsyncNStepQLearningDiscrete mdp dqn conf data-manager)))

(defn configuration
  "Instance Constant.

  type: org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration"
  (^org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration [^AsyncNStepQLearningDiscrete this]
    (-> this .-configuration)))

(defn new-thread
  "i - `int`

  returns: `org.deeplearning4j.rl4j.learning.async.AsyncThread`"
  (^org.deeplearning4j.rl4j.learning.async.AsyncThread [^AsyncNStepQLearningDiscrete this ^Integer i]
    (-> this (.newThread i))))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.dqn.IDQN`"
  (^org.deeplearning4j.rl4j.network.dqn.IDQN [^AsyncNStepQLearningDiscrete this]
    (-> this (.getNeuralNet))))

(defn get-policy
  "returns: `org.deeplearning4j.rl4j.policy.Policy<O,java.lang.Integer>`"
  (^org.deeplearning4j.rl4j.policy.Policy [^AsyncNStepQLearningDiscrete this]
    (-> this (.getPolicy))))

