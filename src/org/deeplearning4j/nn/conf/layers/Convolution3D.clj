(ns org.deeplearning4j.nn.conf.layers.Convolution3D
  "3D convolution layer configuration"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Convolution3D]))

(defn ->convolution-3-d
  "Constructor.

  3-dimensional convolutional layer configuration
  nIn in the input layer is the number of channels
  nOut is the number of filters to be used in the net or in other words the depth
  The builder specifies the filter/kernel size, the stride and padding
  The pooling layer takes the kernel size

  builder - `org.deeplearning4j.nn.conf.layers.Convolution3D$Builder`"
  (^Convolution3D [^org.deeplearning4j.nn.conf.layers.Convolution3D$Builder builder]
    (new Convolution3D builder)))

(defn has-bias?
  "returns: `boolean`"
  (^Boolean [^Convolution3D this]
    (-> this (.hasBias))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.Convolution3D`"
  (^org.deeplearning4j.nn.conf.layers.Convolution3D [^Convolution3D this]
    (-> this (.clone))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  iteration-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^Convolution3D this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection iteration-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf iteration-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^Convolution3D this]
    (-> this (.initializer))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Convolution3D this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

(defn get-pre-processor-for-input-type
  "Description copied from class: Layer

  input-type - InputType to this layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Null if no preprocessor is required, otherwise the type of preprocessor necessary for this layer/input combination - `org.deeplearning4j.nn.conf.InputPreProcessor`"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^Convolution3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getPreProcessorForInputType input-type))))

(defn set-n-in
  "Description copied from class: Layer

  input-type - Input type for this layer - `org.deeplearning4j.nn.conf.inputs.InputType`
  override - If false: only set the nIn value if it's not already set. If true: set it regardless of whether it'salready set or not. - `boolean`"
  ([^Convolution3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type ^Boolean override]
    (-> this (.setNIn input-type override))))

