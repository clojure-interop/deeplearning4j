(ns org.deeplearning4j.arbiter.optimize.parameter.integer.IntegerParameterSpace
  "IntegerParameterSpace is a ParameterSpace<Integer>; i.e., defines an ordered space of integers between
 some minimum and maximum value"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter.integer IntegerParameterSpace]))

(defn ->integer-parameter-space
  "Constructor.

  Create an IntegerParameterSpace with a uniform distribution between the specified min/max (inclusive)

  min - Min value, inclusive - `int`
  max - Max value, inclusive - `int`"
  (^IntegerParameterSpace [^Integer min ^Integer max]
    (new IntegerParameterSpace min max))
  (^IntegerParameterSpace [^org.apache.commons.math3.distribution.IntegerDistribution distribution]
    (new IntegerParameterSpace distribution)))

(defn get-min
  "returns: `int`"
  (^Integer [^IntegerParameterSpace this]
    (-> this (.getMin))))

(defn get-max
  "returns: `int`"
  (^Integer [^IntegerParameterSpace this]
    (-> this (.getMax))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^IntegerParameterSpace this]
    (-> this (.toString))))

(defn get-value
  "Description copied from interface: ParameterSpace

  input - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `java.lang.Integer`"
  (^java.lang.Integer [^IntegerParameterSpace this input]
    (-> this (.getValue input))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^IntegerParameterSpace this]
    (-> this (.isLeaf))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^IntegerParameterSpace this]
    (-> this (.numParameters))))

(defn hash-code
  "returns: `int`"
  (^Integer [^IntegerParameterSpace this]
    (-> this (.hashCode))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^IntegerParameterSpace this]
    (-> this (.getNestedSpaces))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^IntegerParameterSpace this ^Integer indices]
    (-> this (.setIndices indices))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^IntegerParameterSpace this ^java.lang.Object o]
    (-> this (.equals o))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^IntegerParameterSpace this]
    (-> this (.collectLeaves))))

