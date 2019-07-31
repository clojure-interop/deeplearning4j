(ns org.deeplearning4j.nn.modelimport.keras.utils.KerasRegularizerUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.utils KerasRegularizerUtils]))

(defn ->keras-regularizer-utils
  "Constructor."
  (^KerasRegularizerUtils []
    (new KerasRegularizerUtils )))

(defn *get-weight-regularizer-from-config
  "Get weight regularization from Keras weight regularization configuration.

  layer-config - Map containing Keras weight regularization configuration - `java.util.Map`
  conf - Keras layer configuration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  config-field - regularization config field to use - `java.lang.String`
  regularizer-type - type of regularization as string (e.g. \"l2\") - `java.lang.String`

  returns: L1 or L2 regularization strength (0.0 if none) - `double`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.UnsupportedKerasConfigurationException"
  (^Double [^java.util.Map layer-config ^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^java.lang.String config-field ^java.lang.String regularizer-type]
    (KerasRegularizerUtils/getWeightRegularizerFromConfig layer-config conf config-field regularizer-type)))

