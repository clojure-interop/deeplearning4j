(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasCropping3D
  "Imports a Keras Cropping 3D layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasCropping3D]))

(defn ->keras-cropping-3-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasCropping3D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasCropping3D layer-config enforce-training-config))
  (^KerasCropping3D [^java.util.Map layer-config]
    (new KerasCropping3D layer-config)))

(defn get-cropping-3-d-layer
  "Get DL4J Cropping3D layer.

  returns: Cropping3D layer - `org.deeplearning4j.nn.conf.layers.convolutional.Cropping3D`"
  (^org.deeplearning4j.nn.conf.layers.convolutional.Cropping3D [^KerasCropping3D this]
    (-> this (.getCropping3DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasCropping3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

