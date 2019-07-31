(ns org.deeplearning4j.nn.conf.layers.misc.FrozenLayer
  "Created by Alex on 10/07/2017."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.misc FrozenLayer]))

(defn ->frozen-layer
  "Constructor.

  layer - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^FrozenLayer [^org.deeplearning4j.nn.conf.layers.Layer layer]
    (new FrozenLayer layer)))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^FrozenLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^FrozenLayer this]
    (-> this (.initializer))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^FrozenLayer this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^FrozenLayer this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^FrozenLayer this]
    (-> this (.isPretrain))))

(defn set-layer-name
  "layer-name - `java.lang.String`"
  ([^FrozenLayer this ^java.lang.String layer-name]
    (-> this (.setLayerName layer-name))))

(defn get-inner-conf
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`

  returns: `org.deeplearning4j.nn.conf.NeuralNetConfiguration`"
  (^org.deeplearning4j.nn.conf.NeuralNetConfiguration [^FrozenLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf]
    (-> this (.getInnerConf conf))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^FrozenLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^FrozenLayer this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^FrozenLayer this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn set-constraints
  "constraints - `java.util.List`"
  ([^FrozenLayer this ^java.util.List constraints]
    (-> this (.setConstraints constraints))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^FrozenLayer this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn get-gradient-normalization
  "returns: The gradient normalization configuration - `org.deeplearning4j.nn.conf.GradientNormalization`"
  (^org.deeplearning4j.nn.conf.GradientNormalization [^FrozenLayer this]
    (-> this (.getGradientNormalization))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^FrozenLayer this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.Layer`"
  (^org.deeplearning4j.nn.conf.layers.Layer [^FrozenLayer this]
    (-> this (.clone))))

(defn get-gradient-normalization-threshold
  "returns: The gradient normalization threshold - `double`"
  (^Double [^FrozenLayer this]
    (-> this (.getGradientNormalizationThreshold))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^FrozenLayer this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

