(ns org.deeplearning4j.arbiter.layers.LSTMLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers LSTMLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^LSTMLayerSpace$Builder []
    (new LSTMLayerSpace$Builder )))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.LSTMLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.LSTMLayerSpace [^LSTMLayerSpace$Builder this]
    (-> this (.build))))

