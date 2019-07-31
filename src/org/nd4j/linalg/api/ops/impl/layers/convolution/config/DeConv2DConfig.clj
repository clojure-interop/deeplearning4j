(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.DeConv2DConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config DeConv2DConfig]))

(defn ->de-conv-2-d-config
  "Constructor."
  (^DeConv2DConfig []
    (new DeConv2DConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^DeConv2DConfig this]
    (-> this (.toProperties))))

