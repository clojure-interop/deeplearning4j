(ns org.deeplearning4j.nn.conf.layers.RnnLossLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers RnnLossLayer$Builder]))

(defn ->builder
  "Constructor.

  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`"
  (^RnnLossLayer$Builder [^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (new RnnLossLayer$Builder loss-function))
  (^RnnLossLayer$Builder []
    (new RnnLossLayer$Builder )))

(defn n-in
  "Description copied from class: FeedForwardLayer.Builder

  n-in - Number of inputs for the layer - `int`

  returns: `org.deeplearning4j.nn.conf.layers.RnnLossLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.RnnLossLayer$Builder [^RnnLossLayer$Builder this ^Integer n-in]
    (-> this (.nIn n-in))))

(defn n-out
  "Description copied from class: FeedForwardLayer.Builder

  n-out - Number of outputs / layer size - `int`

  returns: `org.deeplearning4j.nn.conf.layers.RnnLossLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.RnnLossLayer$Builder [^RnnLossLayer$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.RnnLossLayer`"
  (^org.deeplearning4j.nn.conf.layers.RnnLossLayer [^RnnLossLayer$Builder this]
    (-> this (.build))))

