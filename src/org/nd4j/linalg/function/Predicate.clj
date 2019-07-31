(ns org.nd4j.linalg.function.Predicate
  "A boolean valued function of a single input argument"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function Predicate]))

(defn test
  "Returns the result of the predicate on the given input

  t - Input - `T`

  returns: Result - `boolean`"
  (^Boolean [^Predicate this t]
    (-> this (.test t))))

