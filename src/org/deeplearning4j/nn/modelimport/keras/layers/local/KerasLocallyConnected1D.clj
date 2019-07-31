(ns org.deeplearning4j.nn.modelimport.keras.layers.local.KerasLocallyConnected1D
  "Imports a 1D locally connected layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.local KerasLocallyConnected1D]))

(defn ->keras-locally-connected-1-d
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasLocallyConnected1D [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasLocallyConnected1D layer-config enforce-training-config))
  (^KerasLocallyConnected1D [^java.lang.Integer keras-version]
    (new KerasLocallyConnected1D keras-version)))

(defn get-locally-connected-1-d-layer
  "Get DL4J LocallyConnected1D layer.

  returns: Locally connected 1D layer. - `org.deeplearning4j.nn.conf.layers.LocallyConnected1D`"
  (^org.deeplearning4j.nn.conf.layers.LocallyConnected1D [^KerasLocallyConnected1D this]
    (-> this (.getLocallyConnected1DLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasLocallyConnected1D this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn set-weights
  "Set weights for 1D locally connected layer.

  weights - Map from parameter name to INDArray. - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasLocallyConnected1D this ^java.util.Map weights]
    (-> this (.setWeights weights))))

