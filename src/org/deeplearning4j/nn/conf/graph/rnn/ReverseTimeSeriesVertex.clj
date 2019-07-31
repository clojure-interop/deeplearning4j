(ns org.deeplearning4j.nn.conf.graph.rnn.ReverseTimeSeriesVertex
  "ReverseTimeSeriesVertex is used in recurrent neural networks to revert the order of time series.
 As a result, the last time step is moved to the beginning of the time series and the first time step
 is moved to the end. This allows recurrent layers to backward process time series.
 Masks: The input might be masked (to allow for varying time series lengths in one minibatch). In this case the
 present input (mask array = 1) will be reverted in place and the padding (mask array = 0) will be left untouched at
 the same place. For a time series of length n, this would normally mean, that the first n time steps are reverted and
 the following padding is left untouched, but more complex masks are supported (e.g. [1, 0, 1, 0, ...].
 Note: In order to use mask arrays, the constructor must be called with
 the name of an network input. The mask of this input is then used in this vertex, too."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.graph.rnn ReverseTimeSeriesVertex]))

(defn ->reverse-time-series-vertex
  "Constructor.

  Creates a new ReverseTimeSeriesVertex that uses the mask array of a given input

  mask-array-input-name - The name of the input that holds the mask. - `java.lang.String`"
  (^ReverseTimeSeriesVertex [^java.lang.String mask-array-input-name]
    (new ReverseTimeSeriesVertex mask-array-input-name))
  (^ReverseTimeSeriesVertex []
    (new ReverseTimeSeriesVertex )))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^ReverseTimeSeriesVertex this]
    (-> this (.minVertexInputs))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^ReverseTimeSeriesVertex this]
    (-> this (.toString))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^ReverseTimeSeriesVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^ReverseTimeSeriesVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^ReverseTimeSeriesVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.impl.rnn.ReverseTimeSeriesVertex`"
  (^org.deeplearning4j.nn.graph.vertex.impl.rnn.ReverseTimeSeriesVertex [^ReverseTimeSeriesVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.rnn.ReverseTimeSeriesVertex`"
  (^org.deeplearning4j.nn.conf.graph.rnn.ReverseTimeSeriesVertex [^ReverseTimeSeriesVertex this]
    (-> this (.clone))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^ReverseTimeSeriesVertex this]
    (-> this (.maxVertexInputs))))

(defn hash-code
  "returns: `int`"
  (^Integer [^ReverseTimeSeriesVertex this]
    (-> this (.hashCode))))

(defn equals
  "o - `java.lang.Object`

  returns: `boolean`"
  (^Boolean [^ReverseTimeSeriesVertex this ^java.lang.Object o]
    (-> this (.equals o))))

