(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.Conv2DConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config Conv2DConfig]))

(defn ->conv-2-d-config
  "Constructor."
  (^Conv2DConfig []
    (new Conv2DConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Conv2DConfig this]
    (-> this (.toProperties))))

