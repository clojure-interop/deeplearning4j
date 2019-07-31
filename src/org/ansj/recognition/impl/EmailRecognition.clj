(ns org.ansj.recognition.impl.EmailRecognition
  "电子邮箱抽取"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl EmailRecognition]))

(defn ->email-recognition
  "Constructor."
  (^EmailRecognition []
    (new EmailRecognition )))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^EmailRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

