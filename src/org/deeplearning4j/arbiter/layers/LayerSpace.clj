(ns org.deeplearning4j.arbiter.layers.LayerSpace
  "LayerSpace contains common Layer hyperparameters; should match Layer in terms of features"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers LayerSpace]))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^LayerSpace this]
    (-> this (.collectLeaves))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^LayerSpace this]
    (-> this (.numParameters))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^LayerSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^LayerSpace this ^Integer indices]
    (-> this (.setIndices indices))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LayerSpace this]
    (-> this (.toString))))

