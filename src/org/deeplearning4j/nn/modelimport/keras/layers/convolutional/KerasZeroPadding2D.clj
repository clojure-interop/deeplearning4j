(ns org.deeplearning4j.nn.modelimport.keras.layers.convolutional.KerasZeroPadding2D
  "Imports a Keras ZeroPadding 2D layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.convolutional KerasZeroPadding2D]))

(defn ->keras-zero-padding-2-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasZeroPadding2D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasZeroPadding2D layer-config enforce-training-config))
  (^KerasZeroPadding2D [^java.util.Map layer-config]
    (new KerasZeroPadding2D layer-config)))

(defn get-zero-padding-2-d-layer
  "Get DL4J ZeroPadding2DLayer.

  returns: ZeroPadding2DLayer - `org.deeplearning4j.nn.conf.layers.ZeroPaddingLayer`"
  (^org.deeplearning4j.nn.conf.layers.ZeroPaddingLayer [^KerasZeroPadding2D this]
    (-> this (.getZeroPadding2DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasZeroPadding2D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

