(ns org.ansj.library.SynonymsLibrary
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library SynonymsLibrary]))

(defn ->synonyms-library
  "Constructor."
  (^SynonymsLibrary []
    (new SynonymsLibrary )))

(def *-default
  "Static Constant.

  type: java.lang.String"
  SynonymsLibrary/DEFAULT)

(defn *get
  "key - `java.lang.String`

  returns: `org.nlpcn.commons.lang.tire.domain.SmartForest<java.util.List<java.lang.String>>`"
  (^org.nlpcn.commons.lang.tire.domain.SmartForest [^java.lang.String key]
    (SynonymsLibrary/get key))
  (^org.nlpcn.commons.lang.tire.domain.SmartForest []
    (SynonymsLibrary/get )))

(defn *put
  "动态添加

  key - `java.lang.String`
  path - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String path]
    (SynonymsLibrary/put key path))
  ([^java.lang.String key ^java.lang.String path ^org.nlpcn.commons.lang.tire.domain.SmartForest value]
    (SynonymsLibrary/put key path value)))

(defn *remove
  "从同义词组中删除掉一个词 [中国, 中华, 我国] -> remove(我国) -> [中国, 中华]

  key - `java.lang.String`
  word - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String word]
    (SynonymsLibrary/remove key word))
  (^org.ansj.domain.KV [^java.lang.String key]
    (SynonymsLibrary/remove key)))

(defn *reload
  "刷新一个,将值设置为null

  key - `java.lang.String`"
  ([^java.lang.String key]
    (SynonymsLibrary/reload key)))

(defn *keys
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (SynonymsLibrary/keys )))

(defn *put-if-absent
  "key - `java.lang.String`
  path - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String path]
    (SynonymsLibrary/putIfAbsent key path)))

(defn *insert
  "覆盖更新同义词 [中国, 中华, 我国] -> replace([中国,华夏]) -> [中国,华夏]

  key - `java.lang.String`
  words - `java.lang.String[]`"
  ([^java.lang.String key words]
    (SynonymsLibrary/insert key words)))

(defn *append
  "合并更新同义词 覆盖更新同义词 [中国, 中华, 我国] -> append([中国,华夏]) -> [中国, 中华, 我国 , 华夏]

  key - `java.lang.String`
  words - `java.lang.String[]`"
  ([^java.lang.String key words]
    (SynonymsLibrary/append key words)))

