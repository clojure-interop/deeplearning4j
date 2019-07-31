(ns org.ansj.recognition.impl.TimeRecognition
  "时间识别抽取"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl TimeRecognition]))

(defn ->time-recognition
  "Constructor."
  (^TimeRecognition []
    (new TimeRecognition )))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^TimeRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

