(ns org.deeplearning4j.arbiter.layers.OutputLayerSpace
  "Layer hyperparameter configuration space for output layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers OutputLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.OutputLayer`"
  (^org.deeplearning4j.nn.conf.layers.OutputLayer [^OutputLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^OutputLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^OutputLayerSpace this]
    (-> this (.toString))))

