(ns org.deeplearning4j.nn.conf.layers.LossLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers LossLayer$Builder]))

(defn ->builder
  "Constructor.

  loss-function - `org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction`"
  (^LossLayer$Builder [^org.nd4j.linalg.lossfunctions.LossFunctions$LossFunction loss-function]
    (new LossLayer$Builder loss-function))
  (^LossLayer$Builder []
    (new LossLayer$Builder )))

(defn n-in
  "Description copied from class: FeedForwardLayer.Builder

  n-in - Number of inputs for the layer - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LossLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LossLayer$Builder [^LossLayer$Builder this ^Integer n-in]
    (-> this (.nIn n-in))))

(defn n-out
  "Description copied from class: FeedForwardLayer.Builder

  n-out - Number of outputs / layer size - `int`

  returns: `org.deeplearning4j.nn.conf.layers.LossLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.LossLayer$Builder [^LossLayer$Builder this ^Integer n-out]
    (-> this (.nOut n-out))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.LossLayer`"
  (^org.deeplearning4j.nn.conf.layers.LossLayer [^LossLayer$Builder this]
    (-> this (.build))))

