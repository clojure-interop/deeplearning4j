(ns org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscreteConv
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.a3c.discrete A3CDiscreteConv]))

(defn ->a-3-c-discrete-conv
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  i-actor-critic - `org.deeplearning4j.rl4j.network.ac.IActorCritic`
  hpconf - `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`
  conf - `org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^A3CDiscreteConv [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.ac.IActorCritic i-actor-critic ^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration hpconf ^org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new A3CDiscreteConv mdp i-actor-critic hpconf conf data-manager)))

(defn new-thread
  "i - `int`

  returns: `org.deeplearning4j.rl4j.learning.async.AsyncThread`"
  (^org.deeplearning4j.rl4j.learning.async.AsyncThread [^A3CDiscreteConv this ^Integer i]
    (-> this (.newThread i))))

