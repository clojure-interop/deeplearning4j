(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasDepthwiseConvolution2D
  "Keras depth-wise convolution 2D layer support"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasDepthwiseConvolution2D]))

(defn ->keras-depthwise-convolution-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  previous-layers - `java.util.Map`
  layer-names-to-check - `java.util.List`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^KerasDepthwiseConvolution2D [^java.util.Map layer-config ^java.util.Map previous-layers ^java.util.List layer-names-to-check ^Boolean enforce-training-config]
    (new KerasDepthwiseConvolution2D layer-config previous-layers layer-names-to-check enforce-training-config))
  (^KerasDepthwiseConvolution2D [^java.util.Map layer-config ^java.util.Map previous-layers ^Boolean enforce-training-config]
    (new KerasDepthwiseConvolution2D layer-config previous-layers enforce-training-config))
  (^KerasDepthwiseConvolution2D [^java.util.Map layer-config ^java.util.Map previous-layers]
    (new KerasDepthwiseConvolution2D layer-config previous-layers))
  (^KerasDepthwiseConvolution2D [^java.lang.Integer keras-version]
    (new KerasDepthwiseConvolution2D keras-version)))

(defn set-weights
  "Set weights for layer.

  weights - Map of weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasDepthwiseConvolution2D this ^java.util.Map weights]
    (-> this (.setWeights weights))))

(defn get-depthwise-convolution-2-d-layer
  "Get DL4J DepthwiseConvolution2D.

  returns: DepthwiseConvolution2D - `org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D`"
  (^org.deeplearning4j.nn.conf.layers.DepthwiseConvolution2D [^KerasDepthwiseConvolution2D this]
    (-> this (.getDepthwiseConvolution2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasDepthwiseConvolution2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

