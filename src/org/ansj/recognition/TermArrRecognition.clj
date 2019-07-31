(ns org.ansj.recognition.TermArrRecognition
  "词语识别接口,用来识别词语"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition TermArrRecognition]))

(defn recognition
  "terms - `org.ansj.domain.Term[]`"
  ([^TermArrRecognition this terms]
    (-> this (.recognition terms))))

