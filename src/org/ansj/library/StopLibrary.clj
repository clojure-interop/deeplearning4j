(ns org.ansj.library.StopLibrary
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library StopLibrary]))

(defn ->stop-library
  "Constructor."
  (^StopLibrary []
    (new StopLibrary )))

(def *-default
  "Static Constant.

  type: java.lang.String"
  StopLibrary/DEFAULT)

(defn *insert-stop-words
  "增加停用词

  key - `java.lang.String`
  stop-words - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String stop-words]
    (StopLibrary/insertStopWords key stop-words)))

(defn *keys
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (StopLibrary/keys )))

(defn *put-if-absent
  "动态添加词典

  key - `java.lang.String`
  path - `java.lang.String`
  stop-recognition - `org.ansj.recognition.impl.StopRecognition`

  returns: `org.ansj.recognition.impl.StopRecognition`"
  (^org.ansj.recognition.impl.StopRecognition [^java.lang.String key ^java.lang.String path ^org.ansj.recognition.impl.StopRecognition stop-recognition]
    (StopLibrary/putIfAbsent key path stop-recognition))
  ([^java.lang.String key ^java.lang.String path]
    (StopLibrary/putIfAbsent key path)))

(defn *put
  "动态添加词典

  key - `java.lang.String`
  path - `java.lang.String`
  stop-recognition - `org.ansj.recognition.impl.StopRecognition`"
  ([^java.lang.String key ^java.lang.String path ^org.ansj.recognition.impl.StopRecognition stop-recognition]
    (StopLibrary/put key path stop-recognition))
  ([^java.lang.String key ^java.lang.String path]
    (StopLibrary/put key path)))

(defn *insert-stop-regexes
  "正则过滤

  key - `java.lang.String`
  regexes - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String regexes]
    (StopLibrary/insertStopRegexes key regexes)))

(defn *remove
  "key - `java.lang.String`

  returns: `org.ansj.domain.KV<java.lang.String,org.ansj.recognition.impl.StopRecognition>`"
  (^org.ansj.domain.KV [^java.lang.String key]
    (StopLibrary/remove key)))

(defn *insert-stop-natures
  "词性过滤

  key - `java.lang.String`
  filter-natures - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String filter-natures]
    (StopLibrary/insertStopNatures key filter-natures)))

(defn *reload
  "key - `java.lang.String`"
  ([^java.lang.String key]
    (StopLibrary/reload key)))

(defn *get
  "根据模型名称获取crf模型

  key - `java.lang.String`

  returns: `org.ansj.recognition.impl.StopRecognition`"
  (^org.ansj.recognition.impl.StopRecognition [^java.lang.String key]
    (StopLibrary/get key))
  (^org.ansj.recognition.impl.StopRecognition []
    (StopLibrary/get )))

