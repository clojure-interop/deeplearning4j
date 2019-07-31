(ns org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator
  "This is simple class, for building Sentence-Label pairs for ParagraphVectors/Doc2Vec.
 Idea is simple - you provide SentenceIterator or DocumentIterator, and it builds nice structure for future model reuse"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator BasicLabelAwareIterator]))

(defn has-next-document?
  "This method checks, if there's more LabelledDocuments

  returns: `boolean`"
  (^Boolean [^BasicLabelAwareIterator this]
    (-> this (.hasNextDocument))))

(defn next-document
  "This method returns next LabelledDocument

  returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^BasicLabelAwareIterator this]
    (-> this (.nextDocument))))

(defn reset
  "This methods resets LabelAwareIterator"
  ([^BasicLabelAwareIterator this]
    (-> this (.reset))))

(defn get-labels-source
  "This method returns LabelsSource instance, containing all labels derived from this iterator

  returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^BasicLabelAwareIterator this]
    (-> this (.getLabelsSource))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^BasicLabelAwareIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^BasicLabelAwareIterator this]
    (-> this (.next))))

(defn shutdown
  ""
  ([^BasicLabelAwareIterator this]
    (-> this (.shutdown))))

(defn remove
  ""
  ([^BasicLabelAwareIterator this]
    (-> this (.remove))))

