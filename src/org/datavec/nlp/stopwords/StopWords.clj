(ns org.datavec.nlp.stopwords.StopWords
  "Loads stop words from the class path"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.nlp.stopwords StopWords]))

(defn ->stop-words
  "Constructor."
  (^StopWords []
    (new StopWords )))

(defn *get-stop-words
  "returns: `java.util.List<java.lang.String>`"
  (^java.util.List []
    (StopWords/getStopWords )))

