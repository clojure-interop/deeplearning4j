(ns org.deeplearning4j.arbiter.layers.LossLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers LossLayerSpace]))

(defn ->loss-layer-space
  "Constructor.

  builder - `org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder`"
  (^LossLayerSpace [^org.deeplearning4j.arbiter.layers.LossLayerSpace$Builder builder]
    (new LossLayerSpace builder)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.LossLayer`"
  (^org.deeplearning4j.nn.conf.layers.LossLayer [^LossLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

