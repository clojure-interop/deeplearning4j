(ns org.deeplearning4j.text.sentenceiterator.PrefetchingSentenceIterator
  "Deprecated."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator PrefetchingSentenceIterator]))

(defn next-sentence
  "Deprecated.

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^PrefetchingSentenceIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Deprecated.

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^PrefetchingSentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Deprecated."
  ([^PrefetchingSentenceIterator this]
    (-> this (.reset))))

(defn finish
  "Deprecated."
  ([^PrefetchingSentenceIterator this]
    (-> this (.finish))))

(defn get-pre-processor
  "Deprecated.

  returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^PrefetchingSentenceIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "Deprecated.

  pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^PrefetchingSentenceIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

