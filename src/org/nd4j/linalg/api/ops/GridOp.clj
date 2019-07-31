(ns org.nd4j.linalg.api.ops.GridOp
  "MetaOp is special op, that contains multiple ops"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops GridOp]))

(defn get-grid-descriptor
  "returns: `org.nd4j.linalg.api.ops.grid.GridDescriptor`"
  (^org.nd4j.linalg.api.ops.grid.GridDescriptor [^GridOp this]
    (-> this (.getGridDescriptor))))

