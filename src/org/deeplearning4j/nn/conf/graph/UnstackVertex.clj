(ns org.deeplearning4j.nn.conf.graph.UnstackVertex
  "UnstackVertex allows for unstacking of inputs so that they may be forwarded through
 a network. This is useful for cases such as Triplet Embedding, where embeddings can
 be separated and run through subsequent layers.
 Works similarly to SubsetVertex, except on dimension 0 of the input."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph UnstackVertex]))

(defn ->unstack-vertex
  "Constructor.

  from - The first column index of the stacked inputs. - `int`
  stack-size - The total number of stacked inputs. An interval is automaticallycalculated according to the size of the first dimension. - `int`"
  (^UnstackVertex [^Integer from ^Integer stack-size]
    (new UnstackVertex from stack-size)))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^UnstackVertex this]
    (-> this (.minVertexInputs))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^UnstackVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^UnstackVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^UnstackVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^org.deeplearning4j.nn.graph.vertex.GraphVertex [^UnstackVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.UnstackVertex`"
  (^org.deeplearning4j.nn.conf.graph.UnstackVertex [^UnstackVertex this]
    (-> this (.clone))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^UnstackVertex this]
    (-> this (.maxVertexInputs))))

(defn hash-code
  "returns: `int`"
  (^Integer [^UnstackVertex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^UnstackVertex this ^java.lang.Object o]
    (-> this (.equals o))))

