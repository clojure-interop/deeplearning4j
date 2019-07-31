(ns org.ansj.util.Graph
  "最短路径"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.util Graph]))

(defn ->graph
  "Constructor.

  str - `java.lang.String`"
  (^Graph [^java.lang.String str]
    (new Graph str)))

(defn chars
  "Instance Field.

  type: char[]"
  ([^Graph this]
    (-> this .-chars)))

(defn real-str
  "Instance Field.

  type: java.lang.String"
  (^java.lang.String [^Graph this]
    (-> this .-realStr)))

(defn terms
  "Instance Field.

  type: org.ansj.domain.Term[]"
  ([^Graph this]
    (-> this .-terms)))

(defn has-person
  "Instance Field.

  type: boolean"
  (^Boolean [^Graph this]
    (-> this .-hasPerson)))

(defn has-num
  "Instance Field.

  type: boolean"
  (^Boolean [^Graph this]
    (-> this .-hasNum)))

(defn get-result
  "构建最优路径

  merger - `org.ansj.splitWord.Analysis$Merger`

  returns: `java.util.List<org.ansj.domain.Term>`"
  (^java.util.List [^Graph this ^org.ansj.splitWord.Analysis$Merger merger]
    (-> this (.getResult merger))))

(defn add-term
  "增加一个词语到图中

  term - `org.ansj.domain.Term`"
  ([^Graph this ^org.ansj.domain.Term term]
    (-> this (.addTerm term))))

(defn rm-little-path
  "删除最短的节点"
  ([^Graph this]
    (-> this (.rmLittlePath))))

(defn rm-little-single-path
  "删除无意义的节点,防止viterbi太多"
  ([^Graph this]
    (-> this (.rmLittleSinglePath))))

(defn rm-little-path-by-score
  "删除小节点。保证被删除的小节点的单个分数小于等于大节点的分数"
  ([^Graph this]
    (-> this (.rmLittlePathByScore))))

(defn walk-path-by-score
  ""
  ([^Graph this]
    (-> this (.walkPathByScore))))

(defn walk-path
  "干涉性增加相对权重

  relation-map - `java.util.Map`"
  ([^Graph this ^java.util.Map relation-map]
    (-> this (.walkPath relation-map)))
  ([^Graph this]
    (-> this (.walkPath))))

(defn print-graph
  "对graph进行调试用的"
  ([^Graph this]
    (-> this (.printGraph))))

