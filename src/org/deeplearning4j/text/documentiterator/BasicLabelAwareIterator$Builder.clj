(ns org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator BasicLabelAwareIterator$Builder]))

(defn ->builder
  "Constructor.

  We assume that each sentence in this iterator is separate document/paragraph

  iterator - `org.deeplearning4j.text.sentenceiterator.SentenceIterator`"
  (^BasicLabelAwareIterator$Builder [^org.deeplearning4j.text.sentenceiterator.SentenceIterator iterator]
    (new BasicLabelAwareIterator$Builder iterator)))

(defn set-label-template
  "Label template will be used for sentence labels generation. I.e. if provided template is \"DOCUMENT_\", all documents/paragraphs will have their labels starting from \"DOCUMENT_0\" to \"DOCUMENT_X\", where X is the total number of documents - 1

  template - `java.lang.String`

  returns: `org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator$Builder`"
  (^org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator$Builder [^BasicLabelAwareIterator$Builder this ^java.lang.String template]
    (-> this (.setLabelTemplate template))))

(defn set-labels-source
  "TODO: To be implemented

  source - `org.deeplearning4j.text.documentiterator.LabelsSource`

  returns: `org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator$Builder`"
  (^org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator$Builder [^BasicLabelAwareIterator$Builder this ^org.deeplearning4j.text.documentiterator.LabelsSource source]
    (-> this (.setLabelsSource source))))

(defn build
  "returns: `org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator`"
  (^org.deeplearning4j.text.documentiterator.BasicLabelAwareIterator [^BasicLabelAwareIterator$Builder this]
    (-> this (.build))))

