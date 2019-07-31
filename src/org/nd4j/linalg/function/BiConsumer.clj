(ns org.nd4j.linalg.function.BiConsumer
  "BiConsumer is an operation that accepts two arguments and returns no result."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.function BiConsumer]))

(defn accept
  "Perform the operation on the given arguments

  t - First input - `T`
  u - Second input - `U`"
  ([^BiConsumer this t u]
    (-> this (.accept t u))))

