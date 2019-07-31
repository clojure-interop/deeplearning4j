(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasConvolution2D
  "Imports a 2D Convolution layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasConvolution2D]))

(defn ->keras-convolution-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasConvolution2D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasConvolution2D layer-config enforce-training-config))
  (^KerasConvolution2D [^java.lang.Integer keras-version]
    (new KerasConvolution2D keras-version)))

(defn get-convolution-2-d-layer
  "Get DL4J ConvolutionLayer.

  returns: ConvolutionLayer - `org.deeplearning4j.nn.conf.layers.ConvolutionLayer`"
  (^org.deeplearning4j.nn.conf.layers.ConvolutionLayer [^KerasConvolution2D this]
    (-> this (.getConvolution2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasConvolution2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

