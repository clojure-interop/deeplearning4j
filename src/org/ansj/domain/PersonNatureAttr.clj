(ns org.ansj.domain.PersonNatureAttr
  "人名标注pojo类"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain PersonNatureAttr]))

(defn ->person-nature-attr
  "Constructor."
  (^PersonNatureAttr []
    (new PersonNatureAttr )))

(def *-null
  "Static Constant.

  type: org.ansj.domain.PersonNatureAttr"
  PersonNatureAttr/NULL)

(defn split
  "Instance Field.

  type: int"
  (^Integer [^PersonNatureAttr this]
    (-> this .-split)))

(defn begin
  "Instance Field.

  type: int"
  (^Integer [^PersonNatureAttr this]
    (-> this .-begin)))

(defn end
  "Instance Field.

  type: int"
  (^Integer [^PersonNatureAttr this]
    (-> this .-end)))

(defn all-freq
  "Instance Field.

  type: int"
  (^Integer [^PersonNatureAttr this]
    (-> this .-allFreq)))

(defn flag
  "Instance Field.

  type: boolean"
  (^Boolean [^PersonNatureAttr this]
    (-> this .-flag)))

(defn add-freq
  "设置

  index - `int`
  freq - `int`"
  ([^PersonNatureAttr this ^Integer index ^Integer freq]
    (-> this (.addFreq index freq))))

(defn get-freq
  "得道某一个位置的词频

  length - `int`
  loc - `int`

  returns: `int`"
  (^Integer [^PersonNatureAttr this ^Integer length ^Integer loc]
    (-> this (.getFreq length loc))))

(defn setloc-freq
  "词频记录表

  ints - `int[][]`"
  ([^PersonNatureAttr this ints]
    (-> this (.setlocFreq ints))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^PersonNatureAttr this]
    (-> this (.toString))))

