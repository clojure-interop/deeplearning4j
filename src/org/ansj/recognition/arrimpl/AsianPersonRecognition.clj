(ns org.ansj.recognition.arrimpl.AsianPersonRecognition
  "人名识别工具类"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.arrimpl AsianPersonRecognition]))

(defn ->asian-person-recognition
  "Constructor."
  (^AsianPersonRecognition []
    (new AsianPersonRecognition )))

(defn recognition
  "terms - `org.ansj.domain.Term[]`"
  ([^AsianPersonRecognition this terms]
    (-> this (.recognition terms))))

(defn get-new-words
  "terms - `org.ansj.domain.Term[]`

  returns: `java.util.List<org.ansj.domain.NewWord>`"
  (^java.util.List [^AsianPersonRecognition this terms]
    (-> this (.getNewWords terms))))

(defn get-new-terms
  "returns: `java.util.List<org.ansj.domain.Term>`"
  (^java.util.List [^AsianPersonRecognition this]
    (-> this (.getNewTerms))))

