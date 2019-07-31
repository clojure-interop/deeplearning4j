(ns org.ansj.dic.LearnTool
  "新词发现,这是个线程安全的.所以可以多个对象公用一个"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.dic LearnTool]))

(defn ->learn-tool
  "Constructor."
  (^LearnTool []
    (new LearnTool )))

(defn is-asian-name
  "Instance Field.

  是否开启学习机

  type: boolean"
  (^Boolean [^LearnTool this]
    (-> this .-isAsianName)))

(defn is-foreign-name
  "Instance Field.

  type: boolean"
  (^Boolean [^LearnTool this]
    (-> this .-isForeignName)))

(defn count
  "Instance Field.

  告诉大家你学习了多少个词了

  type: int"
  (^Integer [^LearnTool this]
    (-> this .-count)))

(defn learn
  "公司名称学习.

  graph - `org.ansj.util.Graph`
  split-word - `org.ansj.app.crf.SplitWord`
  forests - `org.nlpcn.commons.lang.tire.domain.Forest`"
  ([^LearnTool this ^org.ansj.util.Graph graph ^org.ansj.app.crf.SplitWord split-word ^org.nlpcn.commons.lang.tire.domain.Forest forests]
    (-> this (.learn graph split-word forests))))

(defn add-term
  "增加一个新词到树中

  new-word - `org.ansj.domain.NewWord`"
  ([^LearnTool this ^org.ansj.domain.NewWord new-word]
    (-> this (.addTerm new-word))))

(defn get-forest
  "returns: `org.nlpcn.commons.lang.tire.domain.SmartForest<org.ansj.domain.NewWord>`"
  (^org.nlpcn.commons.lang.tire.domain.SmartForest [^LearnTool this]
    (-> this (.getForest))))

(defn get-top-tree
  "返回学习到的新词.

  num - 返回数目.0为全部返回 - `int`

  returns: `java.util.List<java.util.Map.Entry<java.lang.String,java.lang.Double>>`"
  (^java.util.List [^LearnTool this ^Integer num]
    (-> this (.getTopTree num)))
  (^java.util.List [^LearnTool this ^Integer num ^org.ansj.domain.Nature nature]
    (-> this (.getTopTree num nature))))

(defn active
  "尝试激活，新词

  name - `java.lang.String`"
  ([^LearnTool this ^java.lang.String name]
    (-> this (.active name))))

