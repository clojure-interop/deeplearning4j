(ns org.deeplearning4j.text.sentenceiterator.LineSentenceIterator
  "Each line is a sentence"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator LineSentenceIterator]))

(defn ->line-sentence-iterator
  "Constructor.

  f - `java.io.File`"
  (^LineSentenceIterator [^java.io.File f]
    (new LineSentenceIterator f)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^LineSentenceIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^LineSentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^LineSentenceIterator this]
    (-> this (.reset))))

