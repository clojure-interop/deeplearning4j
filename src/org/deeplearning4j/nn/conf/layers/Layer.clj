(ns org.deeplearning4j.nn.conf.layers.Layer
  "A neural network layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Layer]))

(defn ->layer
  "Constructor.

  builder - `org.deeplearning4j.nn.conf.layers.Layer$Builder`"
  (^Layer [^org.deeplearning4j.nn.conf.layers.Layer$Builder builder]
    (new Layer builder)))

(defn get-pre-processor-for-input-type
  "For the given type of input to this layer, what preprocessor (if any) is required?
  Returns null if no preprocessor is required, otherwise returns an appropriate InputPreProcessor
  for this layer, such as a CnnToFeedForwardPreProcessor

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: java.lang.IllegalStateException - if input type is invalid for this layer"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^Layer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^Layer this]
    (-> this (.initializer))))

(defn pretrain-param?
  "Is the specified parameter a layerwise pretraining only parameter?
  For example, visible bias params in an autoencoder (or, decoder params in a variational autoencoder) aren't
  used during supervised backprop.
  Layers (like DenseLayer, etc) with no pretrainable parameters will return false for all (valid) inputs.

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^Layer this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Get the updater for the given parameter. Typically the same updater will be used for all updaters, but this
  is not necessarily the case

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^Layer this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn reset-layer-default-config
  "Reset the learning related configs of the layer to default. When instantiated with a global neural network configuration
  the parameters specified in the neural network configuration will be used.
  For internal use with the transfer learning API. Users should not have to call this method directly."
  ([^Layer this]
    (-> this (.resetLayerDefaultConfig))))

(defn get-memory-report
  "This is a report of the estimated memory consumption for the given layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^Layer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn set-n-in
  "Set the nIn value (number of inputs, or input channels for CNNs) based on the given input type

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`

  throws: java.lang.IllegalStateException - if input type is invalid for this layer"
  ([^Layer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-output-type
  "For a given type of input to this layer, what is the type of the output?

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: java.lang.IllegalStateException - if input type is invalid for this layer"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Layer this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn set-pretrain
  "pretrain - Whether the layer is currently undergoing layerwise unsupervised training, or multi-layer backprop - `boolean`"
  ([^Layer this ^Boolean pretrain]
    (-> this (.setPretrain pretrain))))

(defn get-l-2-by-param
  "Get the L2 coefficient for the given parameter.
  Different parameters may have different L2 values, even for a single .l2(x) configuration.
  For example, biases generally aren't L1 regularized, even if weights are

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^Layer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^Layer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^Layer this]
    (-> this (.clone))))

(defn get-l-1-by-param
  "Get the L1 coefficient for the given parameter.
  Different parameters may have different L1 values, even for a single .l1(x) configuration.
  For example, biases generally aren't L1 regularized, even if weights are

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^Layer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

