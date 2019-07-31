(ns org.nd4j.linalg.api.ops.impl.layers.recurrent.config.GRUCellConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.recurrent.config GRUCellConfiguration]))

(defn ->gru-cell-configuration
  "Constructor."
  (^GRUCellConfiguration []
    (new GRUCellConfiguration )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^GRUCellConfiguration this]
    (-> this (.toProperties))))

(defn i-args
  "returns: `int[]`"
  ([^GRUCellConfiguration this]
    (-> this (.iArgs))))

(defn args
  "returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^GRUCellConfiguration this]
    (-> this (.args))))

