(ns org.deeplearning4j.arbiter.layers.BaseLayerSpace
  "BaseLayerSpace contains the common Layer hyperparameters; should match BaseLayer in terms of features"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers BaseLayerSpace]))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^BaseLayerSpace this]
    (-> this (.numParameters))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^BaseLayerSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^BaseLayerSpace this ^Integer indices]
    (-> this (.setIndices indices))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseLayerSpace this]
    (-> this (.toString))))

