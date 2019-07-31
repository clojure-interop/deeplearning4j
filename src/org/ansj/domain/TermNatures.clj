(ns org.ansj.domain.TermNatures
  "每一个term都拥有一个词性集合"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain TermNatures]))

(defn ->term-natures
  "Constructor.

  构造方法.一个词对应这种玩意

  term-natures - `org.ansj.domain.TermNature[]`
  id - `int`"
  (^TermNatures [term-natures ^Integer id]
    (new TermNatures term-natures id))
  (^TermNatures [^org.ansj.domain.TermNature term-nature ^Integer all-freq ^Integer id]
    (new TermNatures term-nature all-freq id))
  (^TermNatures [^org.ansj.domain.TermNature term-nature]
    (new TermNatures term-nature)))

(def *-m
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/M)

(def *-nr
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/NR)

(def *-en
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/EN)

(def *-end
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/END)

(def *-begin
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/BEGIN)

(def *-nt
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/NT)

(def *-ns
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/NS)

(def *-nrf
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/NRF)

(def *-nw
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/NW)

(def *-null
  "Static Constant.

  type: org.ansj.domain.TermNatures"
  TermNatures/NULL)

(defn term-natures
  "Instance Field.

  关于这个term的所有词性

  type: org.ansj.domain.TermNature[]"
  ([^TermNatures this]
    (-> this .-termNatures)))

(defn num-attr
  "Instance Field.

  数字属性

  type: org.ansj.domain.NumNatureAttr"
  (^org.ansj.domain.NumNatureAttr [^TermNatures this]
    (-> this .-numAttr)))

(defn person-attr
  "Instance Field.

  人名词性

  type: org.ansj.domain.PersonNatureAttr"
  (^org.ansj.domain.PersonNatureAttr [^TermNatures this]
    (-> this .-personAttr)))

(defn nature
  "Instance Field.

  默认词性

  type: org.ansj.domain.Nature"
  (^org.ansj.domain.Nature [^TermNatures this]
    (-> this .-nature)))

(defn all-freq
  "Instance Field.

  所有的词频

  type: int"
  (^Integer [^TermNatures this]
    (-> this .-allFreq)))

(defn id
  "Instance Field.

  词的id

  type: int"
  (^Integer [^TermNatures this]
    (-> this .-id)))

(defn set-person-nature-attr
  "person-attr - `org.ansj.domain.PersonNatureAttr`"
  ([^TermNatures this ^org.ansj.domain.PersonNatureAttr person-attr]
    (-> this (.setPersonNatureAttr person-attr))))

