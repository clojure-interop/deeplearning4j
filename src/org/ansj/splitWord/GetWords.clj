(ns org.ansj.splitWord.GetWords
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord GetWords]))

(defn all-words
  "全文全词全匹配

  returns: 返还分完词后的句子 - `java.lang.String`"
  (^java.lang.String [^GetWords this]
    (-> this (.allWords))))

(defn set-str
  "同一个对象传入词语

  temp - 传入的句子 - `java.lang.String`"
  ([^GetWords this ^java.lang.String temp]
    (-> this (.setStr temp))))

(defn set-chars
  "chars - `char[]`
  start - `int`
  end - `int`"
  ([^GetWords this chars ^Integer start ^Integer end]
    (-> this (.setChars chars start end))))

(defn get-offe
  "returns: `int`"
  (^Integer [^GetWords this]
    (-> this (.getOffe))))

