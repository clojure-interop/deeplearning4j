(ns org.deeplearning4j.arbiter.optimize.parameter.continuous.ContinuousParameterSpace
  "ContinuousParametSpace is a ParameterSpace<Double> that (optionally) takes an Apache Commons
 RealDistribution when used for random sampling (such as in a RandomSearchCandidateGenerator)"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter.continuous ContinuousParameterSpace]))

(defn ->continuous-parameter-space
  "Constructor.

  ContinuousParameterSpace with uniform distribution between the minimum and maximum values

  min - Minimum value that can be generated - `double`
  max - Maximum value that can be generated - `double`"
  (^ContinuousParameterSpace [^Double min ^Double max]
    (new ContinuousParameterSpace min max))
  (^ContinuousParameterSpace [^org.apache.commons.math3.distribution.RealDistribution distribution]
    (new ContinuousParameterSpace distribution)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ContinuousParameterSpace this]
    (-> this (.toString))))

(defn get-value
  "Description copied from interface: ParameterSpace

  input - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `java.lang.Double`"
  (^java.lang.Double [^ContinuousParameterSpace this input]
    (-> this (.getValue input))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^ContinuousParameterSpace this]
    (-> this (.isLeaf))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^ContinuousParameterSpace this]
    (-> this (.numParameters))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ContinuousParameterSpace this]
    (-> this (.hashCode))))

(defn get-nested-spaces
  "Description copied from interface: ParameterSpace

  returns: A map of nested parameter spaces - `java.util.Map<java.lang.String,org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.Map [^ContinuousParameterSpace this]
    (-> this (.getNestedSpaces))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^ContinuousParameterSpace this ^Integer indices]
    (-> this (.setIndices indices))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ContinuousParameterSpace this ^java.lang.Object o]
    (-> this (.equals o))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^ContinuousParameterSpace this]
    (-> this (.collectLeaves))))

