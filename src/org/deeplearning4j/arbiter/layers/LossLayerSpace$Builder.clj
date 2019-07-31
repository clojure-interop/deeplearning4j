(ns org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers LossLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^LossLayerSpace$Builder []
    (new LossLayerSpace$Builder )))

(defn loss-function
  "loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  returns: `org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder [^LossLayerSpace$Builder this ^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (-> this (.lossFunction loss-function))))

(defn i-loss-function
  "loss-function - `org.nd4j.linalg.lossfunctions.ILossFunction`

  returns: `org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder [^LossLayerSpace$Builder this ^org.nd4j.linalg.lossfunctions.ILossFunction loss-function]
    (-> this (.iLossFunction loss-function))))

(defn activation
  "activation - `org.nd4j.linalg.activations.Activation`

  returns: `org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder [^LossLayerSpace$Builder this ^org.nd4j.linalg.activations.Activation activation]
    (-> this (.activation activation))))

(defn activation-fn
  "activation-function - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`

  returns: `org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder [^LossLayerSpace$Builder this ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace activation-function]
    (-> this (.activationFn activation-function))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.LossLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.LossLayerSpace [^LossLayerSpace$Builder this]
    (-> this (.build))))

