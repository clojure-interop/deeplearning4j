(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasSeparableConvolution2D
  "Keras separable convolution 2D layer support"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasSeparableConvolution2D]))

(defn ->keras-separable-convolution-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^KerasSeparableConvolution2D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasSeparableConvolution2D layer-config enforce-training-config))
  (^KerasSeparableConvolution2D [^java.lang.Integer keras-version]
    (new KerasSeparableConvolution2D keras-version)))

(defn set-weights
  "Set weights for layer.

  weights - Map of weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasSeparableConvolution2D this ^java.util.Map weights]
    (-> this (.setWeights weights))))

(defn get-separable-convolution-2-d-layer
  "Get DL4J SeparableConvolution2D.

  returns: SeparableConvolution2D - `org.deeplearning4j.nn.conf.layers.SeparableConvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.SeparableConvolution2D [^KerasSeparableConvolution2D this]
    (-> this (.getSeparableConvolution2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasSeparableConvolution2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

