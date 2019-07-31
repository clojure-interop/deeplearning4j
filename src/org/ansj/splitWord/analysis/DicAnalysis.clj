(ns org.ansj.splitWord.analysis.DicAnalysis
  "默认用户自定义词性优先"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord.analysis DicAnalysis]))

(defn ->dic-analysis
  "Constructor.

  reader - `java.io.Reader`"
  (^DicAnalysis [^java.io.Reader reader]
    (new DicAnalysis reader))
  (^DicAnalysis []
    (new DicAnalysis )))

(defn *parse
  "str - `java.lang.String`
  forests - `org.nlpcn.commons.lang.tire.domain.Forest`

  returns: `org.ansj.domain.Result`"
  (^org.ansj.domain.Result [^java.lang.String str ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (DicAnalysis/parse str forests))
  (^org.ansj.domain.Result [^java.lang.String str]
    (DicAnalysis/parse str)))

