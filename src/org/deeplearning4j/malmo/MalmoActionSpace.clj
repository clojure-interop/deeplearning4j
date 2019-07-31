(ns org.deeplearning4j.malmo.MalmoActionSpace
  "Abstract base class for all Malmo-specific action spaces"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.malmo MalmoActionSpace]))

(defn encode
  "action - `java.lang.Integer`

  returns: `java.lang.Object`"
  (^java.lang.Object [^MalmoActionSpace this ^java.lang.Integer action]
    (-> this (.encode action))))

(defn no-op
  "returns: `java.lang.Integer`"
  (^java.lang.Integer [^MalmoActionSpace this]
    (-> this (.noOp))))

(defn set-random-seed
  "Sets the seed used for random generation of actions

  seed - random number generator seed - `long`"
  ([^MalmoActionSpace this ^Long seed]
    (-> this (.setRandomSeed seed))))

