(ns org.deeplearning4j.nn.conf.layers.samediff.AbstractSameDiffLayer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.samediff AbstractSameDiffLayer]))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^AbstractSameDiffLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn define-parameters
  "Define the parameters for the network. Use SDLayerParams.addWeightParam(String, long...) and
  SDLayerParams.addBiasParam(String, long...)

  params - Object used to set parameters for this layer - `org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams`"
  ([^AbstractSameDiffLayer this ^org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams params]
    (-> this (.defineParameters params))))

(defn get-layer-params
  "returns: `org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams`"
  (^org.deeplearning4j.nn.conf.layers.samediff.SDLayerParams [^AbstractSameDiffLayer this]
    (-> this (.getLayerParams))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^AbstractSameDiffLayer this]
    (-> this (.initializer))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^AbstractSameDiffLayer this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^AbstractSameDiffLayer this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^AbstractSameDiffLayer this]
    (-> this (.isPretrain))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^AbstractSameDiffLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^AbstractSameDiffLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn apply-global-config-to-layer
  "global-config - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  ([^AbstractSameDiffLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder global-config]
    (-> this (.applyGlobalConfigToLayer global-config))))

(defn param-reshape-order
  "Returns the memory layout ('c' or 'f' order - i.e., row/column major) of the parameters. In most cases,
  this can/should be left

  param - Name of the parameter - `java.lang.String`

  returns: Memory layout ('c' or 'f') of the parameter - `char`"
  (^Character [^AbstractSameDiffLayer this ^java.lang.String param]
    (-> this (.paramReshapeOrder param))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^AbstractSameDiffLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^AbstractSameDiffLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initialize-parameters
  "Set the initial parameter values for this layer, if required

  params - Parameter arrays that may be initialized - `java.util.Map`"
  ([^AbstractSameDiffLayer this ^java.util.Map params]
    (-> this (.initializeParameters params))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^AbstractSameDiffLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn apply-global-config
  "b - `org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder`"
  ([^AbstractSameDiffLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration$Builder b]
    (-> this (.applyGlobalConfig b))))

