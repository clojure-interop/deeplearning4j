(ns org.deeplearning4j.models.embeddings.reader.impl.FlatModelUtils
  "This model reader is suited for model tests, and for cases where flat scan against elements is required.
 PLEASE NOTE: This reader does NOT normalize underlying weights, it stays intact"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.models.embeddings.reader.impl FlatModelUtils]))

(defn ->flat-model-utils
  "Constructor."
  (^FlatModelUtils []
    (new FlatModelUtils )))

(defn words-nearest
  "This method does full scan against whole vocabulary, building descending list of similar words

  label - `java.lang.String`
  n - `int`

  returns: `java.util.Collection<java.lang.String>`"
  (^java.util.Collection [^FlatModelUtils this ^java.lang.String label ^Integer n]
    (-> this (.wordsNearest label n))))

