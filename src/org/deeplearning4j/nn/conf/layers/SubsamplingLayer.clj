(ns org.deeplearning4j.nn.conf.layers.SubsamplingLayer
  "Subsampling layer also referred to as pooling in convolution neural nets
 Supports the following pooling types: MAX, AVG, SUM, PNORM, NONE"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SubsamplingLayer]))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^SubsamplingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^SubsamplingLayer this]
    (-> this (.initializer))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^SubsamplingLayer this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^SubsamplingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^SubsamplingLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^SubsamplingLayer this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^SubsamplingLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^SubsamplingLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.SubsamplingLayer`"
  (^org.deeplearning4j.nn.conf.layers.SubsamplingLayer [^SubsamplingLayer this]
    (-> this (.clone))))

(defn get-eps
  "returns: `double`"
  (^Double [^SubsamplingLayer this]
    (-> this (.getEps))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^SubsamplingLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-pnorm
  "returns: `int`"
  (^Integer [^SubsamplingLayer this]
    (-> this (.getPnorm))))

