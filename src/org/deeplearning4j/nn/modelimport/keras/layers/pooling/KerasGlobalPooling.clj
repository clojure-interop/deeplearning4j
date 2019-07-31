(ns org.deeplearning4j.nn.modelimport.keras.layers.pooling.KerasGlobalPooling
  "Imports a Keras Pooling layer as a DL4J Subsampling layer."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.pooling KerasGlobalPooling]))

(defn ->keras-global-pooling
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasGlobalPooling [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasGlobalPooling layer-config enforce-training-config))
  (^KerasGlobalPooling [^java.util.Map layer-config]
    (new KerasGlobalPooling layer-config)))

(defn get-global-pooling-layer
  "Get DL4J SubsamplingLayer.

  returns: SubsamplingLayer - `org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer`"
  (^org.deeplearning4j.nn.conf.layers.GlobalPoolingLayer [^KerasGlobalPooling this]
    (-> this (.getGlobalPoolingLayer))))

(defn get-input-preprocessor
  "Gets appropriate DL4J InputPreProcessor for given InputTypes.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: DL4J InputPreProcessor - `org.deeplearning4j.nn.conf.InputPreProcessor`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.InputPreProcessor [^KerasGlobalPooling this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getInputPreprocessor input-type))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasGlobalPooling this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

