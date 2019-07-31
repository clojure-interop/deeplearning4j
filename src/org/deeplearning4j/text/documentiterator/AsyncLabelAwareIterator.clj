(ns org.deeplearning4j.text.documentiterator.AsyncLabelAwareIterator
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator AsyncLabelAwareIterator]))

(defn ->async-label-aware-iterator
  "Constructor.

  iterator - `org.deeplearning4j.text.documentiterator.LabelAwareIterator`
  buffer-size - `int`"
  (^AsyncLabelAwareIterator [^org.deeplearning4j.text.documentiterator.LabelAwareIterator iterator ^Integer buffer-size]
    (new AsyncLabelAwareIterator iterator buffer-size)))

(defn remove
  ""
  ([^AsyncLabelAwareIterator this]
    (-> this (.remove))))

(defn has-next-document?
  "returns: `boolean`"
  (^Boolean [^AsyncLabelAwareIterator this]
    (-> this (.hasNextDocument))))

(defn next-document
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^AsyncLabelAwareIterator this]
    (-> this (.nextDocument))))

(defn reset
  ""
  ([^AsyncLabelAwareIterator this]
    (-> this (.reset))))

(defn shutdown
  ""
  ([^AsyncLabelAwareIterator this]
    (-> this (.shutdown))))

(defn get-labels-source
  "returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^AsyncLabelAwareIterator this]
    (-> this (.getLabelsSource))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^AsyncLabelAwareIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^AsyncLabelAwareIterator this]
    (-> this (.next))))

