(ns org.deeplearning4j.nn.conf.graph.SubsetVertex
  "SubsetVertex is used to select a subset of the activations out of another GraphVertex.
 For example, a subset of the activations out of a layer.
 Note that this subset is specifying by means of an interval of the original activations.
 For example, to get the first 10 activations of a layer (or, first 10 features out of a CNN layer) use
 new SubsetVertex(0,9).
 In the case of convolutional (4d) activations, this is done along channels."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph SubsetVertex]))

(defn ->subset-vertex
  "Constructor.

  from - The first column index, inclusive - `int`
  to - The last column index, inclusive - `int`"
  (^SubsetVertex [^Integer from ^Integer to]
    (new SubsetVertex from to)))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^SubsetVertex this]
    (-> this (.minVertexInputs))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^SubsetVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^SubsetVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^SubsetVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^org.deeplearning4j.nn.graph.vertex.GraphVertex [^SubsetVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.SubsetVertex`"
  (^org.deeplearning4j.nn.conf.graph.SubsetVertex [^SubsetVertex this]
    (-> this (.clone))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^SubsetVertex this]
    (-> this (.maxVertexInputs))))

(defn hash-code
  "returns: `int`"
  (^Integer [^SubsetVertex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^SubsetVertex this ^java.lang.Object o]
    (-> this (.equals o))))

