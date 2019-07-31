(ns org.deeplearning4j.nn.conf.MultiLayerConfiguration
  "Configuration for a multi layer network"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf MultiLayerConfiguration]))

(defn ->multi-layer-configuration
  "Constructor."
  (^MultiLayerConfiguration []
    (new MultiLayerConfiguration )))

(defn *from-yaml
  "Create a neural net configuration from json

  json - the neural net configuration from json - `java.lang.String`

  returns: MultiLayerConfiguration - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^java.lang.String json]
    (MultiLayerConfiguration/fromYaml json)))

(defn *from-json
  "Create a neural net configuration from json

  json - the neural net configuration from json - `java.lang.String`

  returns: MultiLayerConfiguration - `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^java.lang.String json]
    (MultiLayerConfiguration/fromJson json)))

(defn get-epoch-count
  "returns: `int`"
  (^Integer [^MultiLayerConfiguration this]
    (-> this (.getEpochCount))))

(defn get-conf
  "i - `int`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^MultiLayerConfiguration this ^Integer i]
    (-> this (.getConf i))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^MultiLayerConfiguration this]
    (-> this (.toString))))

(defn get-memory-report
  "Get a MemoryReport for the given MultiLayerConfiguration. This is used to estimate the
  memory requirements for the given network configuration and input

  input-type - Input types for the network - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the network - `org.deeplearning4j.nn.conf.memory.NetworkMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.NetworkMemoryReport [^MultiLayerConfiguration this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn get-layer-activation-types
  "For the given input shape/type for the network, return a list of activation sizes for each layer in the network.
  i.e., list.get(i) is the output activation sizes for layer i

  input-type - Input type for the network - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: A lits of activation types for the network, indexed by layer number - `java.util.List<org.deeplearning4j.nn.conf.inputs.InputType>`"
  (^java.util.List [^MultiLayerConfiguration this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getLayerActivationTypes input-type))))

(defn get-input-pre-process
  "curr - `int`

  returns: `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^MultiLayerConfiguration this ^Integer curr]
    (-> this (.getInputPreProcess curr))))

(defn to-yaml
  "returns: JSON representation of NN configuration - `java.lang.String`"
  (^java.lang.String [^MultiLayerConfiguration this]
    (-> this (.toYaml))))

(defn to-json
  "returns: JSON representation of NN configuration - `java.lang.String`"
  (^java.lang.String [^MultiLayerConfiguration this]
    (-> this (.toJson))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.MultiLayerConfiguration`"
  (^org.deeplearning4j.nn.conf.MultiLayerConfiguration [^MultiLayerConfiguration this]
    (-> this (.clone))))

(defn set-epoch-count
  "epoch-count - `int`"
  ([^MultiLayerConfiguration this ^Integer epoch-count]
    (-> this (.setEpochCount epoch-count))))

