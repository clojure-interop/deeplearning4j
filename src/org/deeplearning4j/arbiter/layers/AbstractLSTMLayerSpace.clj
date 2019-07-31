(ns org.deeplearning4j.arbiter.layers.AbstractLSTMLayerSpace
  "Layer space for LSTM layers"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers AbstractLSTMLayerSpace]))

(defn to-string
  "delim - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^AbstractLSTMLayerSpace this ^java.lang.String delim]
    (-> this (.toString delim)))
  (^java.lang.String [^AbstractLSTMLayerSpace this]
    (-> this (.toString))))

