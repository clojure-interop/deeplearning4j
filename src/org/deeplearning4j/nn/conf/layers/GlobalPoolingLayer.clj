(ns org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer
  "Global pooling layer - used to do pooling over time for RNNs, and 2d pooling for CNNs.
 Supports the following PoolingTypes: SUM, AVG, MAX, PNORM
 Global pooling layer can also handle mask arrays when dealing with variable length inputs. Mask arrays are assumed
 to be 2d, and are fed forward through the network during training or post-training forward pass:
 - Time series: mask arrays are shape [miniBatchSize, maxTimeSeriesLength] and contain values 0 or 1 only
 - CNNs: mask have shape [miniBatchSize, height] or [miniBatchSize, width]. Important: the current implementation assumes
 that for CNNs  variable length (masking), the input shape is [miniBatchSize, channels, height, 1] or
 [miniBatchSize, channels, 1, width] respectively. This is the case with global pooling in architectures like CNN for
 sentence classification.

 Behaviour with default settings:
 - 3d (time series) input with shape [miniBatchSize, vectorSize, timeSeriesLength] -> 2d output [miniBatchSize, vectorSize]
 - 4d (CNN) input with shape [miniBatchSize, channels, height, width] -> 2d output [miniBatchSize, channels]
 - 5d (CNN3D) input with shape [miniBatchSize, channels, depth, height, width] -> 2d output [miniBatchSize, channels]

 Alternatively, by setting collapseDimensions = false in the configuration, it is possible to retain the reduced dimensions
 as 1s: this gives
 - [miniBatchSize, vectorSize, 1] for RNN output,
 - [miniBatchSize, channels, 1, 1] for CNN output, and
 - [miniBatchSize, channels, 1, 1, 1] for CNN3D output."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers GlobalPoolingLayer]))

(defn ->global-pooling-layer
  "Constructor.

  pooling-type - `org.deeplearning4j.nn.conf.layers.PoolingType`"
  (^GlobalPoolingLayer [^org.deeplearning4j.nn.conf.layers.PoolingType pooling-type]
    (new GlobalPoolingLayer pooling-type))
  (^GlobalPoolingLayer []
    (new GlobalPoolingLayer )))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^GlobalPoolingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^GlobalPoolingLayer this]
    (-> this (.initializer))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^GlobalPoolingLayer this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^GlobalPoolingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^GlobalPoolingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^GlobalPoolingLayer this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^GlobalPoolingLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^GlobalPoolingLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^GlobalPoolingLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

