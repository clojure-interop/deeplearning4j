(ns org.deeplearning4j.arbiter.optimize.api.adapter.ParameterSpaceAdapter
  "An abstract class used for adapting one type into another. Subclasses of this need to merely implement 2 simple methods"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.api.adapter ParameterSpaceAdapter]))

(defn ->parameter-space-adapter
  "Constructor."
  (^ParameterSpaceAdapter []
    (new ParameterSpaceAdapter )))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `T`"
  ([^ParameterSpaceAdapter this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^ParameterSpaceAdapter this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^ParameterSpaceAdapter this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^ParameterSpaceAdapter this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^ParameterSpaceAdapter this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^ParameterSpaceAdapter this ^Integer indices]
    (-> this (.setIndices indices))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ParameterSpaceAdapter this]
    (-> this (.toString))))

