(ns org.deeplearning4j.arbiter.layers.BasePretrainNetworkLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BasePretrainNetworkLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^BasePretrainNetworkLayerSpace$Builder []
    (new BasePretrainNetworkLayerSpace$Builder )))

(defn loss-function
  "loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  returns: `T`"
  ([^BasePretrainNetworkLayerSpace$Builder this ^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (-> this (.lossFunction loss-function))))

