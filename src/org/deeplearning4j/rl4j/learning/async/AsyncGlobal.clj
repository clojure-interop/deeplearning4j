(ns org.deeplearning4j.rl4j.learning.async.AsyncGlobal
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async AsyncGlobal]))

(defn ->async-global
  "Constructor.

  initial - `NN`
  a-3cc - `org.deeplearning4j.rl4j.learning.async.AsyncConfiguration`"
  (^AsyncGlobal [initial ^org.deeplearning4j.rl4j.learning.async.AsyncConfiguration a-3cc]
    (new AsyncGlobal initial a-3cc)))

(defn training-complete?
  "returns: `boolean`"
  (^Boolean [^AsyncGlobal this]
    (-> this (.isTrainingComplete))))

(defn enqueue
  "gradient - `org.deeplearning4j.nn.gradient.Gradient[]`
  nstep - `java.lang.Integer`"
  ([^AsyncGlobal this gradient ^java.lang.Integer nstep]
    (-> this (.enqueue gradient nstep))))

(defn run
  ""
  ([^AsyncGlobal this]
    (-> this (.run))))

