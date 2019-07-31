(ns org.deeplearning4j.text.stopwords.StopWords
  "Loads stop words from the class path"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.text.stopwords StopWords]))

(defn *get-stop-words
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (StopWords/getStopWords )))

