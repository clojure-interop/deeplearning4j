(ns org.deeplearning4j.arbiter.layers.GlobalPoolingLayerSpace
  "Layer space for a GlobalPoolingLayer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers GlobalPoolingLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer`"
  (^org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer [^GlobalPoolingLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^GlobalPoolingLayerSpace this]
    (-> this (.numParameters))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^GlobalPoolingLayerSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^GlobalPoolingLayerSpace this ^Integer indices]
    (-> this (.setIndices indices))))

