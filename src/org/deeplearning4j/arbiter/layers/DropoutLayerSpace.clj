(ns org.deeplearning4j.arbiter.layers.DropoutLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers DropoutLayerSpace]))

(defn ->dropout-layer-space
  "Constructor.

  dropout - `org.deeplearning4j.arbiter.optimize.api.ParameterSpace`"
  (^DropoutLayerSpace [^org.deeplearning4j.arbiter.optimize.api.ParameterSpace dropout]
    (new DropoutLayerSpace dropout)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.DropoutLayer`"
  (^org.deeplearning4j.nn.conf.layers.DropoutLayer [^DropoutLayerSpace this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^DropoutLayerSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^DropoutLayerSpace this]
    (-> this (.collectLeaves))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^DropoutLayerSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^DropoutLayerSpace this ^Integer indices]
    (-> this (.setIndices indices))))

