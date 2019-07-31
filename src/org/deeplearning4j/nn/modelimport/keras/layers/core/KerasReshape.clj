(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasReshape
  "Imports Reshape layer from Keras"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasReshape]))

(defn ->keras-reshape
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasReshape [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasReshape layer-config enforce-training-config))
  (^KerasReshape [^java.util.Map layer-config]
    (new KerasReshape layer-config)))

(defn input-pre-processor?
  "Whether this Keras layer maps to a DL4J InputPreProcessor.

  returns: true - `boolean`"
  (^Boolean [^KerasReshape this]
    (-> this (.isInputPreProcessor))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasReshape this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn target-shape-for-dim-order
  "input-shape - `long[]`
  target-shape - `long[]`

  returns: `long[]`"
  ([^KerasReshape this input-shape target-shape]
    (-> this (.targetShapeForDimOrder input-shape target-shape))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasReshape this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

