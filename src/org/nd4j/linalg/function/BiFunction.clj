(ns org.nd4j.linalg.function.BiFunction
  "A function that accepts two arguments and returns a result"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function BiFunction]))

(defn apply
  "Apply the function and return the result

  t - First argument - `T`
  u - Second argument - `U`

  returns: Result - `R`"
  ([^BiFunction this t u]
    (-> this (.apply t u))))

