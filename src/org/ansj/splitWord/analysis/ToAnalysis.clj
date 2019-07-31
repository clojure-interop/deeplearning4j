(ns org.ansj.splitWord.analysis.ToAnalysis
  "标准分词"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord.analysis ToAnalysis]))

(defn ->to-analysis
  "Constructor.

  reader - `java.io.Reader`"
  (^ToAnalysis [^java.io.Reader reader]
    (new ToAnalysis reader))
  (^ToAnalysis []
    (new ToAnalysis )))

(defn *parse
  "str - `java.lang.String`
  forests - `org.nlpcn.commons.lang.tire.domain.Forest`

  returns: `org.ansj.domain.Result`"
  (^org.ansj.domain.Result [^java.lang.String str ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (ToAnalysis/parse str forests))
  (^org.ansj.domain.Result [^java.lang.String str]
    (ToAnalysis/parse str)))

