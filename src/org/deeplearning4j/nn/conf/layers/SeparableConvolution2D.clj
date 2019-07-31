(ns org.deeplearning4j.nn.conf.layers.SeparableConvolution2D
  "2D Separable convolution layer configuration.
 Separable convolutions split a regular convolution operation into two
 simpler operations, which are usually computationally more efficient.
 The first step in a separable convolution is a channels-wise convolution, which
 operates on each of the input maps separately. A channels multiplier is used to
 specify the number of outputs per input map in this step. This convolution
 is carried out with the specified kernel sizes, stride and padding values.
 The second step is a point-wise operation, in which the intermediary outputs
 of the channels-wise convolution are mapped to the desired number of feature
 maps, by using a 1x1 convolution.
 The result of chaining these two operations will result in a tensor of the
 same shape as that for a standard conv2d operation."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers SeparableConvolution2D]))

(defn has-bias?
  "returns: `boolean`"
  (^Boolean [^SeparableConvolution2D this]
    (-> this (.hasBias))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D [^SeparableConvolution2D this]
    (-> this (.clone))))

(defn get-l-1-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L1 value for that parameter - `double`"
  (^Double [^SeparableConvolution2D this ^java.lang.String param-name]
    (-> this (.getL1ByParam param-name))))

(defn get-l-2-by-param
  "Description copied from class: Layer

  param-name - Parameter name - `java.lang.String`

  returns: L2 value for that parameter - `double`"
  (^Double [^SeparableConvolution2D this ^java.lang.String param-name]
    (-> this (.getL2ByParam param-name))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^SeparableConvolution2D this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^SeparableConvolution2D this]
    (-> this (.initializer))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^SeparableConvolution2D this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

