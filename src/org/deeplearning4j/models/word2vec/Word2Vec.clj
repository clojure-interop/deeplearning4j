(ns org.deeplearning4j.models.word2vec.Word2Vec
  "This is Word2Vec implementation based on SequenceVectors"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.word2vec Word2Vec]))

(defn ->word-2-vec
  "Constructor."
  (^Word2Vec []
    (new Word2Vec )))

(defn set-tokenizer-factory
  "This method defines TokenizerFactory instance to be using during model building

  tokenizer-factory - TokenizerFactory instance - `org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory`"
  ([^Word2Vec this ^org.deeplearning4j.text.tokenization.tokenizerfactory.TokenizerFactory tokenizer-factory]
    (-> this (.setTokenizerFactory tokenizer-factory))))

(defn set-sentence-iterator
  "This method defines SentenceIterator instance, that will be used as training corpus source

  iterator - SentenceIterator instance - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`"
  ([^Word2Vec this ^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator]
    (-> this (.setSentenceIterator iterator))))

(defn set-sequence-iterator
  "This method defines SequenceIterator instance, that will be used as training corpus source.
  Main difference with other iterators here: it allows you to pass already tokenized Sequence for training

  iterator - `org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator`"
  ([^Word2Vec this ^org.deeplearning4j.models.sequencevectors.interfaces.SequenceIterator iterator]
    (-> this (.setSequenceIterator iterator))))

