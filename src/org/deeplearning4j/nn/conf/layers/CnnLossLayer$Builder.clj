(ns org.deeplearning4j.nn.conf.layers.CnnLossLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers CnnLossLayer$Builder]))

(defn ->builder
  "Constructor.

  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`"
  (^CnnLossLayer$Builder [^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (new CnnLossLayer$Builder loss-function))
  (^CnnLossLayer$Builder []
    (new CnnLossLayer$Builder )))

(defn n-in
  "Description copied from class: FeedForwardLayer.Builder

  n-in - Number of inputs for the layer - `int`

  returns: `org.deeplearning4j.nn.conf.layers.CnnLossLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.CnnLossLayer$Builder [^CnnLossLayer$Builder this ^Integer n-in]
    (-> this (.nIn n-in))))

(defn n-out
  "Description copied from class: FeedForwardLayer.Builder

  n-out - Number of outputs / layer size - `int`

  returns: `org.deeplearning4j.nn.conf.layers.CnnLossLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.CnnLossLayer$Builder [^CnnLossLayer$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.CnnLossLayer`"
  (^org.deeplearning4j.nn.conf.layers.CnnLossLayer [^CnnLossLayer$Builder this]
    (-> this (.build))))

