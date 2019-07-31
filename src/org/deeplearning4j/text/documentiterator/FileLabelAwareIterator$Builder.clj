(ns org.deeplearning4j.text.documentiterator.FileLabelAwareIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator FileLabelAwareIterator$Builder]))

(defn ->builder
  "Constructor."
  (^FileLabelAwareIterator$Builder []
    (new FileLabelAwareIterator$Builder )))

(defn add-source-folder
  "Root folder for labels -> documents.
  Each subfolder name will be presented as label, and contents of this folder will be represented as LabelledDocument, with label attached

  folder - folder to be scanned for labels and files - `java.io.File`

  returns: `org.deeplearning4j.text.documentiterator.FileLabelAwareIterator$Builder`"
  (^org.deeplearning4j.text.documentiterator.FileLabelAwareIterator$Builder [^FileLabelAwareIterator$Builder this ^java.io.File folder]
    (-> this (.addSourceFolder folder))))

(defn build
  "returns: `org.deeplearning4j.text.documentiterator.FileLabelAwareIterator`"
  (^org.deeplearning4j.text.documentiterator.FileLabelAwareIterator [^FileLabelAwareIterator$Builder this]
    (-> this (.build))))

