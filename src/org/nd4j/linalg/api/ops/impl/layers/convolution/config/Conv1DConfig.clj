(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv1DConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config Conv1DConfig]))

(defn ->conv-1-d-config
  "Constructor."
  (^Conv1DConfig []
    (new Conv1DConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Conv1DConfig this]
    (-> this (.toProperties))))

