(ns org.deeplearning4j.rl4j.policy.Policy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.policy Policy]))

(defn ->policy
  "Constructor."
  (^Policy []
    (new Policy )))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.NeuralNet`"
  (^org.deeplearning4j.rl4j.network.NeuralNet [^Policy this]
    (-> this (.getNeuralNet))))

(defn next-action
  "input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `A`"
  ([^Policy this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.nextAction input))))

(defn play
  "mdp - `org.deeplearning4j.rl4j.mdp.MDP`
  conf - `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`

  returns: `<AS extends org.deeplearning4j.rl4j.space.ActionSpace<A>> double`"
  ([^Policy this ^org.deeplearning4j.rl4j.mdp.MDP mdp ^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration conf]
    (-> this (.play mdp conf)))
  ([^Policy this ^org.deeplearning4j.rl4j.mdp.MDP mdp]
    (-> this (.play mdp))))

