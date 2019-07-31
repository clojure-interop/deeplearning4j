(ns org.deeplearning4j.arbiter.layers.EmbeddingLayerSpace
  "Layer hyperparameter configuration space for EmbeddingLayer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers EmbeddingLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.EmbeddingLayer`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingLayer [^EmbeddingLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^EmbeddingLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^EmbeddingLayerSpace this]
    (-> this (.toString))))

