(ns org.ansj.domain.TermNature
  "一个词里面会有一些词性"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain TermNature]))

(defn ->term-nature
  "Constructor.

  nature-str - `java.lang.String`
  frequency - `int`"
  (^TermNature [^java.lang.String nature-str ^Integer frequency]
    (new TermNature nature-str frequency)))

(def *-m
  "Static Constant.

  系统内置的几个

  type: org.ansj.domain.TermNature"
  TermNature/M)

(def *-en
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/EN)

(def *-begin
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/BEGIN)

(def *-end
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/END)

(def *-user-define
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/USER_DEFINE)

(def *-nr
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/NR)

(def *-nt
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/NT)

(def *-ns
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/NS)

(def *-nw
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/NW)

(def *-nrf
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/NRF)

(def *-null
  "Static Constant.

  type: org.ansj.domain.TermNature"
  TermNature/NULL)

(defn nature
  "Instance Field.

  type: org.ansj.domain.Nature"
  (^org.ansj.domain.Nature [^TermNature this]
    (-> this .-nature)))

(defn frequency
  "Instance Field.

  type: int"
  (^Integer [^TermNature this]
    (-> this .-frequency)))

(defn *set-nature-str-to-array
  "nature-str - `java.lang.String`

  returns: `org.ansj.domain.TermNature[]`"
  ([^java.lang.String nature-str]
    (TermNature/setNatureStrToArray nature-str)))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^TermNature this]
    (-> this (.toString))))

