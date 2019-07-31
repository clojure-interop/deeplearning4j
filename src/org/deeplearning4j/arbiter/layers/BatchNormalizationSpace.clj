(ns org.deeplearning4j.arbiter.layers.BatchNormalizationSpace
  "LayerSpace for batch normalization layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BatchNormalizationSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.BatchNormalization`"
  (^org.deeplearning4j.nn.conf.layers.BatchNormalization [^BatchNormalizationSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^BatchNormalizationSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^BatchNormalizationSpace this]
    (-> this (.toString))))

