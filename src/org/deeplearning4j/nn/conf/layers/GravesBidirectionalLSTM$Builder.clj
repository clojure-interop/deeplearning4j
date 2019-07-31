(ns org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers GravesBidirectionalLSTM$Builder]))

(defn ->builder
  "Constructor."
  (^GravesBidirectionalLSTM$Builder []
    (new GravesBidirectionalLSTM$Builder )))

(defn forget-gate-bias-init
  "Set forget gate bias initalizations. Values in range 1-5 can potentially
  help with learning or longer-term dependencies.

  bias-init - `double`

  returns: `org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM$Builder`"
  (^org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM$Builder [^GravesBidirectionalLSTM$Builder this ^Double bias-init]
    (-> this (.forgetGateBiasInit bias-init))))

(defn gate-activation-function
  "Activation function for the LSTM gates.
  Note: This should be bounded to range 0-1: sigmoid or hard sigmoid, for example

  gate-activation-fn - Activation function for the LSTM gates - `java.lang.String`

  returns: `org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM$Builder`"
  (^org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM$Builder [^GravesBidirectionalLSTM$Builder this ^java.lang.String gate-activation-fn]
    (-> this (.gateActivationFunction gate-activation-fn))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM`"
  (^org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM [^GravesBidirectionalLSTM$Builder this]
    (-> this (.build))))

