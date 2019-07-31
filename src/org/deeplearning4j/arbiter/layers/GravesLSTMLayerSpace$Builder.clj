(ns org.deeplearning4j.arbiter.layers.GravesLSTMLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers GravesLSTMLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^GravesLSTMLayerSpace$Builder []
    (new GravesLSTMLayerSpace$Builder )))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.GravesLSTMLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.GravesLSTMLayerSpace [^GravesLSTMLayerSpace$Builder this]
    (-> this (.build))))

