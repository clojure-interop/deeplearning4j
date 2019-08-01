(ns org.deeplearning4j.arbiter.ComputationGraphSpace
  "ComputationGraphSpace: Defines the space of valid hyperparameters for a ComputationGraph.
 Note that this for fixed graph structures only"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter ComputationGraphSpace]))

(defn *from-json
  "Instantiate a computation graph space from
  a raw json string

  json - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace [^java.lang.String json]
    (ComputationGraphSpace/fromJson json)))

(defn *from-yaml
  "Instantiate a computation graph space
  from a raw yaml string

  yaml - `java.lang.String`

  returns: `org.deeplearning4j.arbiter.ComputationGraphSpace`"
  (^org.deeplearning4j.arbiter.ComputationGraphSpace [^java.lang.String yaml]
    (ComputationGraphSpace/fromYaml yaml)))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.arbiter.GraphConfiguration`"
  (^org.deeplearning4j.arbiter.GraphConfiguration [^ComputationGraphSpace this values]
    (-> this (.getValue values))))

(defn num-parameters
  "Description copied from interface: ParameterSpace

  returns: Number of hyperparameters to be optimized - `int`"
  (^Integer [^ComputationGraphSpace this]
    (-> this (.numParameters))))

(defn collect-leaves
  "Description copied from interface: ParameterSpace

  returns: `java.util.List<org.deeplearning4j.arbiter.optimize.api.ParameterSpace>`"
  (^java.util.List [^ComputationGraphSpace this]
    (-> this (.collectLeaves))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ComputationGraphSpace this]
    (-> this (.toString))))

