(ns org.deeplearning4j.bagofwords.vectorizer.BaseTextVectorizer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.bagofwords.vectorizer BaseTextVectorizer]))

(defn ->base-text-vectorizer
  "Constructor."
  (^BaseTextVectorizer []
    (new BaseTextVectorizer )))

(defn build-vocab
  ""
  ([^BaseTextVectorizer this]
    (-> this (.buildVocab))))

(defn fit
  "Description copied from interface: TextVectorizer"
  ([^BaseTextVectorizer this]
    (-> this (.fit))))

(defn num-words-encountered
  "Returns the number of words encountered so far

  returns: the number of words encountered so far - `long`"
  (^Long [^BaseTextVectorizer this]
    (-> this (.numWordsEncountered))))

