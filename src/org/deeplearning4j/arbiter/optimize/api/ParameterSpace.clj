(ns org.deeplearning4j.arbiter.optimize.api.ParameterSpace
  "ParameterSpace: defines the acceptable ranges of values a given parameter may take.
 Note that parameter spaces can be simple (like ParameterSpace<Double>) or complicated, including
 multiple nested ParameterSpaces"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api ParameterSpace]))

(defn get-value
  "Generate a candidate given a set of values. These values are then mapped to a specific candidate, using some
  mapping function (such as the prior probability distribution)

  parameter-values - A set of values, each in the range [0,1], of length numParameters() - `double[]`

  returns: `P`"
  ([^ParameterSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Get the total number of parameters (hyperparameters) to be optimized. This includes optional parameters from
  different parameter subpaces. (Thus, not every parameter may be used in every candidate)

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^ParameterSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Collect a list of parameters, recursively. Note that leaf parameters are parameters that do not have any
  nested parameter spaces

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^ParameterSpace this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Get a list of nested parameter spaces by name. Note that the returned parameter spaces may in turn have further
  nested parameter spaces. The map should be empty for leaf parameter spaces

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^ParameterSpace this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Is this ParameterSpace a leaf? (i.e., does it contain other ParameterSpaces internally?)

  returns: `boolean`"
  (^Boolean [^ParameterSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "For leaf ParameterSpaces: set the indices of the leaf ParameterSpace.
  Expects input of length numParameters(). Throws exception if isLeaf() is false.

  indices - Indices to set. Length should equal numParameters() - `int`"
  ([^ParameterSpace this ^Integer indices]
    (-> this (.setIndices indices))))

