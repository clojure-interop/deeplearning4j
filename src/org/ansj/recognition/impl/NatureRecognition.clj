(ns org.ansj.recognition.impl.NatureRecognition
  "词性标注工具类"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl NatureRecognition]))

(defn ->nature-recognition
  "Constructor.

  forests - `org.nlpcn.commons.lang.tire.domain.Forest`"
  (^NatureRecognition [^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (new NatureRecognition forests))
  (^NatureRecognition []
    (new NatureRecognition )))

(defn *guess-nature
  "通过规则 猜测词性

  word - `java.lang.String`

  returns: `org.ansj.domain.TermNatures`"
  (^org.ansj.domain.TermNatures [^java.lang.String word]
    (NatureRecognition/guessNature word)))

(defn recognition
  "传入一组。词对词语进行。词性标注

  words - `java.util.List`
  offe - `int`

  returns: `java.util.List<org.ansj.domain.Term>`"
  (^java.util.List [^NatureRecognition this ^java.util.List words ^Integer offe]
    (-> this (.recognition words offe)))
  ([^NatureRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

(defn get-term-natures
  "传入一次词语获得相关的词性

  word - `java.lang.String`

  returns: `org.ansj.domain.TermNatures`"
  (^org.ansj.domain.TermNatures [^NatureRecognition this ^java.lang.String word]
    (-> this (.getTermNatures word))))

(defn get-params
  "获取一个词语的参数

  word - `java.lang.String`

  returns: `java.lang.String[]`"
  ([^NatureRecognition this ^java.lang.String word]
    (-> this (.getParams word))))

(defn walk
  ""
  ([^NatureRecognition this]
    (-> this (.walk))))

