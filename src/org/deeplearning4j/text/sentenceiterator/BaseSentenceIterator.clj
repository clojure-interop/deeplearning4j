(ns org.deeplearning4j.text.sentenceiterator.BaseSentenceIterator
  "Creates a baseline default.
 This includes the sentence pre processor
 and a no op finish for iterators
 with no i/o streams or other finishing steps."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator BaseSentenceIterator]))

(defn ->base-sentence-iterator
  "Constructor.

  pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^BaseSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (new BaseSentenceIterator pre-processor))
  (^BaseSentenceIterator []
    (new BaseSentenceIterator )))

(defn get-pre-processor
  "returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^BaseSentenceIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^BaseSentenceIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn finish
  "Description copied from interface: SentenceIterator"
  ([^BaseSentenceIterator this]
    (-> this (.finish))))

