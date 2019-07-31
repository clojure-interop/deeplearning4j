(ns org.deeplearning4j.text.sentenceiterator.SentenceIterator
  "A sentence iterator that knows how to iterate over sentence.
 This can be used in conjunction with more advanced NLP techniques
 to clearly separate sentences out, or be simpler when as much
 complexity is not needed."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator SentenceIterator]))

(defn next-sentence
  "Gets the next sentence or null
  if there's nothing left (Do yourself a favor and
  check hasNext() )

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^SentenceIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Same idea as Iterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^SentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Resets the iterator to the beginning"
  ([^SentenceIterator this]
    (-> this (.reset))))

(defn finish
  "Allows for any finishing (closing of input streams or the like)"
  ([^SentenceIterator this]
    (-> this (.finish))))

(defn get-pre-processor
  "returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^SentenceIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^SentenceIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

