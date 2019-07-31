(ns org.deeplearning4j.nn.conf.graph.ScaleVertex
  "A ScaleVertex is used to scale the size of activations of a single layer
 For example, ResNet activations can be scaled in repeating blocks to keep variance
 under control."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph ScaleVertex]))

(defn ->scale-vertex
  "Constructor.

  scale-factor - `double`"
  (^ScaleVertex [^Double scale-factor]
    (new ScaleVertex scale-factor)))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^ScaleVertex this]
    (-> this (.minVertexInputs))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^ScaleVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^ScaleVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^ScaleVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^org.deeplearning4j.nn.graph.vertex.GraphVertex [^ScaleVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.ScaleVertex`"
  (^org.deeplearning4j.nn.conf.graph.ScaleVertex [^ScaleVertex this]
    (-> this (.clone))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^ScaleVertex this]
    (-> this (.maxVertexInputs))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ScaleVertex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ScaleVertex this ^java.lang.Object o]
    (-> this (.equals o))))

