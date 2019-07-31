(ns org.deeplearning4j.nn.modelimport.keras.layers.pooling.KerasPooling1D
  "Imports a Keras 1D Pooling layer as a DL4J Subsampling layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.pooling KerasPooling1D]))

(defn ->keras-pooling-1-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasPooling1D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasPooling1D layer-config enforce-training-config))
  (^KerasPooling1D [^java.util.Map layer-config]
    (new KerasPooling1D layer-config)))

(defn get-subsampling-1-d-layer
  "Get DL4J Subsampling1DLayer.

  returns: Subsampling1DLayer - `org.deeplearning4j.nn.conf.layers.Subsampling1DLayer`"
  (^org.deeplearning4j.nn.conf.layers.Subsampling1DLayer [^KerasPooling1D this]
    (-> this (.getSubsampling1DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasPooling1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

