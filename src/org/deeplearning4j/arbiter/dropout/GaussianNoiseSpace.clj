(ns org.deeplearning4j.arbiter.dropout.GaussianNoiseSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.dropout GaussianNoiseSpace]))

(defn ->gaussian-noise-space
  "Constructor.

  stddev - `double`"
  (^GaussianNoiseSpace [^Double stddev]
    (new GaussianNoiseSpace stddev)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.dropout.IDropout`"
  (^org.deeplearning4j.nn.conf.dropout.IDropout [^GaussianNoiseSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^GaussianNoiseSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^GaussianNoiseSpace this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^GaussianNoiseSpace this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^GaussianNoiseSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^GaussianNoiseSpace this ^Integer indices]
    (-> this (.setIndices indices))))

