(ns org.ansj.domain.Result
  "分词结果的一个封装"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain Result]))

(defn ->result
  "Constructor.

  terms - `java.util.List`"
  (^Result [^java.util.List terms]
    (new Result terms)))

(defn get-terms
  "returns: `java.util.List<org.ansj.domain.Term>`"
  (^java.util.List [^Result this]
    (-> this (.getTerms))))

(defn set-terms
  "terms - `java.util.List`"
  ([^Result this ^java.util.List terms]
    (-> this (.setTerms terms))))

(defn iterator
  "returns: `java.util.Iterator<org.ansj.domain.Term>`"
  (^java.util.Iterator [^Result this]
    (-> this (.iterator))))

(defn size
  "returns: `int`"
  (^Integer [^Result this]
    (-> this (.size))))

(defn get
  "index - `int`

  returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^Result this ^Integer index]
    (-> this (.get index))))

(defn recognition
  "调用一个发现引擎

  re - `org.ansj.recognition.Recognition`

  returns: `org.ansj.domain.Result`"
  (^org.ansj.domain.Result [^Result this ^org.ansj.recognition.Recognition re]
    (-> this (.recognition re))))

(defn to-string
  "split - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^Result this ^java.lang.String split]
    (-> this (.toString split)))
  (^java.lang.String [^Result this]
    (-> this (.toString))))

(defn to-string-with-out-nature
  "返回没有词性的切分结果

  split - `java.lang.String`

  returns: `java.lang.String`"
  (^java.lang.String [^Result this ^java.lang.String split]
    (-> this (.toStringWithOutNature split)))
  (^java.lang.String [^Result this]
    (-> this (.toStringWithOutNature))))

