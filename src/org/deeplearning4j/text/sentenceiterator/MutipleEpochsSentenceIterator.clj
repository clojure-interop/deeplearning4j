(ns org.deeplearning4j.text.sentenceiterator.MutipleEpochsSentenceIterator
  "This SentenceIterator implemenation wraps existing sentence iterator, and resets it numEpochs times
 This class is usable for tests purposes mostly."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator MutipleEpochsSentenceIterator]))

(defn ->mutiple-epochs-sentence-iterator
  "Constructor.

  iterator - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`
  num-epochs - `int`"
  (^MutipleEpochsSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator ^Integer num-epochs]
    (new MutipleEpochsSentenceIterator iterator num-epochs)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^MutipleEpochsSentenceIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^MutipleEpochsSentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^MutipleEpochsSentenceIterator this]
    (-> this (.reset))))

(defn finish
  "Description copied from interface: SentenceIterator"
  ([^MutipleEpochsSentenceIterator this]
    (-> this (.finish))))

(defn get-pre-processor
  "returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^MutipleEpochsSentenceIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^MutipleEpochsSentenceIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

