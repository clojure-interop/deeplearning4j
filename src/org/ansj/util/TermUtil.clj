(ns org.ansj.util.TermUtil
  "term的操作类"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util TermUtil]))

(defn ->term-util
  "Constructor."
  (^TermUtil []
    (new TermUtil )))

(defn *make-new-term-num
  "将两个term合并为一个全新的term

  from - `org.ansj.domain.Term`
  to - `org.ansj.domain.Term`
  term-natures - `org.ansj.domain.TermNatures`

  returns: `org.ansj.domain.Term`"
  (^org.ansj.domain.Term [^org.ansj.domain.Term from ^org.ansj.domain.Term to ^org.ansj.domain.TermNatures term-natures]
    (TermUtil/makeNewTermNum from to term-natures)))

(defn *term-link
  "from - `org.ansj.domain.Term`
  to - `org.ansj.domain.Term`"
  ([^org.ansj.domain.Term from ^org.ansj.domain.Term to]
    (TermUtil/termLink from to)))

(defn *insert-term
  "将一个term插入到链表中的对应位置中, 如果这个term已经存在参照type type 0.跳过 1. 替换 2.累积分值 保证顺序,由大到小

  terms - `org.ansj.domain.Term[]`
  term - `org.ansj.domain.Term`
  type - `org.ansj.util.TermUtil$InsertTermType`"
  ([terms ^org.ansj.domain.Term term ^org.ansj.util.TermUtil$InsertTermType type]
    (TermUtil/insertTerm terms term type)))

(defn *insert-term-num
  "terms - `org.ansj.domain.Term[]`
  term - `org.ansj.domain.Term`"
  ([terms ^org.ansj.domain.Term term]
    (TermUtil/insertTermNum terms term)))

(defn *parse-nature
  "得到细颗粒度的分词，并且确定词性

  term - `org.ansj.domain.Term`"
  ([^org.ansj.domain.Term term]
    (TermUtil/parseNature term)))

(defn *get-sub-term
  "从from到to生成subterm

  from - `org.ansj.domain.Term`
  to - `org.ansj.domain.Term`

  returns: `java.util.List<org.ansj.domain.Term>`"
  (^java.util.List [^org.ansj.domain.Term from ^org.ansj.domain.Term to]
    (TermUtil/getSubTerm from to)))

