(ns org.deeplearning4j.nn.conf.graph.rnn.LastTimeStepVertex
  "LastTimeStepVertex is used in the context of recurrent neural network activations, to go from 3d (time series)
 activations to 2d activations, by extracting out the last time step of activations for each example.
 This can be used for example in sequence to sequence architectures, and potentially for sequence classification.
 NOTE: Because RNNs may have masking arrays (to allow for examples/time series of different lengths in the same
 minibatch), it is necessary to provide the same of the network input that has the corresponding mask array. If this
 input does not have a mask array, the last time step of the input will be used for all examples; otherwise, the time
 step of the last non-zero entry in the mask array (for each example separately) will be used."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph.rnn LastTimeStepVertex]))

(defn ->last-time-step-vertex
  "Constructor.

  mask-array-input-name - The name of the input to look at when determining the last time step. Specifically, themask array of this time series input is used when determining which time step to extractand return. - `java.lang.String`"
  (^LastTimeStepVertex [^java.lang.String mask-array-input-name]
    (new LastTimeStepVertex mask-array-input-name)))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^LastTimeStepVertex this]
    (-> this (.minVertexInputs))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^LastTimeStepVertex this]
    (-> this (.toString))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^LastTimeStepVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^LastTimeStepVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^LastTimeStepVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.impl.rnn.LastTimeStepVertex`"
  (^org.deeplearning4j.nn.graph.vertex.impl.rnn.LastTimeStepVertex [^LastTimeStepVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.GraphVertex`"
  (^org.deeplearning4j.nn.conf.graph.GraphVertex [^LastTimeStepVertex this]
    (-> this (.clone))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^LastTimeStepVertex this]
    (-> this (.maxVertexInputs))))

(defn hash-code
  "returns: `int`"
  (^Integer [^LastTimeStepVertex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^LastTimeStepVertex this ^java.lang.Object o]
    (-> this (.equals o))))

