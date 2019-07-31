(ns org.ansj.recognition.Recognition
  "词语结果识别接口,用来通过规则方式识别词语,对结果的二次加工"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition Recognition]))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^Recognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

