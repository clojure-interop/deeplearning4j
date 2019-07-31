(ns org.nd4j.linalg.api.ops.grid.OpDescriptor
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.grid OpDescriptor]))

(defn ->op-descriptor
  "Constructor.

  op - `org.nd4j.linalg.api.ops.Op`"
  (^OpDescriptor [^org.nd4j.linalg.api.ops.Op op]
    (new OpDescriptor op)))

