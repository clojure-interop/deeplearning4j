(ns org.ansj.app.crf.Config
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.crf Config]))

(defn ->config
  "Constructor.

  template - `int[][]`"
  (^Config [template]
    (new Config template)))

(defn split-str
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Config this]
    (-> this .-splitStr)))

(def *-tag-num
  "Static Constant.

  type: int"
  Config/TAG_NUM)

(def *-begin
  "Static Constant.

  type: char"
  Config/BEGIN)

(def *-end
  "Static Constant.

  type: char"
  Config/END)

(def *-num-begin
  "Static Constant.

  type: char"
  Config/NUM_BEGIN)

(def *-en-begin
  "Static Constant.

  type: char"
  Config/EN_BEGIN)

(def *-feature-begin
  "Static Constant.

  type: char"
  Config/FEATURE_BEGIN)

(defn *-s
  "Static Field.

  type: int"
  []
  Config/S)

(defn *-b
  "Static Field.

  type: int"
  []
  Config/B)

(defn *-m
  "Static Field.

  type: int"
  []
  Config/M)

(defn *-e
  "Static Field.

  type: int"
  []
  Config/E)

(defn *get-num
  "str - `java.lang.String`

  returns: `char`"
  (^Character [^java.lang.String str]
    (Config/getNum str)))

(defn *get-en
  "str - `java.lang.String`

  returns: `char`"
  (^Character [^java.lang.String str]
    (Config/getEn str)))

(defn *word-alert
  "词语标准化

  word - `java.lang.String`

  returns: `java.util.List<org.ansj.app.crf.pojo.Element>`"
  (^java.util.List [^java.lang.String word]
    (Config/wordAlert word)))

(defn *make-to-element-list
  "temp - `java.lang.String`
  split-str - `java.lang.String`

  returns: `java.util.List<org.ansj.app.crf.pojo.Element>`"
  (^java.util.List [^java.lang.String temp ^java.lang.String split-str]
    (Config/makeToElementList temp split-str)))

(defn *get-tag-name
  "tag - `int`

  returns: `char`"
  (^Character [^Integer tag]
    (Config/getTagName tag)))

(defn get-template
  "returns: `int[][]`"
  ([^Config this]
    (-> this (.getTemplate))))

(defn set-template
  "template - `int[][]`"
  ([^Config this template]
    (-> this (.setTemplate template))))

(defn make-to-element-list
  "temp - `java.lang.String`

  returns: `java.util.List<org.ansj.app.crf.pojo.Element>`"
  (^java.util.List [^Config this ^java.lang.String temp]
    (-> this (.makeToElementList temp))))

(defn get-name-if-out-arr
  "list - `java.util.List`
  index - `int`

  returns: `char`"
  (^Character [^Config this ^java.util.List list ^Integer index]
    (-> this (.getNameIfOutArr list index))))

(defn get-tag-if-out-arr
  "list - `java.util.List`
  index - `int`

  returns: `char`"
  (^Character [^Config this ^java.util.List list ^Integer index]
    (-> this (.getTagIfOutArr list index))))

(defn make-feature-arr
  "得到一个位置的所有特征

  list - `java.util.List`
  index - `int`

  returns: KeyValue(词语,featureLength*tagNum) - `char[][]`"
  ([^Config this ^java.util.List list ^Integer index]
    (-> this (.makeFeatureArr list index))))

