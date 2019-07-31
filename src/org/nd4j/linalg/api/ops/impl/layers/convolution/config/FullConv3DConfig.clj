(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.FullConv3DConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config FullConv3DConfig]))

(defn ->full-conv-3-d-config
  "Constructor."
  (^FullConv3DConfig []
    (new FullConv3DConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^FullConv3DConfig this]
    (-> this (.toProperties))))

