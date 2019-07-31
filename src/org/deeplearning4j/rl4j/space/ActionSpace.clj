(ns org.deeplearning4j.rl4j.space.ActionSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space ActionSpace]))

(defn random-action
  "returns: A randomly uniformly sampled action, - `A`"
  ([^ActionSpace this]
    (-> this (.randomAction))))

(defn set-seed
  "seed - `int`"
  ([^ActionSpace this ^Integer seed]
    (-> this (.setSeed seed))))

(defn encode
  "action - `A`

  returns: `java.lang.Object`"
  (^java.lang.Object [^ActionSpace this action]
    (-> this (.encode action))))

(defn get-size
  "returns: `int`"
  (^Integer [^ActionSpace this]
    (-> this (.getSize))))

(defn no-op
  "returns: `A`"
  ([^ActionSpace this]
    (-> this (.noOp))))

