(ns org.deeplearning4j.nn.modelimport.keras.layers.advanced.activations.KerasPReLU
  "Imports PReLU layer from Keras"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.advanced.activations KerasPReLU]))

(defn ->keras-p-re-lu
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasPReLU [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasPReLU layer-config enforce-training-config))
  (^KerasPReLU [^java.util.Map layer-config]
    (new KerasPReLU layer-config)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasPReLU this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-p-re-lu-layer
  "Get DL4J ActivationLayer.

  returns: ActivationLayer - `org.deeplearning4j.nn.conf.layers.PReLULayer`"
  (^org.deeplearning4j.nn.conf.layers.PReLULayer [^KerasPReLU this]
    (-> this (.getPReLULayer))))

(defn set-weights
  "Set weights for layer.

  weights - Dense layer weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasPReLU this ^java.util.Map weights]
    (-> this (.setWeights weights))))

