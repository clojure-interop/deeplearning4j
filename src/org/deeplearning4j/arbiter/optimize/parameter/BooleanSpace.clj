(ns org.deeplearning4j.arbiter.optimize.parameter.BooleanSpace
  "BooleanParameterSpace is a ParameterSpace<Boolean>; Defines {True, False} as a parameter space
 If argument to setValue is less than or equal to 0.5 it will return True else False"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter BooleanSpace]))

(defn ->boolean-space
  "Constructor."
  (^BooleanSpace []
    (new BooleanSpace )))

(defn get-value?
  "Description copied from interface: ParameterSpace

  input - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `java.lang.Boolean`"
  (^java.lang.Boolean [^BooleanSpace this input]
    (-> this (.getValue input))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^BooleanSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^BooleanSpace this]
    (-> this (.collectLeaves))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^BooleanSpace this]
    (-> this (.getNestedSpaces))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^BooleanSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^BooleanSpace this ^Integer indices]
    (-> this (.setIndices indices))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BooleanSpace this]
    (-> this (.toString))))

