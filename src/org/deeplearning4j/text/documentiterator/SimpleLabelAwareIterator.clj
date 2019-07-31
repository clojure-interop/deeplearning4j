(ns org.deeplearning4j.text.documentiterator.SimpleLabelAwareIterator
  "This class provide option to build LabelAwareIterator from Iterable or Iterator objects
 PLEASE NOTE: This iterator is meant to be used with externally-originated data via Java Iterable/Iterator interface.
 It IS possible to use Collection/List object here, but it's NOT recommended, since huge List with data might cause significant
 performance penalty due to JVM Garbage Collection mechanics."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator SimpleLabelAwareIterator]))

(defn ->simple-label-aware-iterator
  "Constructor.

  Builds LabelAwareIterator instance using Iterable object

  iterable - `java.lang.Iterable`"
  (^SimpleLabelAwareIterator [^java.lang.Iterable iterable]
    (new SimpleLabelAwareIterator iterable)))

(defn has-next-document?
  "This method checks, if there's more LabelledDocuments in underlying iterator

  returns: `boolean`"
  (^Boolean [^SimpleLabelAwareIterator this]
    (-> this (.hasNextDocument))))

(defn next-document
  "This method returns next LabelledDocument from underlying iterator

  returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^SimpleLabelAwareIterator this]
    (-> this (.nextDocument))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^SimpleLabelAwareIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^SimpleLabelAwareIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^SimpleLabelAwareIterator this]
    (-> this (.remove))))

(defn shutdown
  ""
  ([^SimpleLabelAwareIterator this]
    (-> this (.shutdown))))

(defn reset
  "This methods resets LabelAwareIterator by creating new Iterator from Iterable internally"
  ([^SimpleLabelAwareIterator this]
    (-> this (.reset))))

(defn get-labels-source
  "This method returns LabelsSource instance, containing all labels derived from this iterator

  returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^SimpleLabelAwareIterator this]
    (-> this (.getLabelsSource))))

