(ns org.deeplearning4j.text.documentiterator.LabelAwareIterator
  "This simple iterator interface assumes, that all documents are packed into strings OR into references to VocabWords.
 Basic idea is: for tasks like ParagraphVectors we need unified interface for reading Sentences (read: lines of text) or Documents (read: set of lines) with label support.
 There's 2 interoperbility implementations of this interfaces: SentenceIteratorConverter and DocumentIteratorConverter.
 After conversion is done, they can be wrapped by BasicLabelAwareIterator, that accepts all 5 current interfaces (including this one) as source for labelled documents.
 This way 100% backward compatibility is provided, as well as additional functionality is delivered via LabelsSource."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator LabelAwareIterator]))

(defn has-next-document?
  "returns: `boolean`"
  (^Boolean [^LabelAwareIterator this]
    (-> this (.hasNextDocument))))

(defn next-document
  "returns: `org.deeplearning4j.text.documentiterator.LabelledDocument`"
  (^org.deeplearning4j.text.documentiterator.LabelledDocument [^LabelAwareIterator this]
    (-> this (.nextDocument))))

(defn reset
  ""
  ([^LabelAwareIterator this]
    (-> this (.reset))))

(defn get-labels-source
  "returns: `org.deeplearning4j.text.documentiterator.LabelsSource`"
  (^org.deeplearning4j.text.documentiterator.LabelsSource [^LabelAwareIterator this]
    (-> this (.getLabelsSource))))

(defn shutdown
  ""
  ([^LabelAwareIterator this]
    (-> this (.shutdown))))

