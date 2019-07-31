(ns org.deeplearning4j.text.sentenceiterator.BasicLineIterator
  "Primitive single-line iterator, without any options involved.
 Can be used over InputStream or File.
 Please note: for reset functionality, mark/reset should be supported by underlying InputStream."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.sentenceiterator BasicLineIterator]))

(defn ->basic-line-iterator
  "Constructor.

  file - `java.io.File`

  throws: java.io.FileNotFoundException"
  (^BasicLineIterator [^java.io.File file]
    (new BasicLineIterator file)))

(defn next-sentence
  "Description copied from interface: SentenceIterator

  returns: the next sentence in the iterator - `java.lang.String`"
  (^java.lang.String [^BasicLineIterator this]
    (-> this (.nextSentence))))

(defn has-next?
  "Description copied from interface: SentenceIterator

  returns: whether there's anymore sentences left - `boolean`"
  (^Boolean [^BasicLineIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: SentenceIterator"
  ([^BasicLineIterator this]
    (-> this (.reset))))

(defn finish
  "Description copied from interface: SentenceIterator"
  ([^BasicLineIterator this]
    (-> this (.finish))))

(defn get-pre-processor
  "returns: `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  (^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor [^BasicLineIterator this]
    (-> this (.getPreProcessor))))

(defn set-pre-processor
  "pre-processor - `org.deeplearning4j.text.sentenceiterator.SentencePreProcessor`"
  ([^BasicLineIterator this ^org.deeplearning4j.text.sentenceiterator.SentencePreProcessor pre-processor]
    (-> this (.setPreProcessor pre-processor))))

(defn iterator
  "Implentation for Iterable interface.
  Please note: each call for iterator() resets underlying SentenceIterator to the beginning;

  returns: `java.util.Iterator<java.lang.String>`"
  (^java.util.Iterator [^BasicLineIterator this]
    (-> this (.iterator))))

