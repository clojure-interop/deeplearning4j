(ns org.ansj.recognition.impl.BookRecognition
  "基于规则的新词发现 jijiang feidiao"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl BookRecognition]))

(defn ->book-recognition
  "Constructor."
  (^BookRecognition []
    (new BookRecognition )))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^BookRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

