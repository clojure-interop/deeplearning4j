(ns org.deeplearning4j.arbiter.layers.GravesBidirectionalLSTMLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers GravesBidirectionalLSTMLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^GravesBidirectionalLSTMLayerSpace$Builder []
    (new GravesBidirectionalLSTMLayerSpace$Builder )))

(defn forget-gate-bias-init
  "forget-gate-bias-init - `double`

  returns: `org.deeplearning4j.arbiter.layers.GravesBidirectionalLSTMLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.GravesBidirectionalLSTMLayerSpace$Builder [^GravesBidirectionalLSTMLayerSpace$Builder this ^Double forget-gate-bias-init]
    (-> this (.forgetGateBiasInit forget-gate-bias-init))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.GravesBidirectionalLSTMLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.GravesBidirectionalLSTMLayerSpace [^GravesBidirectionalLSTMLayerSpace$Builder this]
    (-> this (.build))))

