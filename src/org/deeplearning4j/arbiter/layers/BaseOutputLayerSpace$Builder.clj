(ns org.deeplearning4j.arbiter.layers.BaseOutputLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BaseOutputLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^BaseOutputLayerSpace$Builder []
    (new BaseOutputLayerSpace$Builder )))

(defn loss-function
  "loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  returns: `T`"
  ([^BaseOutputLayerSpace$Builder this ^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (-> this (.lossFunction loss-function))))

(defn i-loss-function
  "loss-function - `org.nd4j.linalg.lossfunctions.ILossFunction`

  returns: `T`"
  ([^BaseOutputLayerSpace$Builder this ^org.nd4j.linalg.lossfunctions.ILossFunction loss-function]
    (-> this (.iLossFunction loss-function))))

(defn has-bias
  "has-bias - `boolean`

  returns: `T`"
  ([^BaseOutputLayerSpace$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

