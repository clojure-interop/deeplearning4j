(ns org.deeplearning4j.arbiter.layers.fixed.FixedLayerSpace
  "A layer space that wraps a DL4J layer, without any optimizable hyperparameters"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers.fixed FixedLayerSpace]))

(defn ->fixed-layer-space
  "Constructor."
  (^FixedLayerSpace []
    (new FixedLayerSpace )))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `T`"
  ([^FixedLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^FixedLayerSpace this]
    (-> this (.numParameters))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^FixedLayerSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  idxs - Indices to set. Length should equal ParameterSpace.numParameters() - `int[]`"
  ([^FixedLayerSpace this idxs]
    (-> this (.setIndices idxs))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^FixedLayerSpace this]
    (-> this (.collectLeaves))))

