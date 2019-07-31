(ns org.deeplearning4j.rl4j.util.DataManager$StatEntry
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.util DataManager$StatEntry]))

(defn get-epoch-counter
  "returns: `int`"
  (^Integer [^DataManager$StatEntry this]
    (-> this (.getEpochCounter))))

(defn get-step-counter
  "returns: `int`"
  (^Integer [^DataManager$StatEntry this]
    (-> this (.getStepCounter))))

(defn get-reward
  "returns: `double`"
  (^Double [^DataManager$StatEntry this]
    (-> this (.getReward))))

