(ns org.deeplearning4j.arbiter.optimize.parameter.discrete.DiscreteParameterSpace
  "A DiscreteParameterSpace is used for a set of un-ordered values"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter.discrete DiscreteParameterSpace]))

(defn ->discrete-parameter-space
  "Constructor.

  values - `P`"
  (^DiscreteParameterSpace [values]
    (new DiscreteParameterSpace values)))

(defn num-values
  "returns: `int`"
  (^Integer [^DiscreteParameterSpace this]
    (-> this (.numValues))))

(defn get-value
  "Description copied from interface: ParameterSpace

  input - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `P`"
  ([^DiscreteParameterSpace this input]
    (-> this (.getValue input))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^DiscreteParameterSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^DiscreteParameterSpace this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^DiscreteParameterSpace this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^DiscreteParameterSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^DiscreteParameterSpace this ^Integer indices]
    (-> this (.setIndices indices))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^DiscreteParameterSpace this]
    (-> this (.toString))))

