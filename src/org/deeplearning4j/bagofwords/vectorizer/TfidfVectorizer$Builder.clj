(ns org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.bagofwords.vectorizer TfidfVectorizer$Builder]))

(defn ->builder
  "Constructor."
  (^TfidfVectorizer$Builder []
    (new TfidfVectorizer$Builder )))

(defn allow-parallel-tokenization
  "really-allow - `boolean`

  returns: `org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder`"
  (^org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder [^TfidfVectorizer$Builder this ^Boolean really-allow]
    (-> this (.allowParallelTokenization really-allow))))

(defn set-tokenizer-factory
  "tokenizer-factory - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`

  returns: `org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder`"
  (^org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder [^TfidfVectorizer$Builder this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (-> this (.setTokenizerFactory tokenizer-factory))))

(defn set-iterator
  "iterator - `org.deeplearning4j.text.documentiterator.LabelAwareIterator`

  returns: `org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder`"
  (^org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder [^TfidfVectorizer$Builder this ^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator]
    (-> this (.setIterator iterator))))

(defn set-vocab
  "vocab - `org.deeplearning4j.models.word2vec.wordstore.VocabCache`

  returns: `org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder`"
  (^org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder [^TfidfVectorizer$Builder this ^org.deeplearning4j.models.word2vec.wordstore.VocabCache vocab]
    (-> this (.setVocab vocab))))

(defn set-min-word-frequency
  "min-word-frequency - `int`

  returns: `org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder`"
  (^org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder [^TfidfVectorizer$Builder this ^Integer min-word-frequency]
    (-> this (.setMinWordFrequency min-word-frequency))))

(defn set-stop-words
  "stop-words - `java.util.Collection`

  returns: `org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder`"
  (^org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer$Builder [^TfidfVectorizer$Builder this ^java.util.Collection stop-words]
    (-> this (.setStopWords stop-words))))

(defn build
  "returns: `org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer`"
  (^org.deeplearning4j.bagofwords.vectorizer.TfidfVectorizer [^TfidfVectorizer$Builder this]
    (-> this (.build))))

