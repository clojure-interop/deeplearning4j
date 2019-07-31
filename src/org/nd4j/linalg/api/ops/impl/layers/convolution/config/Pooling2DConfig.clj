(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling2DConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config Pooling2DConfig]))

(defn ->pooling-2-d-config
  "Constructor."
  (^Pooling2DConfig []
    (new Pooling2DConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Pooling2DConfig this]
    (-> this (.toProperties))))

