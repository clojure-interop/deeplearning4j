(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasFlatten
  "Imports a Keras Flatten layer as a DL4J {Cnn,Rnn}ToFeedForwardInputPreProcessor."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasFlatten]))

(defn ->keras-flatten
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasFlatten [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasFlatten layer-config enforce-training-config))
  (^KerasFlatten [^java.util.Map layer-config]
    (new KerasFlatten layer-config)))

(defn input-pre-processor?
  "Whether this Keras layer maps to a DL4J InputPreProcessor.

  returns: true - `boolean`"
  (^Boolean [^KerasFlatten this]
    (-> this (.isInputPreProcessor))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasFlatten this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasFlatten this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

