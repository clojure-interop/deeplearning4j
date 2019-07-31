(ns org.deeplearning4j.nn.conf.layers.BaseOutputLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers BaseOutputLayer$Builder]))

(defn ->builder
  "Constructor.

  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`"
  (^BaseOutputLayer$Builder [^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (new BaseOutputLayer$Builder loss-function))
  (^BaseOutputLayer$Builder []
    (new BaseOutputLayer$Builder )))

(defn loss-function
  "loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`

  returns: `T`"
  ([^BaseOutputLayer$Builder this ^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (-> this (.lossFunction loss-function))))

(defn has-bias
  "If true (default): include bias parameters in the model. False: no bias.

  has-bias - If true: include bias parameters in this model - `boolean`

  returns: `T`"
  ([^BaseOutputLayer$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

