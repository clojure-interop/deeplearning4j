(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv3DConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config Conv3DConfig]))

(defn ->conv-3-d-config
  "Constructor."
  (^Conv3DConfig []
    (new Conv3DConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Conv3DConfig this]
    (-> this (.toProperties))))

