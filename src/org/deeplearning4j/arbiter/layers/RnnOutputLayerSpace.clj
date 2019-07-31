(ns org.deeplearning4j.arbiter.layers.RnnOutputLayerSpace
  "Layer hyperparametor configuration space for RnnOutputLayer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers RnnOutputLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.RnnOutputLayer`"
  (^org.deeplearning4j.nn.conf.layers.RnnOutputLayer [^RnnOutputLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^RnnOutputLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^RnnOutputLayerSpace this]
    (-> this (.toString))))

