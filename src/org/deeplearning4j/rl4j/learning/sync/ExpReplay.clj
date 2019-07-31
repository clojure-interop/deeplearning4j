(ns org.deeplearning4j.rl4j.learning.sync.ExpReplay
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync ExpReplay]))

(defn ->exp-replay
  "Constructor.

  max-size - `int`
  batch-size - `int`
  seed - `int`"
  (^ExpReplay [^Integer max-size ^Integer batch-size ^Integer seed]
    (new ExpReplay max-size batch-size seed)))

(defn get-batch
  "size - `int`

  returns: `java.util.ArrayList<org.deeplearning4j.rl4j.learning.sync.Transition<A>>`"
  (^java.util.ArrayList [^ExpReplay this ^Integer size]
    (-> this (.getBatch size)))
  (^java.util.ArrayList [^ExpReplay this]
    (-> this (.getBatch))))

(defn store
  "transition - a new transition to store - `org.deeplearning4j.rl4j.learning.sync.Transition`"
  ([^ExpReplay this ^org.deeplearning4j.rl4j.learning.sync.Transition transition]
    (-> this (.store transition))))

