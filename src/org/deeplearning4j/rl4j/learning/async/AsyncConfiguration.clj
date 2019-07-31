(ns org.deeplearning4j.rl4j.learning.async.AsyncConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async AsyncConfiguration]))

(defn get-reward-factor
  "returns: `double`"
  (^Double [^AsyncConfiguration this]
    (-> this (.getRewardFactor))))

(defn get-target-dqn-update-freq
  "returns: `int`"
  (^Integer [^AsyncConfiguration this]
    (-> this (.getTargetDqnUpdateFreq))))

(defn get-gamma
  "returns: `double`"
  (^Double [^AsyncConfiguration this]
    (-> this (.getGamma))))

(defn get-update-start
  "returns: `int`"
  (^Integer [^AsyncConfiguration this]
    (-> this (.getUpdateStart))))

(defn get-max-epoch-step
  "returns: `int`"
  (^Integer [^AsyncConfiguration this]
    (-> this (.getMaxEpochStep))))

(defn get-seed
  "returns: `int`"
  (^Integer [^AsyncConfiguration this]
    (-> this (.getSeed))))

(defn get-num-thread
  "returns: `int`"
  (^Integer [^AsyncConfiguration this]
    (-> this (.getNumThread))))

(defn get-max-step
  "returns: `int`"
  (^Integer [^AsyncConfiguration this]
    (-> this (.getMaxStep))))

(defn get-error-clamp
  "returns: `double`"
  (^Double [^AsyncConfiguration this]
    (-> this (.getErrorClamp))))

(defn get-nstep
  "returns: `int`"
  (^Integer [^AsyncConfiguration this]
    (-> this (.getNstep))))

