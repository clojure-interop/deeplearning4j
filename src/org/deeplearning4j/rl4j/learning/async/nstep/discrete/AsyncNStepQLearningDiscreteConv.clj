(ns org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscreteConv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.nstep.discrete AsyncNStepQLearningDiscreteConv]))

(defn ->async-n-step-q-learning-discrete-conv
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  dqn - `org.deeplearning4j.rl4j.network.dqn.IDQN`
  hpconf - `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`
  conf - `org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^AsyncNStepQLearningDiscreteConv [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.dqn.IDQN dqn ^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration hpconf ^org.deeplearning4j.rl4j.learning.async.nstep.discrete.AsyncNStepQLearningDiscrete$AsyncNStepQLConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new AsyncNStepQLearningDiscreteConv mdp dqn hpconf conf data-manager)))

(defn new-thread
  "i - `int`

  returns: `org.deeplearning4j.rl4j.learning.async.AsyncThread`"
  (^org.deeplearning4j.rl4j.learning.async.AsyncThread [^AsyncNStepQLearningDiscreteConv this ^Integer i]
    (-> this (.newThread i))))

