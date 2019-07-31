(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasAtrousConvolution1D
  "Keras 1D atrous / dilated convolution layer. Note that in keras 2 this layer has been
 removed and dilations are now available through the \"dilated\" argument in regular Conv1D layers

 author: Max Pumperla"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasAtrousConvolution1D]))

(defn ->keras-atrous-convolution-1-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasAtrousConvolution1D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasAtrousConvolution1D layer-config enforce-training-config))
  (^KerasAtrousConvolution1D [^java.lang.Integer keras-version]
    (new KerasAtrousConvolution1D keras-version)))

(defn get-atrous-convolution-1-d
  "Get DL4J ConvolutionLayer.

  returns: ConvolutionLayer - `org.deeplearning4j.nn.conf.layers.Convolution1DLayer`"
  (^org.deeplearning4j.nn.conf.layers.Convolution1DLayer [^KerasAtrousConvolution1D this]
    (-> this (.getAtrousConvolution1D))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasAtrousConvolution1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

