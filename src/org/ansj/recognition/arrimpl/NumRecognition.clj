(ns org.ansj.recognition.arrimpl.NumRecognition
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.arrimpl NumRecognition]))

(defn ->num-recognition
  "Constructor."
  (^NumRecognition []
    (new NumRecognition )))

(defn recognition
  "数字+数字合并,zheng

  terms - `org.ansj.domain.Term[]`"
  ([^NumRecognition this terms]
    (-> this (.recognition terms))))

