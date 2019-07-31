(ns org.deeplearning4j.nn.conf.graph.ShiftVertex
  "A ShiftVertex is used to shift the activations of a single layer
 One could use it to add a bias or as part of some other calculation.
 For example, Highway Layers need them in two places. One, it's often
 useful to have the gate weights have a large negative bias. (Of course
 for this, we could just initialize the biases that way.)
 But, _also_ it needs to do this:
 (1-sigmoid(weight * input  bias)) (*) input  sigmoid(weight * input  bias) (*) activation(w2 * input  bias) ((*) is hadamard product)
 So, here, we could have
 1. a DenseLayer that does the sigmoid
 2. a ScaleVertex(-1) and
 3. a ShiftVertex(1)
 to accomplish that."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph ShiftVertex]))

(defn ->shift-vertex
  "Constructor.

  shift-factor - `double`"
  (^ShiftVertex [^Double shift-factor]
    (new ShiftVertex shift-factor)))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.ShiftVertex`"
  (^org.deeplearning4j.nn.conf.graph.ShiftVertex [^ShiftVertex this]
    (-> this (.clone))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^ShiftVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^ShiftVertex this]
    (-> this (.minVertexInputs))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^ShiftVertex this]
    (-> this (.maxVertexInputs))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^org.deeplearning4j.nn.graph.vertex.GraphVertex [^ShiftVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^ShiftVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^ShiftVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

