(ns org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers AutoEncoderLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^AutoEncoderLayerSpace$Builder []
    (new AutoEncoderLayerSpace$Builder )))

(defn corruption-level
  "corruption-level - `double`

  returns: `org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace$Builder [^AutoEncoderLayerSpace$Builder this ^Double corruption-level]
    (-> this (.corruptionLevel corruption-level))))

(defn sparsity
  "sparsity - `double`

  returns: `org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace$Builder [^AutoEncoderLayerSpace$Builder this ^Double sparsity]
    (-> this (.sparsity sparsity))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.AutoEncoderLayerSpace [^AutoEncoderLayerSpace$Builder this]
    (-> this (.build))))

