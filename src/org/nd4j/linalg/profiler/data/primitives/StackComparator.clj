(ns org.nd4j.linalg.profiler.data.primitives.StackComparator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.profiler.data.primitives StackComparator]))

(defn ->stack-comparator
  "Constructor."
  (^StackComparator []
    (new StackComparator )))

(defn compare
  "o-1 - `org.nd4j.linalg.profiler.data.primitives.StackNode`
  o-2 - `org.nd4j.linalg.profiler.data.primitives.StackNode`

  returns: `int`"
  (^Integer [^StackComparator this ^org.nd4j.linalg.profiler.data.primitives.StackNode o-1 ^org.nd4j.linalg.profiler.data.primitives.StackNode o-2]
    (-> this (.compare o-1 o-2))))

