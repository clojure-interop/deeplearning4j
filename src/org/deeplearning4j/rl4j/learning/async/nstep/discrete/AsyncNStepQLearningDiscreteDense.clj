(ns org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscreteDense
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.nstep.discrete AsyncNStepQLearningDiscreteDense]))

(defn ->async-n-step-q-learning-discrete-dense
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  dqn - `org.deeplearning4j.rl4j.network.dqn.IDQN`
  conf - `org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^AsyncNStepQLearningDiscreteDense [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.dqn.IDQN dqn ^org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new AsyncNStepQLearningDiscreteDense mdp dqn conf data-manager)))

