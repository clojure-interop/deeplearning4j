(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasConvolution1D
  "Imports a 1D Convolution layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasConvolution1D]))

(defn ->keras-convolution-1-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^KerasConvolution1D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasConvolution1D layer-config enforce-training-config))
  (^KerasConvolution1D [^java.lang.Integer keras-version]
    (new KerasConvolution1D keras-version)))

(defn get-convolution-1-d-layer
  "Get DL4J ConvolutionLayer.

  returns: ConvolutionLayer - `org.deeplearning4j.nn.conf.layers.Convolution1DLayer`"
  (^org.deeplearning4j.nn.conf.layers.Convolution1DLayer [^KerasConvolution1D this]
    (-> this (.getConvolution1DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasConvolution1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasConvolution1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn set-weights
  "Set weights for layer.

  weights - Map from parameter name to INDArray. - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasConvolution1D this ^java.util.Map weights]
    (-> this (.setWeights weights))))

