(ns org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningThreadDiscrete
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.nstep.discrete AsyncNStepQLearningThreadDiscrete]))

(defn ->async-n-step-q-learning-thread-discrete
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  async-global - `org.deeplearning4j.rl4j.learning.async.AsyncGlobal`
  conf - `org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration`
  thread-number - `int`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^AsyncNStepQLearningThreadDiscrete [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.learning.async.AsyncGlobal async-global ^org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration conf ^Integer thread-number ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new AsyncNStepQLearningThreadDiscrete mdp async-global conf thread-number data-manager)))

(defn get-policy
  "nn - `org.deeplearning4j.rl4j.network.dqn.IDQN`

  returns: `org.deeplearning4j.rl4j.policy.Policy<O,java.lang.Integer>`"
  (^org.deeplearning4j.rl4j.policy.Policy [^AsyncNStepQLearningThreadDiscrete this ^org.deeplearning4j.rl4j.network.dqn.IDQN nn]
    (-> this (.getPolicy nn))))

(defn calc-gradient
  "current - `org.deeplearning4j.rl4j.network.dqn.IDQN`
  rewards - `java.util.Stack`

  returns: `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^AsyncNStepQLearningThreadDiscrete this ^org.deeplearning4j.rl4j.network.dqn.IDQN current ^java.util.Stack rewards]
    (-> this (.calcGradient current rewards))))

