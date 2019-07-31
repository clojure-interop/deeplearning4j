(ns org.nd4j.linalg.api.ops.grid.GridPointers
  "POJO describing OP"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.grid GridPointers]))

(defn ->grid-pointers
  "Constructor.

  op - `org.nd4j.linalg.api.ops.Op`
  dimensions - `int`"
  (^GridPointers [^org.nd4j.linalg.api.ops.Op op ^Integer dimensions]
    (new GridPointers op dimensions)))

