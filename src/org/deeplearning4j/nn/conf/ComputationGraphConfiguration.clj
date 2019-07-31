(ns org.deeplearning4j.nn.conf.ComputationGraphConfiguration
  "ComputationGraphConfiguration is a configuration object for neural networks with arbitrary connection structure.
 It is analogous to MultiLayerConfiguration, but allows considerably greater flexibility for the network
 architecture.
 Specifically, the network architecture is a directed acyclic graph, where each vertex in the graph is a GraphVertex,
 which may for example be a layer or a vertex/object that defines arbitrary forward and backward pass functionality.
 Note that the ComputationGraph may have an arbitrary number of inputs (multiple independent inputs, possibly of different
 types), and an arbitrary number of outputs (for example, multiple OutputLayer instances.
 Typical usage:
 ComputationGraphConfiguration conf = new NeuralNetConfiguration.Builder()....graphBuilder()...build();"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf ComputationGraphConfiguration]))

(defn ->computation-graph-configuration
  "Constructor."
  (^ComputationGraphConfiguration []
    (new ComputationGraphConfiguration )))

(defn *from-yaml
  "Create a neural net configuration from json

  json - the neural net configuration from json - `java.lang.String`

  returns: ComputationGraphConfiguration - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^java.lang.String json]
    (ComputationGraphConfiguration/fromYaml json)))

(defn *from-json
  "Create a computation graph configuration from json

  json - the neural net configuration from json - `java.lang.String`

  returns: ComputationGraphConfiguration - `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^java.lang.String json]
    (ComputationGraphConfiguration/fromJson json)))

(defn to-yaml
  "returns: JSON representation of configuration - `java.lang.String`"
  (^java.lang.String [^ComputationGraphConfiguration this]
    (-> this (.toYaml))))

(defn to-json
  "returns: JSON representation of computation graph configuration - `java.lang.String`"
  (^java.lang.String [^ComputationGraphConfiguration this]
    (-> this (.toJson))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ComputationGraphConfiguration this]
    (-> this (.toString))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.ComputationGraphConfiguration`"
  (^org.deeplearning4j.nn.conf.ComputationGraphConfiguration [^ComputationGraphConfiguration this]
    (-> this (.clone))))

(defn validate
  "Check the configuration, make sure it is valid

  allow-disconnected - If true: don't throw an exception on vertices that are 'disconnected'. A disconnectedvertex is one that is not an output, and doesn't connect to any other vertices. i.e.,it's output activations don't go anywhere - `boolean`
  allow-no-output - `boolean`

  throws: java.lang.IllegalStateException - if configuration is not valid"
  ([^ComputationGraphConfiguration this ^Boolean allow-disconnected ^Boolean allow-no-output]
    (-> this (.validate allow-disconnected allow-no-output)))
  ([^ComputationGraphConfiguration this]
    (-> this (.validate))))

(defn add-pre-processors
  "Add preprocessors automatically, given the specified types of inputs for the network. Inputs are specified using the
  InputType class, in the same order in which the inputs were defined in the original configuration.
  For example, in a network with two inputs: a convolutional input (28x28x1 images) and feed forward inputs, use
  .addPreProcessors(InputType.convolutional(28,28,1),InputType.feedForward()).
  For the CNN->Dense and CNN->RNN transitions, the nIns on the Dense/RNN layers will also be added automatically.
  NOTE: This method will be called automatically when using the
  ComputationGraphConfiguration.GraphBuilder.setInputTypes(InputType...) functionality.
  See that method for details.

  input-types - `org.deeplearning4j.nn.conf.inputs.InputType`"
  ([^ComputationGraphConfiguration this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.addPreProcessors input-types))))

(defn get-layer-activation-types
  "For the given input shape/type for the network, return a map of activation sizes for each layer and vertex
  in the graph. Note that this method can also add preprocessors if required (to handle transitions between some
  layer types such as convolutional -> dense, for example)

  add-preproc-if-necessary - If true: add any required preprocessors, in the process of calculating the layeractivation sizes - `boolean`
  input-types - Input types for the network - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: A map of activation types for the graph (key: vertex name. value: type of activations out of that vertex) - `java.util.Map<java.lang.String,org.deeplearning4j.nn.conf.inputs.InputType>`"
  (^java.util.Map [^ComputationGraphConfiguration this ^Boolean add-preproc-if-necessary ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getLayerActivationTypes add-preproc-if-necessary input-types)))
  (^java.util.Map [^ComputationGraphConfiguration this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getLayerActivationTypes input-types))))

(defn get-memory-report
  "Get a MemoryReport for the given computation graph configuration. This is used to estimate the
  memory requirements for the given network configuration and input

  input-types - Input types for the network - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the network - `org.deeplearning4j.nn.conf.memory.NetworkMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.NetworkMemoryReport [^ComputationGraphConfiguration this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

