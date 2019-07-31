(ns org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator$Builder
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator FilenamesLabelAwareIterator$Builder]))

(defn ->builder
  "Constructor."
  (^FilenamesLabelAwareIterator$Builder []
    (new FilenamesLabelAwareIterator$Builder )))

(defn add-source-folder
  "Root folder for labels -> documents.
  Each subfolder name will be presented as label, and contents of this folder will be represented as LabelledDocument, with label attached

  folder - folder to be scanned for labels and files - `java.io.File`

  returns: `org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator$Builder`"
  (^org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator$Builder [^FilenamesLabelAwareIterator$Builder this ^java.io.File folder]
    (-> this (.addSourceFolder folder))))

(defn use-absolute-path-as-label
  "really-use - `boolean`

  returns: `org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator$Builder`"
  (^org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator$Builder [^FilenamesLabelAwareIterator$Builder this ^Boolean really-use]
    (-> this (.useAbsolutePathAsLabel really-use))))

(defn build
  "returns: `org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator`"
  (^org.deeplearning4j.text.documentiterator.FilenamesLabelAwareIterator [^FilenamesLabelAwareIterator$Builder this]
    (-> this (.build))))

