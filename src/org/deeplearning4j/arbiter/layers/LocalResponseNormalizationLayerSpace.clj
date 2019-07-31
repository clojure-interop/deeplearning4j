(ns org.deeplearning4j.arbiter.layers.LocalResponseNormalizationLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers LocalResponseNormalizationLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.LocalResponseNormalization`"
  (^org.deeplearning4j.nn.conf.layers.LocalResponseNormalization [^LocalResponseNormalizationLayerSpace this values]
    (-> this (.getValue values))))

