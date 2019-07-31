(ns org.deeplearning4j.text.sentenceiterator.FileSentenceIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator FileSentenceIterator]))

(defn ->file-sentence-iterator
  "Constructor.

  Takes a single file or directory

  pre-processor - the sentence pre processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`
  file - the file or folder to iterate over - `java.io.File`"
  (^FileSentenceIterator [^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor ^java.io.File file]
    (new FileSentenceIterator pre-processor file))
  (^FileSentenceIterator [^java.io.File dir]
    (new FileSentenceIterator dir)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^FileSentenceIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^FileSentenceIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^FileSentenceIterator this]
    (-> this (.reset))))

