(ns org.deeplearning4j.text.documentiterator.FileDocumentIterator
  "Iterate over files"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator FileDocumentIterator]))

(defn ->file-document-iterator
  "Constructor.

  path - `java.lang.String`"
  (^FileDocumentIterator [^java.lang.String path]
    (new FileDocumentIterator path)))

(defn next-document
  "Description copied from interface: DocumentIterator

  returns: the input stream for the next document - `java.io.InputStream`"
  (^java.io.InputStream [^FileDocumentIterator this]
    (-> this (.nextDocument))))

(defn has-next?
  "Description copied from interface: DocumentIterator

  returns: whether there are anymore documents
  in the iterator - `boolean`"
  (^Boolean [^FileDocumentIterator this]
    (-> this (.hasNext))))

(defn reset
  "Description copied from interface: DocumentIterator"
  ([^FileDocumentIterator this]
    (-> this (.reset))))

