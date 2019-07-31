(ns org.deeplearning4j.arbiter.optimize.parameter.FixedValue
  "FixedValue is a ParameterSpace that defines only a single fixed value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter FixedValue]))

(defn ->fixed-value
  "Constructor.

  value - `T`"
  (^FixedValue [value]
    (new FixedValue value)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^FixedValue this]
    (-> this (.toString))))

(defn get-value
  "Description copied from interface: ParameterSpace

  input - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `T`"
  ([^FixedValue this input]
    (-> this (.getValue input))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^FixedValue this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^FixedValue this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^FixedValue this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^FixedValue this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^FixedValue this ^Integer indices]
    (-> this (.setIndices indices))))

