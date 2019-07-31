(ns org.deeplearning4j.arbiter.layers.Bidirectional
  "Bidirectional layer wrapper. Can be used wrap an existing layer space, in the same way that
 Bidirectional wraps a DL4J layer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers Bidirectional]))

(defn ->bidirectional
  "Constructor.

  layer-space - `org.deeplearning4j.arbiter.layers.LayerSpace`"
  (^Bidirectional [^org.deeplearning4j.arbiter.layers.LayerSpace layer-space]
    (new Bidirectional layer-space)))

(defn get-value
  "Description copied from interface: ParameterSpace

  parameter-values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^Bidirectional this parameter-values]
    (-> this (.getValue parameter-values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^Bidirectional this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^Bidirectional this]
    (-> this (.collectLeaves))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^Bidirectional this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^Bidirectional this ^Integer indices]
    (-> this (.setIndices indices))))

