(ns org.deeplearning4j.arbiter.layers.ActivationLayerSpace
  "Layer space for ActivationLayer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers ActivationLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.ActivationLayer`"
  (^org.deeplearning4j.nn.conf.layers.ActivationLayer [^ActivationLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^ActivationLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^ActivationLayerSpace this]
    (-> this (.toString))))

