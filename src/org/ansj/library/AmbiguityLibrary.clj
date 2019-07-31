(ns org.ansj.library.AmbiguityLibrary
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library AmbiguityLibrary]))

(defn ->ambiguity-library
  "Constructor."
  (^AmbiguityLibrary []
    (new AmbiguityLibrary )))

(def *-default
  "Static Constant.

  type: java.lang.String"
  AmbiguityLibrary/DEFAULT)

(defn *get
  "根据key获取

  key - `java.lang.String`

  returns: `org.nlpcn.commons.lang.tire.domain.Forest`"
  (^org.nlpcn.commons.lang.tire.domain.Forest [^java.lang.String key]
    (AmbiguityLibrary/get key))
  (^org.nlpcn.commons.lang.tire.domain.Forest []
    (AmbiguityLibrary/get )))

(defn *insert
  "插入到树中呀

  key - `java.lang.String`
  split - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String split]
    (AmbiguityLibrary/insert key split)))

(defn *put
  "动态添加

  key - `java.lang.String`
  path - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String path]
    (AmbiguityLibrary/put key path))
  ([^java.lang.String key ^java.lang.String path ^org.nlpcn.commons.lang.tire.domain.Forest value]
    (AmbiguityLibrary/put key path value)))

(defn *remove
  "删除一个key

  key - `java.lang.String`

  returns: `org.ansj.domain.KV<java.lang.String,org.nlpcn.commons.lang.tire.domain.Forest>`"
  (^org.ansj.domain.KV [^java.lang.String key]
    (AmbiguityLibrary/remove key)))

(defn *reload
  "刷新一个,将值设置为null

  key - `java.lang.String`"
  ([^java.lang.String key]
    (AmbiguityLibrary/reload key)))

(defn *keys
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (AmbiguityLibrary/keys )))

(defn *put-if-absent
  "key - `java.lang.String`
  path - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String path]
    (AmbiguityLibrary/putIfAbsent key path)))

