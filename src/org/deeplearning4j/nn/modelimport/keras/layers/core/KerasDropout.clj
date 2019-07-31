(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasDropout
  "Imports a Dropout layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasDropout]))

(defn ->keras-dropout
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasDropout [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasDropout layer-config enforce-training-config))
  (^KerasDropout [^java.util.Map layer-config]
    (new KerasDropout layer-config)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasDropout this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-dropout-layer
  "Get DL4J DropoutLayer.

  returns: DropoutLayer - `org.deeplearning4j.nn.conf.layers.DropoutLayer`"
  (^org.deeplearning4j.nn.conf.layers.DropoutLayer [^KerasDropout this]
    (-> this (.getDropoutLayer))))

