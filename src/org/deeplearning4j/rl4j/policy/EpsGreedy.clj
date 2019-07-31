(ns org.deeplearning4j.rl4j.policy.EpsGreedy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.policy EpsGreedy]))

(defn ->eps-greedy
  "Constructor."
  (^EpsGreedy []
    (new EpsGreedy )))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.NeuralNet`"
  (^org.deeplearning4j.rl4j.network.NeuralNet [^EpsGreedy this]
    (-> this (.getNeuralNet))))

(defn next-action
  "input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `A`"
  ([^EpsGreedy this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.nextAction input))))

(defn get-epsilon
  "returns: `float`"
  (^Float [^EpsGreedy this]
    (-> this (.getEpsilon))))

