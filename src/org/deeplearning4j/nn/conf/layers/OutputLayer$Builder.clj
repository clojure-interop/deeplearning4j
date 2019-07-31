(ns org.deeplearning4j.nn.conf.layers.OutputLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers OutputLayer$Builder]))

(defn ->builder
  "Constructor.

  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`"
  (^OutputLayer$Builder [^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (new OutputLayer$Builder loss-function)))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.OutputLayer`"
  (^org.deeplearning4j.nn.conf.layers.OutputLayer [^OutputLayer$Builder this]
    (-> this (.build))))

