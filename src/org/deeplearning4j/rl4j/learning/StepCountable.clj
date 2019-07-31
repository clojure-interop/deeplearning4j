(ns org.deeplearning4j.rl4j.learning.StepCountable
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning StepCountable]))

(defn get-step-counter
  "returns: `int`"
  (^Integer [^StepCountable this]
    (-> this (.getStepCounter))))

