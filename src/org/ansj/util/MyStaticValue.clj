(ns org.ansj.util.MyStaticValue
  "这个类储存一些公用变量."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util MyStaticValue]))

(defn ->my-static-value
  "Constructor."
  (^MyStaticValue []
    (new MyStaticValue )))

(def *-log
  "Static Constant.

  type: org.nlpcn.commons.lang.util.logging.Log"
  MyStaticValue/LOG)

(defn *-is-name-recognition
  "Static Field.

  type: java.lang.Boolean"
  []
  MyStaticValue/isNameRecognition)

(defn *-is-num-recognition
  "Static Field.

  type: java.lang.Boolean"
  []
  MyStaticValue/isNumRecognition)

(defn *-is-quantifier-recognition
  "Static Field.

  type: java.lang.Boolean"
  []
  MyStaticValue/isQuantifierRecognition)

(defn *-is-real-name
  "Static Field.

  type: java.lang.Boolean"
  []
  MyStaticValue/isRealName)

(defn *-is-skip-user-define
  "Static Field.

  是否用户辞典不加载相同的词

  type: boolean"
  []
  MyStaticValue/isSkipUserDefine)

(def *-env
  "Static Constant.

  type: java.util.Map<java.lang.String,java.lang.String>"
  MyStaticValue/ENV)

(defn *put-library
  "增加一个词典

  key - `java.lang.String`
  path - `java.lang.String`
  value - `java.lang.Object`"
  ([^java.lang.String key ^java.lang.String path ^java.lang.Object value]
    (MyStaticValue/putLibrary key path value))
  ([^java.lang.String key ^java.lang.String path]
    (MyStaticValue/putLibrary key path)))

(defn *get-nature-class-suffix
  "得道姓名单字的词频词典

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getNatureClassSuffix )))

(defn *get-log
  "clazz - `java.lang.Class`

  returns: `org.nlpcn.commons.lang.util.logging.Log`"
  (^org.nlpcn.commons.lang.util.logging.Log [^java.lang.Class clazz]
    (MyStaticValue/getLog clazz)))

(defn *get-nature-table-reader
  "词性关联表

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getNatureTableReader )))

(defn *remove-library
  "删除一个词典

  key - `java.lang.String`"
  ([^java.lang.String key]
    (MyStaticValue/removeLibrary key)))

(defn *get-person-freq-map
  "名字词性对象反序列化

  returns: `java.util.Map<java.lang.String,int[][]>`"
  ([]
    (MyStaticValue/getPersonFreqMap )))

(defn *get-compan-reader
  "机构名词典

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getCompanReader )))

(defn *init-bigram-tables
  "词与词之间的关联表数据"
  ([]
    (MyStaticValue/initBigramTables )))

(defn *reload-library
  "重置一个词典

  key - `java.lang.String`"
  ([^java.lang.String key]
    (MyStaticValue/reloadLibrary key)))

(defn *get-english-reader
  "英文词典

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getEnglishReader )))

(defn *get-person-freq-reader
  "根据词语后缀判断词性

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getPersonFreqReader )))

(defn *get-new-word-reader
  "机构名词典

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getNewWordReader )))

(defn *get-number-reader
  "数字词典

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getNumberReader )))

(defn *get-arrays-reader
  "核心词典

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getArraysReader )))

(defn *get-nature-map-reader
  "词性表

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getNatureMapReader )))

(defn *get-person-reader
  "人名词典

  returns: `java.io.BufferedReader`"
  (^java.io.BufferedReader []
    (MyStaticValue/getPersonReader )))

