(ns org.deeplearning4j.nn.modelimport.keras.layers.core.KerasActivation
  "Imports an Activation layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.core KerasActivation]))

(defn ->keras-activation
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasActivation [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasActivation layer-config enforce-training-config))
  (^KerasActivation [^java.util.Map layer-config]
    (new KerasActivation layer-config)))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasActivation this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-activation-layer
  "Get DL4J ActivationLayer.

  returns: ActivationLayer - `org.deeplearning4j.nn.conf.layers.ActivationLayer`"
  (^org.deeplearning4j.nn.conf.layers.ActivationLayer [^KerasActivation this]
    (-> this (.getActivationLayer))))

