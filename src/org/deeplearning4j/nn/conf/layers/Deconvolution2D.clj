(ns org.deeplearning4j.nn.conf.layers.Deconvolution2D
  "2D deconvolution layer configuration
 Deconvolutions are also known as transpose convolutions or fractionally strided convolutions.
 In essence, deconvolutions swap forward and backward pass with regular 2D convolutions.
 See the paper by Matt Zeiler for details:
 http://www.matthewzeiler.com/wp-content/uploads/2017/07/cvpr2010.pdf
 For an intuitive guide to convolution arithmetic and shapes, see:
 https://arxiv.org/abs/1603.07285v1"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers Deconvolution2D]))

(defn has-bias?
  "returns: `boolean`"
  (^Boolean [^Deconvolution2D this]
    (-> this (.hasBias))))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.layers.Deconvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D [^Deconvolution2D this]
    (-> this (.clone))))

(defn instantiate
  "conf - `org.deeplearning4j.nn.conf.NeuralNetConfiguration`
  training-listeners - `java.util.Collection`
  layer-index - `int`
  layer-params-view - `org.nd4j.linalg.api.ndarray.INDArray`
  initialize-params - `boolean`

  returns: `org.deeplearning4j.nn.api.Layer`"
  (^org.deeplearning4j.nn.api.Layer [^Deconvolution2D this ^org.deeplearning4j.nn.conf.NeuralNetConfiguration conf ^java.util.Collection training-listeners ^Integer layer-index ^org.nd4j.linalg.api.ndarray.INDArray layer-params-view ^Boolean initialize-params]
    (-> this (.instantiate conf training-listeners layer-index layer-params-view initialize-params))))

(defn initializer
  "returns: The parameter initializer for this model - `org.deeplearning4j.nn.api.ParamInitializer`"
  (^org.deeplearning4j.nn.api.ParamInitializer [^Deconvolution2D this]
    (-> this (.initializer))))

(defn get-output-type
  "Description copied from class: Layer

  layer-index - Index of the layer - `int`
  input-type - Type of input for the layer - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: Type of output from the layer - `org.deeplearning4j.nn.conf.inputs.InputType`"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^Deconvolution2D this ^Integer layer-index ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType layer-index input-type))))

