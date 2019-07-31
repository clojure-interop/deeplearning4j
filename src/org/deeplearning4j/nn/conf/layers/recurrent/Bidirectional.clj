(ns org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional
  "Bidirectional is a \"wrapper\" layer: it wraps any uni-directional RNN layer to make it bidirectional.
 Note that multiple different modes are supported - these specify how the activations should be combined from
 the forward and backward RNN networks. See Bidirectional.Mode javadoc for more details.
 Parameters are not shared here - there are 2 separate copies of the wrapped RNN layer, each with separate parameters.

 Usage: .layer(new Bidirectional(new LSTM.Builder()....build())"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers.recurrent Bidirectional]))

(defn ->bidirectional
  "Constructor.

  Create a Bidirectional wrapper for the specified layer

  mode - Mode to use to combine activations. See Bidirectional.Mode for details - `org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode`
  layer - layer to wrap - `org.deeplearning4j.nn.conf.layers.Layer`"
  (^Bidirectional [^org.deeplearning4j.nn.conf.layers.recurrent.Bidirectional$Mode mode ^org.deeplearning4j.nn.conf.layers.Layer layer]
    (new Bidirectional mode layer))
  (^Bidirectional [^org.deeplearning4j.nn.conf.layers.Layer layer]
    (new Bidirectional layer)))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^Bidirectional this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^Bidirectional this]
    (-> this (.initializer))))

(defn pretrain-param?
  "Description copied from class: Layer

  param-name - Parameter name/key - `java.lang.String`

  returns: True if the parameter is for layerwise pretraining only, false otherwise - `boolean`"
  (^Boolean [^Bidirectional this ^java.lang.String param-name]
    (-> this (.isPretrainParam param-name))))

(defn get-updater-by-param
  "Get the updater for the given parameter. Typically the same updater will be used for all updaters, but this
  is not necessarily the case

  param-name - Parameter name - `java.lang.String`

  returns: IUpdater for the parameter - `org.nd4j.linalg.learning.config.IUpdater`"
  (^org.nd4j.linalg.learning.config.IUpdater [^Bidirectional this ^java.lang.String param-name]
    (-> this (.getUpdaterByParam param-name))))

(defn pretrain?
  "returns: True if the layer is set up for layerwise pretraining - `boolean`"
  (^Boolean [^Bidirectional this]
    (-> this (.isPretrain))))

(defn get-n-out
  "returns: `long`"
  (^Long [^Bidirectional this]
    (-> this (.getNOut))))

(defn set-layer-name
  "layer-name - `java.lang.String`"
  ([^Bidirectional this ^java.lang.String layer-name]
    (-> this (.setLayerName layer-name))))

(defn get-memory-report
  "Description copied from class: Layer

  input-type - Input type to the layer. Memory consumption is often a function of the input type - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Memory report for the layer - `org.deeplearning4j.nn.conf.memory.LayerMemoryReport`"
  (^org.deeplearning4j.nn.conf.memory.LayerMemoryReport [^Bidirectional this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getMemoryReport input-type))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^Bidirectional this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Bidirectional this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn get-n-in
  "returns: `long`"
  (^Long [^Bidirectional this]
    (-> this (.getNIn))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^Bidirectional this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn get-gradient-normalization
  "returns: The gradient normalization configuration - `org.deeplearning4j.nn.conf.GradientNormalization`"
  (^org.deeplearning4j.nn.conf.GradientNormalization [^Bidirectional this]
    (-> this (.getGradientNormalization))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^Bidirectional this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn get-gradient-normalization-threshold
  "returns: The gradient normalization threshold - `double`"
  (^Double [^Bidirectional this]
    (-> this (.getGradientNormalizationThreshold))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^Bidirectional this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

