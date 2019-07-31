(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasUpsampling3D
  "Keras Upsampling3D layer support"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasUpsampling3D]))

(defn ->keras-upsampling-3-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^KerasUpsampling3D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasUpsampling3D layer-config enforce-training-config))
  (^KerasUpsampling3D [^java.util.Map layer-config]
    (new KerasUpsampling3D layer-config)))

(defn get-upsampling-3-d-layer
  "Get DL4J Upsampling3D layer.

  returns: Upsampling3D layer - `org.deeplearning4j.nn.conf.layers.Upsampling3D`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling3D [^KerasUpsampling3D this]
    (-> this (.getUpsampling3DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasUpsampling3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

