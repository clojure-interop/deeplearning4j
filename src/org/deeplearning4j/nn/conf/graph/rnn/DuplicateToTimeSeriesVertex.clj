(ns org.deeplearning4j.nn.conf.graph.rnn.DuplicateToTimeSeriesVertex
  "DuplicateToTimeSeriesVertex is a vertex that goes from 2d activations to a 3d time series activations, by means of
 duplication. That is, given a 2d input with shape [numExamples,nIn] duplicate each row to give output of
 [numExamples,nIn,timeSeriesLength], where the activations are the same for all time steps.
 This method is used for example in sequence to sequence models.
 Note: The length of the output time series (number of time steps) is determined by means of referencing one of the
 inputs in the ComputationGraph. That is: Because the length of the time series may differ at runtime, we generally want the number
 of time steps to match some other input; here, we are specifying the length of the output time series to be the same as
 one of the input time series"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph.rnn DuplicateToTimeSeriesVertex]))

(defn ->duplicate-to-time-series-vertex
  "Constructor.

  input-name - Name of the input in the ComputationGraph network to use, to determine how long the output timeseries should be. This input should (a) exist, and (b) be a time series input - `java.lang.String`"
  (^DuplicateToTimeSeriesVertex [^java.lang.String input-name]
    (new DuplicateToTimeSeriesVertex input-name)))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^DuplicateToTimeSeriesVertex this]
    (-> this (.minVertexInputs))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^DuplicateToTimeSeriesVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^DuplicateToTimeSeriesVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^DuplicateToTimeSeriesVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^org.deeplearning4j.nn.graph.vertex.GraphVertex [^DuplicateToTimeSeriesVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.GraphVertex`"
  (^org.deeplearning4j.nn.conf.graph.GraphVertex [^DuplicateToTimeSeriesVertex this]
    (-> this (.clone))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^DuplicateToTimeSeriesVertex this]
    (-> this (.maxVertexInputs))))

(defn hash-code
  "returns: `int`"
  (^Integer [^DuplicateToTimeSeriesVertex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^DuplicateToTimeSeriesVertex this ^java.lang.Object o]
    (-> this (.equals o))))

