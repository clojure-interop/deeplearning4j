(ns org.deeplearning4j.arbiter.layers.SubsamplingLayerSpace
  "Layer hyperparameter configuration space for subsampling layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers SubsamplingLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^SubsamplingLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^SubsamplingLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^SubsamplingLayerSpace this]
    (-> this (.toString))))

