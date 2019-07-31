(ns org.deeplearning4j.text.documentiterator.FileLabelAwareIterator
  "This is simple filesystem-based LabelAware iterator.
 It assumes that you have one or more folders organized in the following way:
 1st level subfolder: label name
 2nd level: bunch of documents for that label
 You can have as many label folders as you want, as well."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator FileLabelAwareIterator]))

(defn has-next-document?
  "returns: `boolean`"
  (^Boolean [^FileLabelAwareIterator this]
    (-> this (.hasNextDocument))))

(defn next-document
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^FileLabelAwareIterator this]
    (-> this (.nextDocument))))

(defn has-next?
  "returns: `boolean`"
  (^Boolean [^FileLabelAwareIterator this]
    (-> this (.hasNext))))

(defn next
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^FileLabelAwareIterator this]
    (-> this (.next))))

(defn remove
  ""
  ([^FileLabelAwareIterator this]
    (-> this (.remove))))

(defn shutdown
  ""
  ([^FileLabelAwareIterator this]
    (-> this (.shutdown))))

(defn reset
  ""
  ([^FileLabelAwareIterator this]
    (-> this (.reset))))

(defn get-labels-source
  "returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^FileLabelAwareIterator this]
    (-> this (.getLabelsSource))))

