(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasZeroPadding1D
  "Imports a Keras ZeroPadding 1D layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasZeroPadding1D]))

(defn ->keras-zero-padding-1-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasZeroPadding1D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasZeroPadding1D layer-config enforce-training-config))
  (^KerasZeroPadding1D [^java.util.Map layer-config]
    (new KerasZeroPadding1D layer-config)))

(defn get-zero-padding-1-d-layer
  "Get DL4J ZeroPadding1DLayer.

  returns: ZeroPadding1DLayer - `org.deeplearning4j.nn.conf.layers.ZeroPadding1DLayer`"
  (^org.deeplearning4j.nn.conf.layers.ZeroPadding1DLayer [^KerasZeroPadding1D this]
    (-> this (.getZeroPadding1DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasZeroPadding1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

