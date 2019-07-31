(ns org.ansj.app.summary.SummaryComputer
  "自动摘要,同时返回关键词"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.summary SummaryComputer]))

(defn ->summary-computer
  "Constructor.

  len - `int`
  is-split-summary - `boolean`
  title - `java.lang.String`
  content - `java.lang.String`"
  (^SummaryComputer [^Integer len ^Boolean is-split-summary ^java.lang.String title ^java.lang.String content]
    (new SummaryComputer len is-split-summary title content))
  (^SummaryComputer [^Integer len ^java.lang.String title ^java.lang.String content]
    (new SummaryComputer len title content))
  (^SummaryComputer [^java.lang.String title ^java.lang.String content]
    (new SummaryComputer title content)))

(defn to-summary
  "根据用户查询串计算摘要

  query - `java.lang.String`

  returns: `org.ansj.app.summary.pojo.Summary`"
  (^org.ansj.app.summary.pojo.Summary [^SummaryComputer this ^java.lang.String query]
    (-> this (.toSummary query)))
  (^org.ansj.app.summary.pojo.Summary [^SummaryComputer this]
    (-> this (.toSummary))))

(defn to-sentence-list
  "chars - `char[]`

  returns: `java.util.List<org.ansj.app.summary.SummaryComputer$Sentence>`"
  (^java.util.List [^SummaryComputer this chars]
    (-> this (.toSentenceList chars))))

