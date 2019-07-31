(ns org.deeplearning4j.arbiter.optimize.parameter.math.PairMathOp
  "A simple parameter space that implements pairwise mathematical operations on another parameter space. This allows you
 to do things like Z = X  Y, where X and Y are parameter spaces."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.optimize.parameter.math PairMathOp]))

(defn ->pair-math-op
  "Constructor.

  first - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  second - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`
  op - `org.deeplearning4j.arbiter.optimize.parameter.math.Op`"
  (^PairMathOp [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace first ^org.deeplearning4j.arbiter.optimize.api.ParameterSpace second ^org.deeplearning4j.arbiter.optimize.parameter.math.Op op]
    (new PairMathOp first second op)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `T`"
  ([^PairMathOp this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^PairMathOp this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^PairMathOp this]
    (-> this (.collectLeaves))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^PairMathOp this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^PairMathOp this ^Integer indices]
    (-> this (.setIndices indices))))

