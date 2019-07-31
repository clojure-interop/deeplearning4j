(ns org.deeplearning4j.nn.modelimport.keras.layers.recurrent.KerasRnnUtils
  "Utility functions for Keras RNN layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.recurrent KerasRnnUtils]))

(defn ->keras-rnn-utils
  "Constructor."
  (^KerasRnnUtils []
    (new KerasRnnUtils )))

(defn *get-unroll-recurrent-layer?
  "Get unroll parameter to decide whether to unroll RNN with BPTT or not.

  conf - KerasLayerConfiguration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  layer-config - dictionary containing Keras layer properties - `java.util.Map`

  returns: boolean unroll parameter - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^Boolean [^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^java.util.Map layer-config]
    (KerasRnnUtils/getUnrollRecurrentLayer conf layer-config)))

(defn *get-recurrent-dropout
  "Get recurrent weight dropout from Keras layer configuration.
  Non-zero dropout rates are currently not supported.

  conf - KerasLayerConfiguration - `org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration`
  layer-config - dictionary containing Keras layer properties - `java.util.Map`

  returns: recurrent dropout rate - `double`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras configuration"
  (^Double [^org.deeplearning4j.nn.modelimport.keras.config.KerasLayerConfiguration conf ^java.util.Map layer-config]
    (KerasRnnUtils/getRecurrentDropout conf layer-config)))

