(ns org.deeplearning4j.text.sentenceiterator.SynchronizedSentenceIterator
  "Simple synchronized wrapper for SentenceIterator interface implementations"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator SynchronizedSentenceIterator]))

(defn ->synchronized-sentence-iterator
  "Constructor.

  iterator - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`"
  (^SynchronizedSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator]
    (new SynchronizedSentenceIterator iterator)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^SynchronizedSentenceIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^SynchronizedSentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^SynchronizedSentenceIterator this]
    (-> this (.reset))))

(defn finish
  "Description copied from interface: SentenceIterator"
  ([^SynchronizedSentenceIterator this]
    (-> this (.finish))))

(defn get-pre-processor
  "returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^SynchronizedSentenceIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^SynchronizedSentenceIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

