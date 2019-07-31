(ns org.deeplearning4j.arbiter.layers.CenterLossOutputLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers CenterLossOutputLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer`"
  (^org.deeplearning4j.nn.conf.layers.CenterLossOutputLayer [^CenterLossOutputLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

