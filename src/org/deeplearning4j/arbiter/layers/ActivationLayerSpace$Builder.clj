(ns org.deeplearning4j.arbiter.layers.ActivationLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers ActivationLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^ActivationLayerSpace$Builder []
    (new ActivationLayerSpace$Builder )))

(defn activation
  "activation - `org.nd4j.linalg.activations.Activation`

  returns: `org.deeplearning4j.arbiter.layers.ActivationLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ActivationLayerSpace$Builder [^ActivationLayerSpace$Builder this ^org.nd4j.linalg.activations.Activation activation]
    (-> this (.activation activation))))

(defn activation-fn
  "activation-function - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.layers.ActivationLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.ActivationLayerSpace$Builder [^ActivationLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace activation-function]
    (-> this (.activationFn activation-function))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.ActivationLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.ActivationLayerSpace [^ActivationLayerSpace$Builder this]
    (-> this (.build))))

