(ns org.deeplearning4j.text.documentiterator.interoperability.DocumentIteratorConverter
  "Simple class providing compatibility between DocumentIterator/LabelAwareDocumentIterator and LabelAwareIterator"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator.interoperability DocumentIteratorConverter]))

(defn ->document-iterator-converter
  "Constructor.

  iterator - `org.deeplearning4j.text.documentiterator.DocumentIterator`
  generator - `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^DocumentIteratorConverter [^org.deeplearning4j.text.documentiterator.DocumentIterator iterator ^org.deeplearning4j.text.documentiterator.LabelsSource generator]
    (new DocumentIteratorConverter iterator generator))
  (^DocumentIteratorConverter [^org.deeplearning4j.text.documentiterator.LabelAwareDocumentIterator iterator]
    (new DocumentIteratorConverter iterator)))

(defn has-next-document?
  "returns: `boolean`"
  (^Boolean [^DocumentIteratorConverter this]
    (-> this (.hasNextDocument))))

(defn next-document
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^DocumentIteratorConverter this]
    (-> this (.nextDocument))))

(defn reset
  ""
  ([^DocumentIteratorConverter this]
    (-> this (.reset))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^DocumentIteratorConverter this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^DocumentIteratorConverter this]
    (-> this (.next))))

(defn remove
  ""
  ([^DocumentIteratorConverter this]
    (-> this (.remove))))

(defn get-labels-source
  "returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^DocumentIteratorConverter this]
    (-> this (.getLabelsSource))))

(defn shutdown
  ""
  ([^DocumentIteratorConverter this]
    (-> this (.shutdown))))

