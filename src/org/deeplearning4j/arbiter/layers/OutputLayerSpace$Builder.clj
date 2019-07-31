(ns org.deeplearning4j.arbiter.layers.OutputLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers OutputLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^OutputLayerSpace$Builder []
    (new OutputLayerSpace$Builder )))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.OutputLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.OutputLayerSpace [^OutputLayerSpace$Builder this]
    (-> this (.build))))

