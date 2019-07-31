(ns org.deeplearning4j.nn.modelimport.keras.layers.noise.KerasAlphaDropout
  "Keras wrapper for DL4J dropout layer with AlphaDropout."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.noise KerasAlphaDropout]))

(defn ->keras-alpha-dropout
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasAlphaDropout [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasAlphaDropout layer-config enforce-training-config))
  (^KerasAlphaDropout [^java.lang.Integer keras-version]
    (new KerasAlphaDropout keras-version)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasAlphaDropout this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-alpha-dropout-layer
  "Get DL4J DropoutLayer with Alpha dropout.

  returns: DropoutLayer - `org.deeplearning4j.nn.conf.layers.DropoutLayer`"
  (^org.deeplearning4j.nn.conf.layers.DropoutLayer [^KerasAlphaDropout this]
    (-> this (.getAlphaDropoutLayer))))

