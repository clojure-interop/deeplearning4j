(ns org.deeplearning4j.arbiter.layers.AbstractLSTMLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers AbstractLSTMLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^AbstractLSTMLayerSpace$Builder []
    (new AbstractLSTMLayerSpace$Builder )))

(defn forget-gate-bias-init
  "forget-gate-bias-init - `double`

  returns: `T`"
  ([^AbstractLSTMLayerSpace$Builder this ^Double forget-gate-bias-init]
    (-> this (.forgetGateBiasInit forget-gate-bias-init))))

(defn gate-activation-fn
  "activation - `org.nd4j.linalg.activations.Activation`

  returns: `T`"
  ([^AbstractLSTMLayerSpace$Builder this ^org.nd4j.linalg.activations.Activation activation]
    (-> this (.gateActivationFn activation))))

(defn gate-activation
  "gate-activation-fn - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `T`"
  ([^AbstractLSTMLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace gate-activation-fn]
    (-> this (.gateActivation gate-activation-fn))))

