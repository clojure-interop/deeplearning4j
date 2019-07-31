(ns org.deeplearning4j.text.documentiterator.DocumentIterator
  "Document Iterator: iterate over input streams"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator DocumentIterator]))

(defn next-document
  "Get the next document

  returns: the input stream for the next document - `java.io.InputStream`"
  (^java.io.InputStream [^DocumentIterator this]
    (-> this (.nextDocument))))

(defn has-next?
  "Whether there are anymore documents in the iterator

  returns: whether there are anymore documents
  in the iterator - `boolean`"
  (^Boolean [^DocumentIterator this]
    (-> this (.hasNext))))

(defn reset
  "Reset the iterator to the beginning"
  ([^DocumentIterator this]
    (-> this (.reset))))

