(ns org.deeplearning4j.nn.conf.layers.BasePretrainNetwork$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BasePretrainNetwork$Builder]))

(defn ->builder
  "Constructor."
  (^BasePretrainNetwork$Builder []
    (new BasePretrainNetwork$Builder )))

(defn loss-function
  "loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  returns: `T`"
  ([^BasePretrainNetwork$Builder this ^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (-> this (.lossFunction loss-function))))

(defn visible-bias-init
  "visible-bias-init - `double`

  returns: `T`"
  ([^BasePretrainNetwork$Builder this ^Double visible-bias-init]
    (-> this (.visibleBiasInit visible-bias-init))))

