(ns org.ansj.library.DicLibrary
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.library DicLibrary]))

(defn ->dic-library
  "Constructor."
  (^DicLibrary []
    (new DicLibrary )))

(def *-default
  "Static Constant.

  type: java.lang.String"
  DicLibrary/DEFAULT)

(def *-default-nature
  "Static Constant.

  type: java.lang.String"
  DicLibrary/DEFAULT_NATURE)

(def *-default-freq
  "Static Constant.

  type: java.lang.Integer"
  DicLibrary/DEFAULT_FREQ)

(def *-default-freq-str
  "Static Constant.

  type: java.lang.String"
  DicLibrary/DEFAULT_FREQ_STR)

(defn *gets
  "根据keys获取词典集合

  keys - `java.lang.String`

  returns: `org.nlpcn.commons.lang.tire.domain.Forest[]`"
  ([^java.lang.String keys]
    (DicLibrary/gets keys)))

(defn *keys
  "returns: `java.util.Set<java.lang.String>`"
  (^java.util.Set []
    (DicLibrary/keys )))

(defn *put-if-absent
  "动态添加词典

  key - `java.lang.String`
  path - `java.lang.String`
  forest - `org.nlpcn.commons.lang.tire.domain.Forest`

  returns: `org.nlpcn.commons.lang.tire.domain.Forest`"
  (^org.nlpcn.commons.lang.tire.domain.Forest [^java.lang.String key ^java.lang.String path ^org.nlpcn.commons.lang.tire.domain.Forest forest]
    (DicLibrary/putIfAbsent key path forest))
  ([^java.lang.String key ^java.lang.String path]
    (DicLibrary/putIfAbsent key path)))

(defn *delete
  "删除关键词

  key - `java.lang.String`
  word - `java.lang.String`"
  ([^java.lang.String key ^java.lang.String word]
    (DicLibrary/delete key word)))

(defn *put
  "动态添加词典

  key - `java.lang.String`
  path - `java.lang.String`
  forest - `org.nlpcn.commons.lang.tire.domain.Forest`"
  ([^java.lang.String key ^java.lang.String path ^org.nlpcn.commons.lang.tire.domain.Forest forest]
    (DicLibrary/put key path forest))
  ([^java.lang.String key ^java.lang.String path]
    (DicLibrary/put key path)))

(defn *remove
  "key - `java.lang.String`

  returns: `org.ansj.domain.KV<java.lang.String,org.nlpcn.commons.lang.tire.domain.Forest>`"
  (^org.ansj.domain.KV [^java.lang.String key]
    (DicLibrary/remove key)))

(defn *reload
  "key - `java.lang.String`"
  ([^java.lang.String key]
    (DicLibrary/reload key)))

(defn *insert
  "关键词增加

  key - `java.lang.String`
  keyword - 所要增加的关键词 - `java.lang.String`
  nature - 关键词的词性 - `java.lang.String`
  freq - 关键词的词频 - `int`"
  ([^java.lang.String key ^java.lang.String keyword ^java.lang.String nature ^Integer freq]
    (DicLibrary/insert key keyword nature freq))
  ([^java.lang.String key ^java.lang.String keyword]
    (DicLibrary/insert key keyword)))

(defn *clear
  "将用户自定义词典清空

  key - `java.lang.String`"
  ([^java.lang.String key]
    (DicLibrary/clear key)))

(defn *get
  "根据模型名称获取crf模型

  key - `java.lang.String`

  returns: `org.nlpcn.commons.lang.tire.domain.Forest`"
  (^org.nlpcn.commons.lang.tire.domain.Forest [^java.lang.String key]
    (DicLibrary/get key))
  (^org.nlpcn.commons.lang.tire.domain.Forest []
    (DicLibrary/get )))

