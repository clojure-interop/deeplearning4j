(ns org.deeplearning4j.rl4j.learning.sync.IExpReplay
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync IExpReplay]))

(defn get-batch
  "returns: a batch of uniformly sampled transitions - `java.util.ArrayList<org.deeplearning4j.rl4j.learning.sync.Transition<A>>`"
  (^java.util.ArrayList [^IExpReplay this]
    (-> this (.getBatch))))

(defn store
  "transition - a new transition to store - `org.deeplearning4j.rl4j.learning.sync.Transition`"
  ([^IExpReplay this ^org.deeplearning4j.rl4j.learning.sync.Transition transition]
    (-> this (.store transition))))

