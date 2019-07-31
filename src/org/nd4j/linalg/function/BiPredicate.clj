(ns org.nd4j.linalg.function.BiPredicate
  "A predicate (boolean valued function) with two arguments."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function BiPredicate]))

(defn test
  "Evaluate the predicate

  t - First argument - `T`
  u - Second argument - `U`

  returns: Result - `boolean`"
  (^Boolean [^BiPredicate this t u]
    (-> this (.test t u))))

