(ns org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.layers EmbeddingSequenceLayer$Builder]))

(defn ->builder
  "Constructor."
  (^EmbeddingSequenceLayer$Builder []
    (new EmbeddingSequenceLayer$Builder )))

(defn has-bias
  "If true: include bias parameters in the layer. False (default): no bias.

  has-bias - If true: include bias parameters in this layer - `boolean`

  returns: `org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer$Builder [^EmbeddingSequenceLayer$Builder this ^Boolean has-bias]
    (-> this (.hasBias has-bias))))

(defn input-length
  "Set input sequence length for this embedding layer.

  input-length - input sequence length - `int`

  returns: Builder - `org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer$Builder [^EmbeddingSequenceLayer$Builder this ^Integer input-length]
    (-> this (.inputLength input-length))))

(defn infer-input-length
  "Set input sequence inference mode for embedding layer.

  infer-input-length - whether to infer input length - `boolean`

  returns: Builder - `org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer$Builder`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer$Builder [^EmbeddingSequenceLayer$Builder this ^Boolean infer-input-length]
    (-> this (.inferInputLength infer-input-length))))

(defn build
  "returns: `org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer [^EmbeddingSequenceLayer$Builder this]
    (-> this (.build))))

