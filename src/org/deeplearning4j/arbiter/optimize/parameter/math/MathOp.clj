(ns org.deeplearning4j.arbiter.optimize.parameter.math.MathOp
  "A simple parameter space that implements scalar mathematical operations on another parameter space. This allows you
 to do things like Y = X * 2, where X is a parameter space. For example, a layer size hyperparameter could be set
 using this to 2x the size of the previous layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter.math MathOp]))

(defn ->math-op
  "Constructor.

  parameter-space - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  op - `org.deeplearning4j.arbiter.optimize.parameter.math.Op`
  scalar - `T`"
  (^MathOp [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace parameter-space ^org.deeplearning4j.arbiter.optimize.parameter.math.Op op scalar]
    (new MathOp parameter-space op scalar)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `T`"
  ([^MathOp this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^MathOp this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^MathOp this]
    (-> this (.collectLeaves))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^MathOp this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^MathOp this ^Integer indices]
    (-> this (.setIndices indices))))

