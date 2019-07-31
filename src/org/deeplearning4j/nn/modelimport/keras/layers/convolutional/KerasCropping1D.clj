(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasCropping1D
  "Imports a Keras Cropping 1D layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasCropping1D]))

(defn ->keras-cropping-1-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasCropping1D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasCropping1D layer-config enforce-training-config))
  (^KerasCropping1D [^java.util.Map layer-config]
    (new KerasCropping1D layer-config)))

(defn get-cropping-1-d-layer
  "Get DL4J Cropping1D layer.

  returns: Cropping1D layer - `org.deeplearning4j.nn.conf.layers.convolutional.Cropping1D`"
  (^org.deeplearning4j.nn.conf.layers.convolutional.Cropping1D [^KerasCropping1D this]
    (-> this (.getCropping1DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasCropping1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

