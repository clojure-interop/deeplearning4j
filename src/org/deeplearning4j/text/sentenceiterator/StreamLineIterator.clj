(ns org.deeplearning4j.text.sentenceiterator.StreamLineIterator
  "Simple class suitable for iterating over InputStreams as over lines of strings
 Please note, this class is NOT thread safe"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator StreamLineIterator]))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^StreamLineIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^StreamLineIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^StreamLineIterator this]
    (-> this (.reset))))

(defn finish
  "Description copied from interface: SentenceIterator"
  ([^StreamLineIterator this]
    (-> this (.finish))))

(defn get-pre-processor
  "returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^StreamLineIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^StreamLineIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

