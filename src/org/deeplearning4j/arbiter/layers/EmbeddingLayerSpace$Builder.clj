(ns org.deeplearning4j.arbiter.layers.EmbeddingLayerSpace$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.layers EmbeddingLayerSpace$Builder]))

(defn ->builder
  "Constructor."
  (^EmbeddingLayerSpace$Builder []
    (new EmbeddingLayerSpace$Builder )))

(defn has-bias
  "has-bias - `boolean`

  returns: `org.deeplearning4j.arbiter.layers.EmbeddingLayerSpace$Builder`"
  (^org.deeplearning4j.arbiter.layers.EmbeddingLayerSpace$Builder [^EmbeddingLayerSpace$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn build
  "returns: `org.deeplearning4j.arbiter.layers.EmbeddingLayerSpace`"
  (^org.deeplearning4j.arbiter.layers.EmbeddingLayerSpace [^EmbeddingLayerSpace$Builder this]
    (-> this (.build))))

