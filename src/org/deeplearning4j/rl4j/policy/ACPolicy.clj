(ns org.deeplearning4j.rl4j.policy.ACPolicy
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.policy ACPolicy]))

(defn ->ac-policy
  "Constructor.

  i-actor-critic - `org.deeplearning4j.rl4j.network.ac.IActorCritic`
  rd - `java.util.Random`"
  (^ACPolicy [^org.deeplearning4j.rl4j.network.ac.IActorCritic i-actor-critic ^java.util.Random rd]
    (new ACPolicy i-actor-critic rd))
  (^ACPolicy [^org.deeplearning4j.rl4j.network.ac.IActorCritic i-actor-critic]
    (new ACPolicy i-actor-critic)))

(defn *load
  "path-value - `java.lang.String`
  path-policy - `java.lang.String`
  rd - `java.util.Random`

  returns: `<O extends org.deeplearning4j.rl4j.space.Encodable> org.deeplearning4j.rl4j.policy.ACPolicy<O>`

  throws: java.io.IOException"
  ([^java.lang.String path-value ^java.lang.String path-policy ^java.util.Random rd]
    (ACPolicy/load path-value path-policy rd))
  ([^java.lang.String path ^java.util.Random rd]
    (ACPolicy/load path rd))
  ([^java.lang.String path]
    (ACPolicy/load path)))

(defn get-neural-net
  "returns: `org.deeplearning4j.rl4j.network.ac.IActorCritic`"
  (^org.deeplearning4j.rl4j.network.ac.IActorCritic [^ACPolicy this]
    (-> this (.getNeuralNet))))

(defn next-action
  "input - `org.nd4j.linalg.api.ndarray.INDArray`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^ACPolicy this ^org.nd4j.linalg.api.ndarray.INDArray input]
    (-> this (.nextAction input))))

(defn save
  "filename-value - `java.lang.String`
  filename-policy - `java.lang.String`

  throws: java.io.IOException"
  ([^ACPolicy this ^java.lang.String filename-value ^java.lang.String filename-policy]
    (-> this (.save filename-value filename-policy)))
  ([^ACPolicy this ^java.lang.String filename]
    (-> this (.save filename))))

