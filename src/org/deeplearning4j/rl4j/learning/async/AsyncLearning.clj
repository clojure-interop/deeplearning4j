(ns org.deeplearning4j.rl4j.learning.async.AsyncLearning
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async AsyncLearning]))

(defn ->async-learning
  "Constructor.

  conf - `org.deeplearning4j.rl4j.learning.async.AsyncConfiguration`"
  (^AsyncLearning [^org.deeplearning4j.rl4j.learning.async.AsyncConfiguration conf]
    (new AsyncLearning conf)))

(defn get-configuration
  "returns: `org.deeplearning4j.rl4j.learning.async.AsyncConfiguration`"
  (^org.deeplearning4j.rl4j.learning.async.AsyncConfiguration [^AsyncLearning this]
    (-> this (.getConfiguration))))

(defn launch-threads
  ""
  ([^AsyncLearning this]
    (-> this (.launchThreads))))

(defn get-step-counter
  "returns: `int`"
  (^Integer [^AsyncLearning this]
    (-> this (.getStepCounter))))

(defn train
  ""
  ([^AsyncLearning this]
    (-> this (.train))))

