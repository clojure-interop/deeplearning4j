(ns org.ansj.recognition.impl.StopRecognition
  "对结果增加过滤,支持词性过滤,和词语过滤."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.recognition.impl StopRecognition]))

(defn ->stop-recognition
  "Constructor."
  (^StopRecognition []
    (new StopRecognition )))

(defn insert-stop-words
  "批量增加停用词

  filter-words - `java.util.Collection`

  returns: `org.ansj.recognition.impl.StopRecognition`"
  (^org.ansj.recognition.impl.StopRecognition [^StopRecognition this ^java.util.Collection filter-words]
    (-> this (.insertStopWords filter-words))))

(defn insert-stop-natures
  "批量增加停用词性 比如 增加nr 后.人名将不在结果中

  stop-natures - `java.lang.String`"
  ([^StopRecognition this ^java.lang.String stop-natures]
    (-> this (.insertStopNatures stop-natures))))

(defn insert-stop-regexes
  "增加正则表达式过滤

  regexes - `java.lang.String`"
  ([^StopRecognition this ^java.lang.String regexes]
    (-> this (.insertStopRegexes regexes))))

(defn recognition
  "result - `org.ansj.domain.Result`"
  ([^StopRecognition this ^org.ansj.domain.Result result]
    (-> this (.recognition result))))

(defn filter
  "判断一个词语是否停用..

  term - `org.ansj.domain.Term`

  returns: `boolean`"
  (^Boolean [^StopRecognition this ^org.ansj.domain.Term term]
    (-> this (.filter term))))

(defn clear
  ""
  ([^StopRecognition this]
    (-> this (.clear))))

