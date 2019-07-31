(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasCropping2D
  "Imports a Keras Cropping 2D layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasCropping2D]))

(defn ->keras-cropping-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasCropping2D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasCropping2D layer-config enforce-training-config))
  (^KerasCropping2D [^java.util.Map layer-config]
    (new KerasCropping2D layer-config)))

(defn get-cropping-2-d-layer
  "Get DL4J Cropping2D layer.

  returns: Cropping2D layer - `org.deeplearning4j.nn.conf.layers.convolutional.Cropping2D`"
  (^org.deeplearning4j.nn.conf.layers.convolutional.Cropping2D [^KerasCropping2D this]
    (-> this (.getCropping2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasCropping2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

