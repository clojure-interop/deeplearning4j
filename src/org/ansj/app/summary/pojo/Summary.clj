(ns org.ansj.app.summary.pojo.Summary
  "摘要结构体封装"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.app.summary.pojo Summary]))

(defn ->summary
  "Constructor.

  key-words - `java.util.List`
  summary - `java.lang.String`"
  (^Summary [^java.util.List key-words ^java.lang.String summary]
    (new Summary key-words summary)))

(defn get-key-words
  "returns: `java.util.List<org.ansj.app.keyword.Keyword>`"
  (^java.util.List [^Summary this]
    (-> this (.getKeyWords))))

(defn get-summary
  "returns: `java.lang.String`"
  (^java.lang.String [^Summary this]
    (-> this (.getSummary))))

