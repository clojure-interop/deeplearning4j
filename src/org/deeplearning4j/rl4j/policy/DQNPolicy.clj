(ns org.deeplearning4j.rl4j.policy.DQNPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.policy DQNPolicy]))

(defn ->dqn-policy
  "Constructor."
  (^DQNPolicy []
    (new DQNPolicy )))

(defn *load
  "path - `java.lang.String`

  returns: `<O extends org.deeplearning4j.rl4j.space.Encodable> org.deeplearning4j.rl4j.policy.DQNPolicy<O>`

  throws: java.io.IOException"
  ([^java.lang.String path]
    (DQNPolicy/load path)))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.dqn.IDQN`"
  (^org.deeplearning4j.rl4j.network.dqn.IDQN [^DQNPolicy this]
    (-> this (.getNeuralNet))))

(defn next-action
  "input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^DQNPolicy this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.nextAction input))))

(defn save
  "filename - `java.lang.String`

  throws: java.io.IOException"
  ([^DQNPolicy this ^java.lang.String filename]
    (-> this (.save filename))))

