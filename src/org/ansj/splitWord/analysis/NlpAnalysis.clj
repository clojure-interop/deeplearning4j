(ns org.ansj.splitWord.analysis.NlpAnalysis
  "自然语言分词,具有未登录词发现功能。建议在自然语言理解中用。搜索中不要用"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.splitWord.analysis NlpAnalysis]))

(defn ->nlp-analysis
  "Constructor.

  reader - `java.io.Reader`"
  (^NlpAnalysis [^java.io.Reader reader]
    (new NlpAnalysis reader))
  (^NlpAnalysis []
    (new NlpAnalysis )))

(defn *rule-word?
  "判断新词识别出来的词是否可信

  word - `java.lang.String`

  returns: `boolean`"
  (^Boolean [^java.lang.String word]
    (NlpAnalysis/isRuleWord word)))

(defn *parse
  "str - `java.lang.String`
  forests - `org.nlpcn.commons.lang.tire.domain.Forest`

  returns: `org.ansj.domain.Result`"
  (^org.ansj.domain.Result [^java.lang.String str ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (NlpAnalysis/parse str forests))
  (^org.ansj.domain.Result [^java.lang.String str]
    (NlpAnalysis/parse str)))

(defn set-crf-model
  "split-word - `org.ansj.app.crf.SplitWord`

  returns: `org.ansj.splitWord.analysis.NlpAnalysis`"
  (^org.ansj.splitWord.analysis.NlpAnalysis [^NlpAnalysis this ^org.ansj.app.crf.SplitWord split-word]
    (-> this (.setCrfModel split-word))))

(defn set-learn-tool
  "learn - `org.ansj.dic.LearnTool`

  returns: `org.ansj.splitWord.analysis.NlpAnalysis`"
  (^org.ansj.splitWord.analysis.NlpAnalysis [^NlpAnalysis this ^org.ansj.dic.LearnTool learn]
    (-> this (.setLearnTool learn))))

