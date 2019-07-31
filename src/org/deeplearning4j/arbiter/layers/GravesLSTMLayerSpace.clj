(ns org.deeplearning4j.arbiter.layers.GravesLSTMLayerSpace
  "Layer space for LSTM layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers GravesLSTMLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.GravesLSTM`"
  (^org.deeplearning4j.nn.conf.layers.GravesLSTM [^GravesLSTMLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^GravesLSTMLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^GravesLSTMLayerSpace this]
    (-> this (.toString))))

