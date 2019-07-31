(ns org.deeplearning4j.rl4j.space.DiscreteSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space DiscreteSpace]))

(defn ->discrete-space
  "Constructor.

  size - `int`"
  (^DiscreteSpace [^Integer size]
    (new DiscreteSpace size)))

(defn random-action
  "returns: A randomly uniformly sampled action, - `java.lang.Integer`"
  (^java.lang.Integer [^DiscreteSpace this]
    (-> this (.randomAction))))

(defn set-seed
  "seed - `int`"
  ([^DiscreteSpace this ^Integer seed]
    (-> this (.setSeed seed))))

(defn encode
  "a - `java.lang.Integer`

  returns: `java.lang.Object`"
  (^java.lang.Object [^DiscreteSpace this ^java.lang.Integer a]
    (-> this (.encode a))))

(defn no-op
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^DiscreteSpace this]
    (-> this (.noOp))))

