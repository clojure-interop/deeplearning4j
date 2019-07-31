(ns org.deeplearning4j.nn.conf.layers.AbstractLSTM$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers AbstractLSTM$Builder]))

(defn ->builder
  "Constructor."
  (^AbstractLSTM$Builder []
    (new AbstractLSTM$Builder )))

(defn forget-gate-bias-init
  "Set forget gate bias initalizations. Values in range 1-5 can potentially
  help with learning or longer-term dependencies.

  bias-init - `double`

  returns: `T`"
  ([^AbstractLSTM$Builder this ^Double bias-init]
    (-> this (.forgetGateBiasInit bias-init))))

(defn gate-activation-function
  "Activation function for the LSTM gates.
  Note: This should be bounded to range 0-1: sigmoid or hard sigmoid, for example

  gate-activation-fn - Activation function for the LSTM gates - `java.lang.String`

  returns: `T`"
  ([^AbstractLSTM$Builder this ^java.lang.String gate-activation-fn]
    (-> this (.gateActivationFunction gate-activation-fn))))

