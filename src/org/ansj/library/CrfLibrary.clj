(ns org.ansj.library.CrfLibrary
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library CrfLibrary]))

(defn ->crf-library
  "Constructor."
  (^CrfLibrary []
    (new CrfLibrary )))

(def *-default
  "Static Constant.

  type: java.lang.String"
  CrfLibrary/DEFAULT)

(defn *get
  "根据key获取crf分词器

  key - `java.lang.String`

  returns: crf分词器 - `org.ansj.app.crf.SplitWord`"
  (^org.ansj.app.crf.SplitWord [^java.lang.String key]
    (CrfLibrary/get key))
  (^org.ansj.app.crf.SplitWord []
    (CrfLibrary/get )))

(defn *put
  "动态添加

  key - `java.lang.String`
  path - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String path]
    (CrfLibrary/put key path))
  ([^java.lang.String key ^java.lang.String path ^org.ansj.app.crf.SplitWord sw]
    (CrfLibrary/put key path sw)))

(defn *remove
  "删除一个key

  key - `java.lang.String`

  returns: `org.ansj.domain.KV<java.lang.String,org.ansj.app.crf.SplitWord>`"
  (^org.ansj.domain.KV [^java.lang.String key]
    (CrfLibrary/remove key)))

(defn *reload
  "刷新一个,将值设置为null

  key - `java.lang.String`"
  ([^java.lang.String key]
    (CrfLibrary/reload key)))

(defn *keys
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (CrfLibrary/keys )))

(defn *put-if-absent
  "key - `java.lang.String`
  path - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String path]
    (CrfLibrary/putIfAbsent key path)))

