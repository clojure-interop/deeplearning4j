(ns org.ansj.recognition.impl.UserDicNatureRecognition
  "用户自定义词典的词性优先"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl UserDicNatureRecognition]))

(defn ->user-dic-nature-recognition
  "Constructor.

  传入多本词典，后面的会覆盖前面的结果

  forests - `org.nlpcn.commons.lang.tire.domain.Forest`"
  (^UserDicNatureRecognition [^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (new UserDicNatureRecognition forests))
  (^UserDicNatureRecognition []
    (new UserDicNatureRecognition )))

(defn *get-params
  "forest - `org.nlpcn.commons.lang.tire.domain.Forest`
  word - `java.lang.String`

  returns: `java.lang.String[]`"
  ([^org.nlpcn.commons.lang.tire.domain.Forest forest ^java.lang.String word]
    (UserDicNatureRecognition/getParams forest word)))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^UserDicNatureRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

