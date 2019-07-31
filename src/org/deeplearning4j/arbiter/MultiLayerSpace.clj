(ns org.deeplearning4j.arbiter.MultiLayerSpace
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter MultiLayerSpace]))

(defn *from-json
  "json - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace [^java.lang.String json]
    (MultiLayerSpace/fromJson json)))

(defn *from-yaml
  "yaml - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.MultiLayerSpace`"
  (^org.deeplearning4j.arbiter.MultiLayerSpace [^java.lang.String yaml]
    (MultiLayerSpace/fromYaml yaml)))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.arbiter.DL4JConfiguration`"
  (^org.deeplearning4j.arbiter.DL4JConfiguration [^MultiLayerSpace this values]
    (-> this (.getValue values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^MultiLayerSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^MultiLayerSpace this]
    (-> this (.collectLeaves))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MultiLayerSpace this]
    (-> this (.toString))))

(defn get-layer-space
  "layer-number - `int`

  returns: `org.deeplearning4j.arbiter.layers.LayerSpace<?>`"
  (^org.deeplearning4j.arbiter.layers.LayerSpace [^MultiLayerSpace this ^Integer layer-number]
    (-> this (.getLayerSpace layer-number))))

