(ns org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D
  "2D depth-wise convolution layer configuration.

 Performs a channels-wise convolution, which
 operates on each of the input maps separately. A channel multiplier is used to
 specify the number of outputs per input map. This convolution
 is carried out with the specified kernel sizes, stride and padding values."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers DepthwiseConvolution2D]))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D [^DepthwiseConvolution2D this]
    (-> this (.clone))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^DepthwiseConvolution2D this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^DepthwiseConvolution2D this]
    (-> this (.initializer))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^DepthwiseConvolution2D this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

