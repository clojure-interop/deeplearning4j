(ns org.deeplearning4j.nn.modelimport.keras.layers.embeddings.KerasEmbedding
  "Imports an Embedding layer from Keras."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.modelimport.keras.layers.embeddings KerasEmbedding]))

(defn ->keras-embedding
  "Constructor.

  Constructor from parsed Keras layer configuration dictionary.

  layer-config - dictionary containing Keras layer configuration - `java.util.Map`
  enforce-training-config - whether to enforce training-related configuration options - `boolean`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^KerasEmbedding [^java.util.Map layer-config ^Boolean enforce-training-config]
    (new KerasEmbedding layer-config enforce-training-config))
  (^KerasEmbedding [^java.util.Map layer-config]
    (new KerasEmbedding layer-config))
  (^KerasEmbedding []
    (new KerasEmbedding )))

(defn get-embedding-layer
  "Get DL4J Embedding Sequence layer.

  returns: Embedding Sequence layer - `org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer`"
  (^org.deeplearning4j.nn.conf.layers.EmbeddingSequenceLayer [^KerasEmbedding this]
    (-> this (.getEmbeddingLayer))))

(defn get-output-type
  "Get layer output type.

  input-type - Array of InputTypes - `org.deeplearning4j.nn.conf.inputs.InputType`

  returns: output type as InputType - `org.deeplearning4j.nn.conf.inputs.InputType`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException - Invalid Keras config"
  (^org.deeplearning4j.nn.conf.inputs.InputType [^KerasEmbedding this ^org.deeplearning4j.nn.conf.inputs.InputType input-type]
    (-> this (.getOutputType input-type))))

(defn get-num-params
  "Returns number of trainable parameters in layer.

  returns: number of trainable parameters (1) - `int`"
  (^Integer [^KerasEmbedding this]
    (-> this (.getNumParams))))

(defn set-weights
  "Set weights for layer.

  weights - Embedding layer weights - `java.util.Map`

  throws: org.deeplearning4j.nn.modelimport.keras.exceptions.InvalidKerasConfigurationException"
  ([^KerasEmbedding this ^java.util.Map weights]
    (-> this (.setWeights weights))))

