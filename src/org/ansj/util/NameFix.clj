(ns org.ansj.util.NameFix
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util NameFix]))

(defn ->name-fix
  "Constructor."
  (^NameFix []
    (new NameFix )))

(defn *name-ambiguity
  "人名消歧,比如.邓颖超生前->邓颖 超生 前 fix to 丁颖超 生 前! 规则的方式增加如果两个人名之间连接是- ， ·，•则连接

  terms - `org.ansj.domain.Term[]`
  forests - `org.nlpcn.commons.lang.tire.domain.Forest`"
  ([terms ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (NameFix/nameAmbiguity terms forests)))

