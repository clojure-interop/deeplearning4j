(ns org.deeplearning4j.nn.modelimport.keras.layers.advanced.activations.KerasLeakyReLU
  "Imports LeakyReLU layer from Keras"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.advanced.activations KerasLeakyReLU]))

(defn ->keras-leaky-re-lu
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasLeakyReLU [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasLeakyReLU layer-config enforce-training-config))
  (^KerasLeakyReLU [^java.util.Map layer-config]
    (new KerasLeakyReLU layer-config)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasLeakyReLU this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-activation-layer
  "Get DL4J ActivationLayer.

  returns: ActivationLayer - `org.deeplearning4j.nn.conf.layers.ActivationLayer`"
  (^org.deeplearning4j.nn.conf.layers.ActivationLayer [^KerasLeakyReLU this]
    (-> this (.getActivationLayer))))

