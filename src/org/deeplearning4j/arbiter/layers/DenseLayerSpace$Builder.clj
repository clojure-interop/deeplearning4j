(ns org.deeplearning4j.arbiter.layers.DenseLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers DenseLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^DenseLayerSpace$Builder []
    (new DenseLayerSpace$Builder )))

(defn has-bias
  "has-bias - `boolean`

  returns: `org.deeplearning4j.arbiter.layers.DenseLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.DenseLayerSpace$Builder [^DenseLayerSpace$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.DenseLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.DenseLayerSpace [^DenseLayerSpace$Builder this]
    (-> this (.build))))

