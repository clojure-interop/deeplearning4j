(ns org.deeplearning4j.text.sentenceiterator.interoperability.SentenceIteratorConverter
  "Simple class providing compatibility between SentenceIterator/LabelAwareSentenceIterator and LabelAwareIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator.interoperability SentenceIteratorConverter]))

(defn ->sentence-iterator-converter
  "Constructor.

  iterator - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`
  generator - `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^SentenceIteratorConverter [^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator ^org.deeplearning4j.text.documentiterator.LabelsSource generator]
    (new SentenceIteratorConverter iterator generator))
  (^SentenceIteratorConverter [^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator]
    (new SentenceIteratorConverter iterator)))

(defn has-next-document?
  "returns: `boolean`"
  (^Boolean [^SentenceIteratorConverter this]
    (-> this (.hasNextDocument))))

(defn next-document
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^SentenceIteratorConverter this]
    (-> this (.nextDocument))))

(defn reset
  ""
  ([^SentenceIteratorConverter this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^SentenceIteratorConverter this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^SentenceIteratorConverter this]
    (-> this (.next))))

(defn remove
  ""
  ([^SentenceIteratorConverter this]
    (-> this (.remove))))

(defn get-labels-source
  "returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^SentenceIteratorConverter this]
    (-> this (.getLabelsSource))))

(defn shutdown
  ""
  ([^SentenceIteratorConverter this]
    (-> this (.shutdown))))

