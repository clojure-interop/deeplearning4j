(ns org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.a3c.discrete A3CDiscrete]))

(defn ->a-3-c-discrete
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  i-actor-critic - `org.deeplearning4j.rl4j.network.ac.IActorCritic`
  conf - `org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^A3CDiscrete [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.network.ac.IActorCritic i-actor-critic ^org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration conf ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new A3CDiscrete mdp i-actor-critic conf data-manager)))

(defn configuration
  "Instance Constant.

  type: org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration"
  (^org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration [^A3CDiscrete this]
    (-> this .-configuration)))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.ac.IActorCritic`"
  (^org.deeplearning4j.rl4j.network.ac.IActorCritic [^A3CDiscrete this]
    (-> this (.getNeuralNet))))

