(ns org.deeplearning4j.rl4j.learning.ILearning$LConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning ILearning$LConfiguration]))

(defn get-seed
  "returns: `int`"
  (^Integer [^ILearning$LConfiguration this]
    (-> this (.getSeed))))

(defn get-max-epoch-step
  "returns: `int`"
  (^Integer [^ILearning$LConfiguration this]
    (-> this (.getMaxEpochStep))))

(defn get-max-step
  "returns: `int`"
  (^Integer [^ILearning$LConfiguration this]
    (-> this (.getMaxStep))))

(defn get-gamma
  "returns: `double`"
  (^Double [^ILearning$LConfiguration this]
    (-> this (.getGamma))))

