(ns org.ansj.app.keyword.KeyWordComputer
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.keyword KeyWordComputer]))

(defn ->key-word-computer
  "Constructor.

  返回关键词个数

  n-keyword - `int`"
  (^KeyWordComputer [^Integer n-keyword]
    (new KeyWordComputer n-keyword))
  (^KeyWordComputer [^Integer n-keyword analysis-type]
    (new KeyWordComputer n-keyword analysis-type))
  (^KeyWordComputer []
    (new KeyWordComputer )))

(defn set-analysis-type
  "analysis-type - `T`"
  ([^KeyWordComputer this analysis-type]
    (-> this (.setAnalysisType analysis-type))))

(defn compute-article-tfidf
  "只有正文

  content - `java.lang.String`

  returns: `java.util.List<org.ansj.app.keyword.Keyword>`"
  (^java.util.List [^KeyWordComputer this ^java.lang.String content]
    (-> this (.computeArticleTfidf content)))
  (^java.util.List [^KeyWordComputer this ^java.lang.String title ^java.lang.String content]
    (-> this (.computeArticleTfidf title content))))

