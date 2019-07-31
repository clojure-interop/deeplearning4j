(ns org.deeplearning4j.text.documentiterator.LabelAwareDocumentIterator
  "Created by agibsonccc on 10/18/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator LabelAwareDocumentIterator]))

(defn current-label
  "Returns the current label

  returns: `java.lang.String`"
  (^java.lang.String [^LabelAwareDocumentIterator this]
    (-> this (.currentLabel))))

