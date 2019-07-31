(ns org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator AggregatingSentenceIterator$Builder]))

(defn ->builder
  "Constructor."
  (^AggregatingSentenceIterator$Builder []
    (new AggregatingSentenceIterator$Builder )))

(defn add-sentence-iterator
  "iterator - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`

  returns: `org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator$Builder`"
  (^org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator$Builder [^AggregatingSentenceIterator$Builder this ^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator]
    (-> this (.addSentenceIterator iterator))))

(defn add-sentence-iterators
  "iterator - `java.util.Collection`

  returns: `org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator$Builder`"
  (^org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator$Builder [^AggregatingSentenceIterator$Builder this ^java.util.Collection iterator]
    (-> this (.addSentenceIterators iterator))))

(defn add-sentence-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`

  returns: `org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator$Builder`"
  (^org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator$Builder [^AggregatingSentenceIterator$Builder this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.addSentencePreProcessor pre-processor))))

(defn build
  "returns: `org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator`"
  (^org.deeplearning4j.text.sentenceiterator.AggregatingSentenceIterator [^AggregatingSentenceIterator$Builder this]
    (-> this (.build))))

