(ns org.ansj.recognition.impl.IDCardRecognition
  "基于规则的新词发现，身份证号码识别"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl IDCardRecognition]))

(defn ->id-card-recognition
  "Constructor."
  (^IDCardRecognition []
    (new IDCardRecognition )))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^IDCardRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

