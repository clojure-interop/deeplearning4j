(ns org.deeplearning4j.text.documentiterator.LabelledDocument
  "This is primitive holder of document, and it's label."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.documentiterator LabelledDocument]))

(defn ->labelled-document
  "Constructor."
  (^LabelledDocument []
    (new LabelledDocument )))

(defn get-label
  "Deprecated.

  returns: `java.lang.String`"
  (^java.lang.String [^LabelledDocument this]
    (-> this (.getLabel))))

(defn set-label
  "Deprecated.

  label - `java.lang.String`"
  ([^LabelledDocument this ^java.lang.String label]
    (-> this (.setLabel label))))

(defn add-label
  "label - `java.lang.String`"
  ([^LabelledDocument this ^java.lang.String label]
    (-> this (.addLabel label))))

