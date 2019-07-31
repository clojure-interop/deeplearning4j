(ns org.deeplearning4j.arbiter.layers.SeparableConvolution2DLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers SeparableConvolution2DLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D [^SeparableConvolution2DLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

