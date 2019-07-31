(ns org.deeplearning4j.rl4j.space.ArrayObservationSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.space ArrayObservationSpace]))

(defn ->array-observation-space
  "Constructor.

  shape - `int[]`"
  (^ArrayObservationSpace [shape]
    (new ArrayObservationSpace shape)))

