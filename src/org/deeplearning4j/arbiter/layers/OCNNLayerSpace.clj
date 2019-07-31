(ns org.deeplearning4j.arbiter.layers.OCNNLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers OCNNLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer`"
  (^org.deeplearning4j.nn.conf.ocnn.OCNNOutputLayer [^OCNNLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

