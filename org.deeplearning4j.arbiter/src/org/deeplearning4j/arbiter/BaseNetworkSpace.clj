(ns org.deeplearning4j.arbiter.BaseNetworkSpace
  "This is an abstract ParameterSpace for both MultiLayerNetworks (MultiLayerSpace) and ComputationGraph (ComputationGraphSpace)

 Functionality here should match NeuralNetConfiguration.Builder"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter BaseNetworkSpace]))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^BaseNetworkSpace this]
    (-> this (.collectLeaves))))

(defn leaf?
  "Description copied from interface: ParameterSpace

  returns: `boolean`"
  (^Boolean [^BaseNetworkSpace this]
    (-> this (.isLeaf))))

(defn set-indices
  "Description copied from interface: ParameterSpace

  indices - Indices to set. Length should equal ParameterSpace.numParameters() - `int`"
  ([^BaseNetworkSpace this ^Integer indices]
    (-> this (.setIndices indices))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^BaseNetworkSpace this]
    (-> this (.toString))))

(defn to-json
  "Return a json configuration of this configuration space.

  returns: `java.lang.String`"
  (^java.lang.String [^BaseNetworkSpace this]
    (-> this (.toJson))))

(defn to-yaml
  "Return a yaml configuration of this configuration space.

  returns: `java.lang.String`"
  (^java.lang.String [^BaseNetworkSpace this]
    (-> this (.toYaml))))

