(ns org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.sequencevectors.transformers.impl SentenceTransformer$Builder]))

(defn ->builder
  "Constructor."
  (^SentenceTransformer$Builder []
    (new SentenceTransformer$Builder )))

(defn tokenizer-factory
  "tokenizer-factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder [^SentenceTransformer$Builder this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (-> this (.tokenizerFactory tokenizer-factory))))

(defn iterator
  "iterator - `org.deeplearning4j.text.documentiterator.LabelAwareIterator`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder [^SentenceTransformer$Builder this ^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator]
    (-> this (.iterator iterator))))

(defn read-only
  "read-only - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder [^SentenceTransformer$Builder this ^Boolean read-only]
    (-> this (.readOnly read-only))))

(defn allow-multithreading
  "This method enables/disables parallel processing over sentences

  really-allow - `boolean`

  returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer$Builder [^SentenceTransformer$Builder this ^Boolean really-allow]
    (-> this (.allowMultithreading really-allow))))

(defn build
  "returns: `org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer`"
  (^org.deeplearning4j.models.sequencevectors.transformers.impl.SentenceTransformer [^SentenceTransformer$Builder this]
    (-> this (.build))))

