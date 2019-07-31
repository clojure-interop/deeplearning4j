(ns org.deeplearning4j.nn.conf.layers.EmbeddingLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers EmbeddingLayer$Builder]))

(defn ->builder
  "Constructor."
  (^EmbeddingLayer$Builder []
    (new EmbeddingLayer$Builder )))

(defn has-bias
  "If true: include bias parameters in the layer. False (default): no bias.

  has-bias - If true: include bias parameters in this layer - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.EmbeddingLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingLayer$Builder [^EmbeddingLayer$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.EmbeddingLayer`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingLayer [^EmbeddingLayer$Builder this]
    (-> this (.build))))

