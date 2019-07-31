(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasUpsampling1D
  "Keras Upsampling1D layer support"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasUpsampling1D]))

(defn ->keras-upsampling-1-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^KerasUpsampling1D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasUpsampling1D layer-config enforce-training-config))
  (^KerasUpsampling1D [^java.util.Map layer-config]
    (new KerasUpsampling1D layer-config)))

(defn get-upsampling-1-d-layer
  "Get DL4J Upsampling1D layer.

  returns: Upsampling1D layer - `org.deeplearning4j.nn.conf.layers.Upsampling1D`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling1D [^KerasUpsampling1D this]
    (-> this (.getUpsampling1DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasUpsampling1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

