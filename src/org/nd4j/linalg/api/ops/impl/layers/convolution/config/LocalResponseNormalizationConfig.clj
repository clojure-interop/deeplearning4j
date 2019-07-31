(ns org.nd4j.linalg.api.ops.impl.layers.convolution.config.LocalResponseNormalizationConfig
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.api.ops.impl.layers.convolution.config LocalResponseNormalizationConfig]))

(defn ->local-response-normalization-config
  "Constructor."
  (^LocalResponseNormalizationConfig []
    (new LocalResponseNormalizationConfig )))

(defn to-properties
  "returns: `java.util.Map<java.lang.String,java.lang.Object>`"
  (^java.util.Map [^LocalResponseNormalizationConfig this]
    (-> this (.toProperties))))

