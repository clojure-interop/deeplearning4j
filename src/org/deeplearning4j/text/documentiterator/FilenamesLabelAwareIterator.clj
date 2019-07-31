(ns org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator
  "This LabelAwareIterator scans folder for files, and returns them as LabelledDocuments.
 Each LabelledDocument will set it's Label to file name."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator FilenamesLabelAwareIterator]))

(defn has-next-document?
  "returns: `boolean`"
  (^Boolean [^FilenamesLabelAwareIterator this]
    (-> this (.hasNextDocument))))

(defn next-document
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^FilenamesLabelAwareIterator this]
    (-> this (.nextDocument))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^FilenamesLabelAwareIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^FilenamesLabelAwareIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^FilenamesLabelAwareIterator this]
    (-> this (.remove))))

(defn shutdown
  ""
  ([^FilenamesLabelAwareIterator this]
    (-> this (.shutdown))))

(defn reset
  ""
  ([^FilenamesLabelAwareIterator this]
    (-> this (.reset))))

(defn get-labels-source
  "returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^FilenamesLabelAwareIterator this]
    (-> this (.getLabelsSource))))

