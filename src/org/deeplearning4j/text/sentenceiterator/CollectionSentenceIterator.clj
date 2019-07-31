(ns org.deeplearning4j.text.sentenceiterator.CollectionSentenceIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator CollectionSentenceIterator]))

(defn ->collection-sentence-iterator
  "Constructor.

  pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`
  coll - `java.util.Collection`"
  (^CollectionSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor ^java.util.Collection coll]
    (new CollectionSentenceIterator pre-processor coll))
  (^CollectionSentenceIterator [^java.util.Collection coll]
    (new CollectionSentenceIterator coll)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^CollectionSentenceIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^CollectionSentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^CollectionSentenceIterator this]
    (-> this (.reset))))

