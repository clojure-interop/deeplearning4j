(ns org.deeplearning4j.arbiter.layers.ConvolutionLayerSpace
  "Layer space for convolutional layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers ConvolutionLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^ConvolutionLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ConvolutionLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^ConvolutionLayerSpace this]
    (-> this (.toString))))

