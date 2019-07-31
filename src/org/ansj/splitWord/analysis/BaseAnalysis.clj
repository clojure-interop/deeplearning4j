(ns org.ansj.splitWord.analysis.BaseAnalysis
  "基本的分词.只做了.ngram模型.和数字发现.其他一律不管"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord.analysis BaseAnalysis]))

(defn ->base-analysis
  "Constructor.

  reader - `java.io.Reader`"
  (^BaseAnalysis [^java.io.Reader reader]
    (new BaseAnalysis reader))
  (^BaseAnalysis []
    (new BaseAnalysis )))

(defn *parse
  "str - `java.lang.String`

  returns: `org.ansj.domain.Result`"
  (^org.ansj.domain.Result [^java.lang.String str]
    (BaseAnalysis/parse str)))

