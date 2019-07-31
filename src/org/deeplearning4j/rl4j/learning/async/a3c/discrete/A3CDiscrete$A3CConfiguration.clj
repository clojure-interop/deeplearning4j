(ns org.deeplearning4j.rl4j.learning.async.a3c.discrete.A3CDiscrete$A3CConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async.a3c.discrete A3CDiscrete$A3CConfiguration]))

(defn ->a-3-c-configuration
  "Constructor."
  (^A3CDiscrete$A3CConfiguration []
    (new A3CDiscrete$A3CConfiguration )))

(defn get-target-dqn-update-freq
  "returns: `int`"
  (^Integer [^A3CDiscrete$A3CConfiguration this]
    (-> this (.getTargetDqnUpdateFreq))))

