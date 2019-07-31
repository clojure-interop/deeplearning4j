(ns org.deeplearning4j.arbiter.layers.DenseLayerSpace
  "layer hyperparameter configuration space for dense layers (i.e., multi-layer perceptron layers)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers DenseLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.DenseLayer`"
  (^org.deeplearning4j.nn.conf.layers.DenseLayer [^DenseLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^DenseLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^DenseLayerSpace this]
    (-> this (.toString))))

