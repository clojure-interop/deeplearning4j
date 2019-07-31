(ns org.nd4j.linalg.function.Function
  "A Function accepts one argument and returns a result"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function Function]))

(defn apply
  "Apply the function to the argument, and return the result

  t - Input - `T`

  returns: Result - `R`"
  ([^Function this t]
    (-> this (.apply t))))

