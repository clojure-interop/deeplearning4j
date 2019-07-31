(ns org.deeplearning4j.arbiter.layers.Deconvolution2DLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers Deconvolution2DLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.Deconvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D [^Deconvolution2DLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

