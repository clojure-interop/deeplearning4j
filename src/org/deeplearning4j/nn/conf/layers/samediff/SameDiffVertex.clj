(ns org.deeplearning4j.nn.conf.layers.samediff.SameDiffVertex
  "A SameDiff-based GraphVertex. May have multiple inputs, but only one output. Supports trainable parameters.
 To implement a SameDiff vertex, define the following methods:"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff SameDiffVertex]))

(defn ->same-diff-vertex
  "Constructor."
  (^SameDiffVertex []
    (new SameDiffVertex )))

(defn define-vertex
  "Define the vertex

  same-diff - SameDiff instance - `org.nd4j.autodiff.samediff.SameDiff`
  layer-input - Input to the layer - keys as defined by defineParametersAndInputs(SDVertexParams) - `java.util.Map`
  param-table - Parameter table - keys as defined by defineParametersAndInputs(SDVertexParams) - `java.util.Map`

  returns: The final layer variable corresponding to the activations/output from the forward pass - `org.nd4j.autodiff.samediff.SDVariable`"
  (^org.nd4j.autodiff.samediff.SDVariable [^SameDiffVertex this ^org.nd4j.autodiff.samediff.SameDiff same-diff ^java.util.Map layer-input ^java.util.Map param-table]
    (-> this (.defineVertex same-diff layer-input param-table))))

(defn pretrain-param?
  "Description copied from interface: TrainingConfig

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^SameDiffVertex this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Description copied from interface: TrainingConfig

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^SameDiffVertex this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^SameDiffVertex this]
    (-> this (.isPretrain))))

(defn define-parameters-and-inputs
  "Define the parameters - and inputs - for the network.
  Use SDLayerParams.addWeightParam(String, long...) and
  SDLayerParams.addBiasParam(String, long...).
  Note also you must define (and optionally name) the inputs to the vertex. This is required so that
  DL4J knows how many inputs exists for the vertex.

  params - Object used to set parameters for this layer - `org.deeplearning4j.nn.conf.layers.samediff.SDVertexParams`"
  ([^SameDiffVertex this ^org.deeplearning4j.nn.conf.layers.samediff.SDVertexParams params]
    (-> this (.defineParametersAndInputs params))))

(defn min-vertex-inputs
  "returns: The Smallest valid number of inputs to this vertex - `int`"
  (^Integer [^SameDiffVertex this]
    (-> this (.minVertexInputs))))

(defn get-memory-report
  "Description copied from class: GraphVertex

  input-types - Input types to the vertex. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the vertex - `org.deeplearning4j.nn.conf.memory.MemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.MemoryReport [^SameDiffVertex this ^org.deeplearning4j.nn.conf.inputs.InputType input-types]
    (-> this (.getMemoryReport input-types))))

(defn get-layer-name
  "returns: Name of the layer - `java.lang.String`"
  (^java.lang.String [^SameDiffVertex this]
    (-> this (.getLayerName))))

(defn get-output-type
  "Description copied from class: GraphVertex

  layer-index - The index of the layer (if appropriate/necessary). - `int`
  vertex-inputs - The inputs to this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: The type of output for this vertex - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.conf.inputs.InvalidInputTypeException - If the input type is invalid for this type of GraphVertex"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^SameDiffVertex this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType vertex-inputs]
    (-> this (.getOutputType layer-index vertex-inputs))))

(defn apply-global-config-to-layer
  "global-config - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  ([^SameDiffVertex this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder global-config]
    (-> this (.applyGlobalConfigToLayer global-config))))

(defn set-pretrain
  "pretrain - Whether the layer is currently undergoing layerwise unsupervised training, or multi-layer backprop - `boolean`"
  ([^SameDiffVertex this ^Boolean pretrain]
    (-> this (.setPretrain pretrain))))

(defn num-params
  "backprop - `boolean`

  returns: `int`"
  (^Integer [^SameDiffVertex this ^Boolean backprop]
    (-> this (.numParams backprop))))

(defn param-reshape-order
  "param-name - `java.lang.String`

  returns: `char`"
  (^Character [^SameDiffVertex this ^java.lang.String param-name]
    (-> this (.paramReshapeOrder param-name))))

(defn get-vertex-params
  "returns: `org.deeplearning4j.nn.conf.layers.samediff.SDVertexParams`"
  (^org.deeplearning4j.nn.conf.layers.samediff.SDVertexParams [^SameDiffVertex this]
    (-> this (.getVertexParams))))

(defn get-l-2-by-param
  "Description copied from interface: TrainingConfig

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^SameDiffVertex this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn get-gradient-normalization
  "returns: The gradient normalization configuration - `org.deeplearning4j.nn.conf.GradientNormalization`"
  (^org.deeplearning4j.nn.conf.GradientNormalization [^SameDiffVertex this]
    (-> this (.getGradientNormalization))))

(defn instantiate
  "Description copied from class: GraphVertex

  graph - The computation graph that this GraphVertex is to be part of - `org.deeplearning4j.nn.graph.ComputationGraph`
  name - The name of the GraphVertex object - `java.lang.String`
  idx - The index of the GraphVertex - `int`
  params-view - A view of the full parameters array - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - If true: initialize the parameters. If false: make no change to the values in the paramsView array - `boolean`

  returns: The implementation GraphVertex object (i.e., implementation, no the configuration) - `org.deeplearning4j.nn.graph.vertex.GraphVertex`"
  (^org.deeplearning4j.nn.graph.vertex.GraphVertex [^SameDiffVertex this ^org.deeplearning4j.nn.graph.ComputationGraph graph ^java.lang.String name ^Integer idx ^org.nd4j.linalg.api.ndarray.INDArray params-view ^Boolean initialize-params]
    (-> this (.instantiate graph name idx params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.graph.GraphVertex`"
  (^org.deeplearning4j.nn.conf.graph.GraphVertex [^SameDiffVertex this]
    (-> this (.clone))))

(defn max-vertex-inputs
  "returns: The largest valid number of inputs to this vertex - `int`"
  (^Integer [^SameDiffVertex this]
    (-> this (.maxVertexInputs))))

(defn get-gradient-normalization-threshold
  "returns: The gradient normalization threshold - `double`"
  (^Double [^SameDiffVertex this]
    (-> this (.getGradientNormalizationThreshold))))

(defn initialize-parameters
  "Set the initial parameter values for this layer, if required

  params - Parameter arrays that may be initialized - `java.util.Map`"
  ([^SameDiffVertex this ^java.util.Map params]
    (-> this (.initializeParameters params))))

(defn get-l-1-by-param
  "Description copied from interface: TrainingConfig

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^SameDiffVertex this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn apply-global-config
  "b - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  ([^SameDiffVertex this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder b]
    (-> this (.applyGlobalConfig b))))

