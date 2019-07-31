(ns org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator PrefetchingSentenceIterator$Builder]))

(defn ->builder
  "Constructor.

  iterator - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`"
  (^PrefetchingSentenceIterator$Builder [^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator]
    (new PrefetchingSentenceIterator$Builder iterator)))

(defn set-fetch-size
  "fetch-size - `int`

  returns: `org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator$Builder`"
  (^org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator$Builder [^PrefetchingSentenceIterator$Builder this ^Integer fetch-size]
    (-> this (.setFetchSize fetch-size))))

(defn set-sentence-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`

  returns: `org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator$Builder`"
  (^org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator$Builder [^PrefetchingSentenceIterator$Builder this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setSentencePreProcessor pre-processor))))

(defn build
  "returns: `org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator`"
  (^org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator [^PrefetchingSentenceIterator$Builder this]
    (-> this (.build))))

