(ns org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CThreadDiscrete
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.a3c.discrete A3CThreadDiscrete]))

(defn ->a-3-c-thread-discrete
  "Constructor.

  mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  async-global - `org.deeplearning4j.rl4j.learning.async.AsyncGlobal`
  a-3cc - `org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration`
  thread-number - `int`
  data-manager - `org.deeplearning4j.rl4j.util.DataManager`"
  (^A3CThreadDiscrete [^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.learning.async.AsyncGlobal async-global ^org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration a-3cc ^Integer thread-number ^org.deeplearning4j.rl4j.util.DataManager data-manager]
    (new A3CThreadDiscrete mdp async-global a-3cc thread-number data-manager)))

(defn calc-gradient
  "calc the gradients based on the n-step rewards

  iac - `org.deeplearning4j.rl4j.network.ac.IActorCritic`
  rewards - `java.util.Stack`

  returns: `org.deeplearning4j.nn.gradient.Gradient[]`"
  ([^A3CThreadDiscrete this ^org.deeplearning4j.rl4j.network.ac.IActorCritic iac ^java.util.Stack rewards]
    (-> this (.calcGradient iac rewards))))

