(ns org.ansj.recognition.arrimpl.ForeignPersonRecognition
  "外国人名识别"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.arrimpl ForeignPersonRecognition]))

(defn ->foreign-person-recognition
  "Constructor."
  (^ForeignPersonRecognition []
    (new ForeignPersonRecognition )))

(defn *f-name?
  "name - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String name]
    (ForeignPersonRecognition/isFName name)))

(defn recognition
  "terms - `org.ansj.domain.Term[]`"
  ([^ForeignPersonRecognition this terms]
    (-> this (.recognition terms))))

(defn get-new-words
  "terms - `org.ansj.domain.Term[]`

  returns: `java.util.List<org.ansj.domain.NewWord>`"
  (^java.util.List [^ForeignPersonRecognition this terms]
    (-> this (.getNewWords terms))))

(defn get-new-terms
  "returns: `java.util.List<org.ansj.domain.Term>`"
  (^java.util.List [^ForeignPersonRecognition this]
    (-> this (.getNewTerms))))

(defn make-new-term
  "returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^ForeignPersonRecognition this]
    (-> this (.makeNewTerm))))

