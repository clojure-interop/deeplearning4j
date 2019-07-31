(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.Pooling3DConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config Pooling3DConfig]))

(defn ->pooling-3-d-config
  "Constructor."
  (^Pooling3DConfig []
    (new Pooling3DConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^Pooling3DConfig this]
    (-> this (.toProperties))))

