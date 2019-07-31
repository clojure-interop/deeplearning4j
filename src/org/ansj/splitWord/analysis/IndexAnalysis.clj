(ns org.ansj.splitWord.analysis.IndexAnalysis
  "用于检索的分词方式"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord.analysis IndexAnalysis]))

(defn ->index-analysis
  "Constructor.

  reader - `java.io.Reader`"
  (^IndexAnalysis [^java.io.Reader reader]
    (new IndexAnalysis reader))
  (^IndexAnalysis []
    (new IndexAnalysis )))

(defn *parse
  "str - `java.lang.String`
  forests - `org.nlpcn.commons.lang.tire.domain.Forest`

  returns: `org.ansj.domain.Result`"
  (^org.ansj.domain.Result [^java.lang.String str ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (IndexAnalysis/parse str forests))
  (^org.ansj.domain.Result [^java.lang.String str]
    (IndexAnalysis/parse str)))

