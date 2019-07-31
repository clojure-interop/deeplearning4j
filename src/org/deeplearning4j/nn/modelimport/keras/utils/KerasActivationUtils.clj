(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasActivationUtils
  "Utility functionality for Keras activation functions."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasActivationUtils]))

(defn ->keras-activation-utils
  "Constructor."
  (^KerasActivationUtils []
    (new KerasActivationUtils )))

(defn *map-to-activation
  "Map Keras to DL4J activation functions.

  keras-activation - String containing Keras activation function name - `java.lang.String`
  conf - Keras layer configuration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: Activation enum value containing DL4J activation function name - `org.nd4j.linalg.activations.Activation`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.nd4j.linalg.activations.Activation [^java.lang.String keras-activation ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasActivationUtils/mapToActivation keras-activation conf)))

(defn *map-to-i-activation
  "Map Keras to DL4J activation functions.

  keras-activation - String containing Keras activation function name - `java.lang.String`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: DL4J activation function - `org.nd4j.linalg.activations.IActivation`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^org.nd4j.linalg.activations.IActivation [^java.lang.String keras-activation ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasActivationUtils/mapToIActivation keras-activation conf)))

(defn *get-i-activation-from-config
  "Get activation function from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: DL4J activation function - `org.nd4j.linalg.activations.IActivation`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.nd4j.linalg.activations.IActivation [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasActivationUtils/getIActivationFromConfig layer-config conf)))

(defn *get-activation-from-config
  "Get activation enum value from Keras layer configuration.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  conf - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`

  returns: DL4J activation enum value - `org.nd4j.linalg.activations.Activation`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.nd4j.linalg.activations.Activation [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf]
    (KerasActivationUtils/getActivationFromConfig layer-config conf)))

