(ns org.nd4j.linalg.function.Consumer
  "A function that accepts a single input and returns no result"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function Consumer]))

(defn accept
  "Perform the operation on the input

  t - Input - `T`"
  ([^Consumer this t]
    (-> this (.accept t))))

