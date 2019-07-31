(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasDeconvolution2D
  "Imports a 2D Deconvolution layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasDeconvolution2D]))

(defn ->keras-deconvolution-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasDeconvolution2D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasDeconvolution2D layer-config enforce-training-config))
  (^KerasDeconvolution2D [^java.lang.Integer keras-version]
    (new KerasDeconvolution2D keras-version)))

(defn get-deconvolution-2-d-layer
  "Get DL4J ConvolutionLayer.

  returns: ConvolutionLayer - `org.deeplearning4j.nn.conf.layers.Deconvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.Deconvolution2D [^KerasDeconvolution2D this]
    (-> this (.getDeconvolution2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasDeconvolution2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

