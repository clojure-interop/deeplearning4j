(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasUpsampling2D
  "Keras Upsampling2D layer support"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasUpsampling2D]))

(defn ->keras-upsampling-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration exception"
  (^KerasUpsampling2D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasUpsampling2D layer-config enforce-training-config))
  (^KerasUpsampling2D [^java.util.Map layer-config]
    (new KerasUpsampling2D layer-config)))

(defn get-upsampling-2-d-layer
  "Get DL4J Upsampling2D layer.

  returns: Upsampling2D layer - `org.deeplearning4j.nn.conf.layers.Upsampling2D`"
  (^org.deeplearning4j.nn.conf.layers.Upsampling2D [^KerasUpsampling2D this]
    (-> this (.getUpsampling2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasUpsampling2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

