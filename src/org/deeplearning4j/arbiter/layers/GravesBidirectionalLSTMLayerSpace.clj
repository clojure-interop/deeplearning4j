(ns org.deeplearning4j.arbiter.layers.GravesBidirectionalLSTMLayerSpace
  "Layer space for Bidirectional LSTM layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers GravesBidirectionalLSTMLayerSpace]))

(defn get-value
  "Description copied from interface: ParameterSpace

  values - A set of values, each in the range [0,1], of length ParameterSpace.numParameters() - `double[]`

  returns: `org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM`"
  (^org.deeplearning4j.nn.conf.layers.GravesBidirectionalLSTM [^GravesBidirectionalLSTMLayerSpace this values]
    (-> this (.getValue values))))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^GravesBidirectionalLSTMLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^GravesBidirectionalLSTMLayerSpace this]
    (-> this (.toString))))

