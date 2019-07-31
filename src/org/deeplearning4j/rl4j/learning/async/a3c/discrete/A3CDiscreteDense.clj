(ns org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscreteDense
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.a3c.discrete A3CDiscreteDense]))

(defn ->a-3-c-discrete-dense
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  i-actor-critic - `org.deeplearning4j.rl4j.network.ac.IActorCritic`
  conf - `org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^A3CDiscreteDense [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.ac.IActorCritic i-actor-critic ^org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new A3CDiscreteDense mdp i-actor-critic conf data-manager)))

