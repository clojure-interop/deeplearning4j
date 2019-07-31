(ns org.deeplearning4j.rl4j.policy.BoltzmannQ
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.policy BoltzmannQ]))

(defn ->boltzmann-q
  "Constructor."
  (^BoltzmannQ []
    (new BoltzmannQ )))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.dqn.IDQN`"
  (^org.deeplearning4j.rl4j.network.dqn.IDQN [^BoltzmannQ this]
    (-> this (.getNeuralNet))))

(defn next-action
  "input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^BoltzmannQ this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.nextAction input))))

