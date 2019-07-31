(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasZeroPadding3D
  "Imports a Keras ZeroPadding 3D layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasZeroPadding3D]))

(defn ->keras-zero-padding-3-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasZeroPadding3D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasZeroPadding3D layer-config enforce-training-config))
  (^KerasZeroPadding3D [^java.util.Map layer-config]
    (new KerasZeroPadding3D layer-config)))

(defn get-zero-padding-3-d-layer
  "Get DL4J ZeroPadding3DLayer.

  returns: ZeroPadding3DLayer - `org.deeplearning4j.nn.conf.layers.ZeroPadding3DLayer`"
  (^org.deeplearning4j.nn.conf.layers.ZeroPadding3DLayer [^KerasZeroPadding3D this]
    (-> this (.getZeroPadding3DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasZeroPadding3D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

