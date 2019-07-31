(ns org.nd4j.linalg.api.ops.impl.layers.recurrent.config.LSTMCellConfiguration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.recurrent.config LSTMCellConfiguration]))

(defn ->lstm-cell-configuration
  "Constructor."
  (^LSTMCellConfiguration []
    (new LSTMCellConfiguration )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^LSTMCellConfiguration this]
    (-> this (.toProperties))))

(defn args
  "returns: `org.nd4j.autodiff.samediff.SDVariable[]`"
  ([^LSTMCellConfiguration this]
    (-> this (.args))))

(defn i-args
  "returns: `int[]`"
  ([^LSTMCellConfiguration this]
    (-> this (.iArgs))))

(defn t-args
  "returns: `double[]`"
  ([^LSTMCellConfiguration this]
    (-> this (.tArgs))))

